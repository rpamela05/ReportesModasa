package pe.edu.tecsup.reportesmodasa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegistroAccidente2 extends AppCompatActivity {
    Button btnSiguiente;
    EditText nroRegistro,txtA_Fecha,txtA_Hora,txtI_Fecha,txtI_Hora,txtLugar,txtDiasDescanso,txtTrabajadoresAf,txtDescripcion;
    RadioButton a1,a2,a3,i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente2);
        getSupportActionBar().hide();

        btnSiguiente=findViewById(R.id.btnSiguiente);
        nroRegistro=findViewById(R.id.nroRegistro);
        txtA_Fecha=findViewById(R.id.txtA_Fecha);
        txtA_Hora=findViewById(R.id.txtA_Hora);
        txtI_Fecha=findViewById(R.id.txtI_Fecha);
        txtI_Hora=findViewById(R.id.txtI_Hora);
        txtLugar=findViewById(R.id.txtLugar);
        txtDiasDescanso=findViewById(R.id.txtDiasDescanso);
        txtTrabajadoresAf=findViewById(R.id.txtTrabajadoresAf);
        txtDescripcion=findViewById(R.id.txtDescripcion);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);


        txtA_Fecha.setInputType(InputType.TYPE_NULL);
        txtA_Hora.setInputType(InputType.TYPE_NULL);
        txtI_Fecha.setInputType(InputType.TYPE_NULL);
        txtI_Hora.setInputType(InputType.TYPE_NULL);

        SharedPreferences pref=getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();

        String codigo=pref.getString("codigo","");

        nroRegistro.setText(codigo);

        txtA_Fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog(txtA_Fecha);
            }
        });
        txtA_Hora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimeDialog(txtA_Hora);
            }
        });
        txtI_Fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog2(txtI_Fecha);
            }
        });
        txtI_Hora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimeDialog2(txtI_Hora);
            }
        });



        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("fechaAccidente",txtA_Fecha.getText().toString());
                editor.putString("HoraAccidente",txtA_Hora.getText().toString());
                editor.putString("fechaInvestigacion",txtI_Fecha.getText().toString());
                editor.putString("HoraInvestigacion",txtI_Hora.getText().toString());
                editor.putString("lugarAccidente",txtLugar.getText().toString());
                editor.putString("diasDescanso",txtDiasDescanso.getText().toString());
                editor.putString("nroTrabajadores",txtTrabajadoresAf.getText().toString());
                editor.putString("descripcion",txtDescripcion.getText().toString());

                if (txtA_Hora.getText().toString().isEmpty() || txtA_Fecha.getText().toString().isEmpty()&&txtI_Hora.getText().toString().isEmpty() || txtI_Fecha.getText().toString().isEmpty() || txtLugar.getText().toString().isEmpty() ||
                        txtDiasDescanso.getText().toString().isEmpty()  || txtTrabajadoresAf.getText().toString().isEmpty() || txtDescripcion.getText().toString().isEmpty()){
                    Toast.makeText(RegistroAccidente2.this, "Rellene los datos", Toast.LENGTH_SHORT).show();
                }else{
                    if((a1.isChecked()==true || a2.isChecked()==true || a3.isChecked()==true) && (i1.isChecked()==true || i2.isChecked()==true || i3.isChecked()==true || i4.isChecked()==true)) {
                        if(a1.isChecked()==true){
                            editor.putString("gravedadAccidente",a1.getText().toString());
                            editor.commit();
                        }if(a2.isChecked()==true){
                            editor.putString("gravedadAccidente",a2.getText().toString());
                            editor.commit();
                        }if(a3.isChecked()==true){
                            editor.putString("gravedadAccidente",a3.getText().toString());
                            editor.commit();
                        }if(i1.isChecked()==true){
                            editor.putString("gradoIncidente",i1.getText().toString());
                            editor.commit();
                        }if(i2.isChecked()==true){
                            editor.putString("gradoIncidente",i2.getText().toString());
                            editor.commit();
                        }if(i3.isChecked()==true){
                            editor.putString("gradoIncidente",i3.getText().toString());
                            editor.commit();
                        }if(i4.isChecked()==true){
                            editor.putString("gradoIncidente",i4.getText().toString());
                            editor.commit();
                        }

                        editor.commit();
                        startActivity(new Intent(getApplicationContext(), RegistroAccidente3.class));
                        finish();
                    }else{
                        Toast.makeText(RegistroAccidente2.this, "Seleccione una opción", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }


    private void showTimeDialog2(EditText txtI_hora) {
        Calendar calendar=Calendar.getInstance();
        TimePickerDialog.OnTimeSetListener timeSetListener=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                calendar.set(Calendar.HOUR_OF_DAY,hourOfDay);
                calendar.set(Calendar.MINUTE,minute);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm");
                txtI_hora.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new TimePickerDialog(RegistroAccidente2.this, timeSetListener,calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),false).show();

    }

    private void showDateDialog2(EditText txtI_fecha) {
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
                txtI_fecha.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new DatePickerDialog(this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();

    }

    private void showTimeDialog(EditText txtA_hora) {
        Calendar calendar=Calendar.getInstance();
        TimePickerDialog.OnTimeSetListener timeSetListener=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                calendar.set(Calendar.HOUR_OF_DAY,hourOfDay);
                calendar.set(Calendar.MINUTE,minute);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm");
                txtA_hora.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new TimePickerDialog(RegistroAccidente2.this, timeSetListener,calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),false).show();
    }

    private void showDateDialog(EditText txtA_fecha) {
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
                txtA_fecha.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
    new DatePickerDialog(this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

}