package pe.edu.tecsup.reportesmodasa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegistroAccidente extends AppCompatActivity {

    Button btnSiguiente,btnBuscar;
    EditText txtDNI,txtEdad,txtNombres,txtArea,txtPuesto,txtSexo,txtContrato,txtExperiencia,nroRegistro,txtTurno,txtHoras_trabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente);
        getSupportActionBar().hide();

        txtDNI=findViewById(R.id.txtDNI);
        txtEdad=findViewById(R.id.txtEdad);
        txtNombres=findViewById(R.id.txtNombres);
        txtArea=findViewById(R.id.txtArea);
        txtPuesto=findViewById(R.id.txtPuesto);
        txtSexo=findViewById(R.id.txtSexo);
        txtContrato=findViewById(R.id.txtContrato);
        txtExperiencia=findViewById(R.id.txtExperiencia);
        nroRegistro=findViewById(R.id.nroRegistro);
        txtTurno=findViewById(R.id.txtTurno);
        txtHoras_trabajo=findViewById(R.id.txtHoras_trabajo);

        btnSiguiente=findViewById(R.id.btnSiguiente);
        btnBuscar=findViewById(R.id.btnBuscar);


        DatabaseReference databaseReference;
        databaseReference= FirebaseDatabase.getInstance().getReference();

        SharedPreferences preferences=getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();



        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("trabajadores").child(txtDNI.getText().toString()).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String edad=snapshot.child("EDAD").getValue().toString();
                            String nombres=snapshot.child("APELLIDOS Y NOMBRES").getValue().toString();
                            String area=snapshot.child("AREA").getValue().toString();
                            String puesto=snapshot.child("CARGO").getValue().toString();
                            String sexo=snapshot.child("SEXO").getValue().toString();
                            String contrato=snapshot.child("TIPO CONT").getValue().toString();
                            String experiencia=snapshot.child("TIEMPO SERV").getValue().toString();
                            txtEdad.setText(edad);
                            txtNombres.setText(nombres);
                            txtArea.setText(area);
                            txtPuesto.setText(puesto);
                            txtSexo.setText(sexo);
                            txtContrato.setText(contrato);
                            txtExperiencia.setText(experiencia);
                            editor.putString("dni",txtDNI.getText().toString());
                            editor.putString("edad",edad);
                            editor.putString("nombres",nombres);
                            editor.putString("area",area);
                            editor.putString("puesto",puesto);
                            editor.putString("sexo",sexo);
                            editor.putString("contrato",contrato);
                            editor.putString("experiencia",experiencia);
                            editor.commit();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                    }
                });
            }
        });



        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("turno",txtTurno.getText().toString());
                editor.putString("horas",txtHoras_trabajo.getText().toString());
                editor.putString("codigo",nroRegistro.getText().toString());
                editor.commit();
                startActivity(new Intent(getApplicationContext(),RegistroAccidente2.class));
                finish();

            }
        });

    }
}