package pe.edu.tecsup.reportesmodasa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroAccidente4 extends AppCompatActivity {
    Button btnSiguiente;
    EditText nroRegistro;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente4);
        getSupportActionBar().hide();

        btnSiguiente=findViewById(R.id.btnSiguiente);
        nroRegistro=findViewById(R.id.nroRegistro);
        c1=findViewById(R.id.C1);
        c2=findViewById(R.id.C2);
        c3=findViewById(R.id.C3);
        c4=findViewById(R.id.C4);
        c5=findViewById(R.id.C5);
        c6=findViewById(R.id.C6);
        c7=findViewById(R.id.C7);
        c8=findViewById(R.id.C8);
        c9=findViewById(R.id.C9);

        SharedPreferences pref=getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();


        String codigo=pref.getString("codigo","");

        nroRegistro.setText(codigo);



        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c1.isChecked()==true){
                    editor.putString("c1",c1.getText().toString());
                    editor.commit();
                }if(c2.isChecked()==true){
                    editor.putString("c2",c2.getText().toString());
                    editor.commit();
                }if(c3.isChecked()==true){
                    editor.putString("c3",c3.getText().toString());
                    editor.commit();
                }if(c4.isChecked()==true){
                    editor.putString("c4",c4.getText().toString());
                    editor.commit();
                }if(c5.isChecked()==true){
                    editor.putString("c5",c5.getText().toString());
                    editor.commit();
                }if(c6.isChecked()==true){
                    editor.putString("c6",c6.getText().toString());
                    editor.commit();
                }if(c7.isChecked()==true){
                    editor.putString("c7",c7.getText().toString());
                    editor.commit();
                }if(c8.isChecked()==true) {
                    editor.putString("c8", c8.getText().toString());
                    editor.commit();
                }if(c9.isChecked()==true){
                    editor.putString("c9",c9.getText().toString());
                    editor.commit();
                }if(!c1.isChecked()==true){
                    editor.remove("c1").commit();
                }if(!c2.isChecked()==true){
                    editor.remove("c2").commit();
                }if(!c3.isChecked()==true){
                    editor.remove("c3").commit();
                }if(!c4.isChecked()==true){
                    editor.remove("c4").commit();
                }if(!c5.isChecked()==true){
                    editor.remove("c5").commit();
                }if(!c6.isChecked()==true){
                    editor.remove("c6").commit();
                }if(!c7.isChecked()==true){
                    editor.remove("c7").commit();
                }if(!c8.isChecked()==true) {
                    editor.remove("c8").commit();
                }if(!c9.isChecked()==true){
                    editor.remove("c9").commit();
                }

                if(c1.isChecked()==true||c2.isChecked()==true||c3.isChecked()==true||c4.isChecked()==true||c5.isChecked()==true||c6.isChecked()==true||c7.isChecked()==true||c8.isChecked()==true||c9.isChecked()==true) {
                        startActivity(new Intent(getApplicationContext(),RegistroAccidente5.class));
                        finish();
                }else{
                    Toast.makeText(RegistroAccidente4.this, "Seleccione al menos una opción", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}