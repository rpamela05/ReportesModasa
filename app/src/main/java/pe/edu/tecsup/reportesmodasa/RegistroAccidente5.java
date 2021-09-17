package pe.edu.tecsup.reportesmodasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroAccidente5 extends AppCompatActivity {
    Button btnSiguiente;
    EditText nroRegistro;
    CheckBox AS1,AS2,AS3,AS4,AS5,AS6,AS7,AS8,AS9,AS10,AS11,AS12,AS13,AS14,AS15,CS1,CS2,CS3,CS4,CS5,CS6,CS7,CS8,CS9,CS10,CS11,CS12,CS13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente5);
        getSupportActionBar().hide();

        btnSiguiente=findViewById(R.id.btnSiguiente);
        nroRegistro=findViewById(R.id.nroRegistro);

        CS1=findViewById(R.id.CS1);
        CS2=findViewById(R.id.CS2);
        CS3=findViewById(R.id.CS3);
        CS4=findViewById(R.id.CS4);
        CS5=findViewById(R.id.CS5);
        CS6=findViewById(R.id.CS6);
        CS7=findViewById(R.id.CS7);
        CS8=findViewById(R.id.CS8);
        CS9=findViewById(R.id.CS9);
        CS10=findViewById(R.id.CS10);
        CS11=findViewById(R.id.CS11);
        CS12=findViewById(R.id.CS12);
        CS13=findViewById(R.id.CS13);

        AS1=findViewById(R.id.AS1);
        AS2=findViewById(R.id.AS2);
        AS3=findViewById(R.id.AS3);
        AS4=findViewById(R.id.AS4);
        AS5=findViewById(R.id.AS5);
        AS6=findViewById(R.id.AS6);
        AS7=findViewById(R.id.AS7);
        AS8=findViewById(R.id.AS8);
        AS9=findViewById(R.id.AS9);
        AS10=findViewById(R.id.AS10);
        AS11=findViewById(R.id.AS11);
        AS12=findViewById(R.id.AS12);
        AS13=findViewById(R.id.AS13);
        AS14=findViewById(R.id.AS14);
        AS15=findViewById(R.id.AS15);

        SharedPreferences pref=getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();

        String codigo=pref.getString("codigo","");

        nroRegistro.setText(codigo);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("codigo",nroRegistro.getText().toString());
                if(AS1.isChecked()==true){
                    editor.putString("AS1",AS1.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS2.isChecked()==true){
                    editor.putString("AS2",AS2.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS3.isChecked()==true){
                    editor.putString("AS3",AS3.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS4.isChecked()==true){
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.putString("AS4",AS4.getText().toString());
                    editor.commit();
                }if(AS5.isChecked()==true){
                    editor.putString("AS5",AS5.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS6.isChecked()==true){
                    editor.putString("AS6",AS6.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS7.isChecked()==true){
                    editor.putString("AS7",AS7.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS8.isChecked()==true) {
                    editor.putString("AS8.", AS8.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS9.isChecked()==true){
                    editor.putString("AS9",AS9.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }
                if(AS10.isChecked()==true){
                    editor.putString("AS10",AS10.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }
                if(AS11.isChecked()==true){
                    editor.putString("AS11",AS11.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS12.isChecked()==true){
                    editor.putString("AS12",AS12.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS13.isChecked()==true){
                    editor.putString("AS13",AS13.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS14.isChecked()==true){
                    editor.putString("AS14",AS14.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(AS14.isChecked()==true){
                    editor.putString("AS15",AS15.getText().toString());
                    editor.putString("CIoD","ACTOS SUB-ESTÁNDARES/INSEGUROS");
                    editor.commit();
                }if(CS1.isChecked()==true){
                    editor.putString("CS01",CS1.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS2.isChecked()==true){
                    editor.putString("CS02",CS2.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS3.isChecked()==true){
                    editor.putString("CS03",CS3.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS4.isChecked()==true){
                    editor.putString("CS04",CS4.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS5.isChecked()==true){
                    editor.putString("CS05",CS5.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS6.isChecked()==true){
                    editor.putString("CS06",CS6.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS7.isChecked()==true){
                    editor.putString("CS07",CS7.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS8.isChecked()==true) {
                    editor.putString("CS08.", CS8.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS9.isChecked()==true){
                    editor.putString("CS9",CS9.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }
                if(CS10.isChecked()==true){
                    editor.putString("CS10",CS10.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }
                if(CS11.isChecked()==true){
                    editor.putString("CS11",CS11.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS12.isChecked()==true){
                    editor.putString("CS12",CS12.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }if(CS13.isChecked()==true){
                    editor.putString("CS13",CS13.getText().toString());
                    editor.putString("CIoD","CONDICIONES SUBESTANDAR / INSEGURAS");
                    editor.commit();
                }

                if(!AS1.isChecked()==true){
                    editor.remove("AS1").commit();
                    editor.remove("CIoD").commit();
                }if(!AS2.isChecked()==true){
                    editor.remove("AS2").commit();
                    editor.remove("CIoD").commit();
                }if(!AS3.isChecked()==true){
                    editor.remove("AS3").commit();
                    editor.remove("CIoD").commit();
                }if(!AS4.isChecked()==true){
                    editor.remove("AS4").commit();
                    editor.remove("CIoD").commit();
                }if(!AS5.isChecked()==true){
                    editor.remove("AS5").commit();
                    editor.remove("CIoD").commit();
                }if(!AS6.isChecked()==true){
                    editor.remove("AS6").commit();
                    editor.remove("CIoD").commit();
                }if(!AS7.isChecked()==true){
                    editor.remove("AS7").commit();
                    editor.remove("CIoD").commit();
                }if(!AS8.isChecked()==true) {
                    editor.remove("AS8").commit();
                    editor.remove("CIoD").commit();
                }if(!AS9.isChecked()==true){
                    editor.remove("AS9").commit();
                    editor.remove("CIoD").commit();
                }
                if(!AS10.isChecked()==true){
                    editor.remove("AS10").commit();
                    editor.remove("CIoD").commit();
                }
                if(!AS11.isChecked()==true){
                    editor.remove("AS11").commit();
                    editor.remove("CIoD").commit();
                }if(!AS12.isChecked()==true){
                    editor.remove("AS12").commit();
                    editor.remove("CIoD").commit();
                }if(!AS13.isChecked()==true){
                    editor.remove("AS13").commit();
                    editor.remove("CIoD").commit();
                }if(!AS14.isChecked()==true){
                    editor.remove("AS14").commit();
                    editor.remove("CIoD").commit();
                }if(!CS1.isChecked()==true){
                    editor.remove("CS01").commit();
                    editor.remove("CIoD").commit();
                }if(!CS2.isChecked()==true){
                    editor.remove("CS02").commit();
                    editor.remove("CIoD").commit();
                }if(!CS3.isChecked()==true){
                    editor.remove("CS03").commit();
                    editor.remove("CIoD").commit();
                }if(!CS4.isChecked()==true){
                    editor.remove("CS04").commit();
                    editor.remove("CIoD").commit();
                }if(!CS5.isChecked()==true){
                    editor.remove("CS05").commit();
                    editor.remove("CIoD").commit();
                }if(!CS6.isChecked()==true){
                    editor.remove("CS06").commit();
                    editor.remove("CIoD").commit();
                }if(!CS7.isChecked()==true){
                    editor.remove("CS07").commit();
                    editor.remove("CIoD").commit();
                }if(!CS8.isChecked()==true) {
                    editor.remove("CS08").commit();
                    editor.remove("CIoD").commit();
                }if(!CS9.isChecked()==true){
                    editor.remove("CS9").commit();
                    editor.remove("CIoD").commit();
                }
                if(!CS10.isChecked()==true){
                    editor.remove("CS10").commit();
                    editor.remove("CIoD").commit();
                }
                if(!CS11.isChecked()==true){
                    editor.remove("CS11").commit();
                    editor.remove("CIoD").commit();
                }if(!CS12.isChecked()==true){
                    editor.remove("CS12").commit();
                    editor.remove("CIoD").commit();
                }if(!CS13.isChecked()==true){
                    editor.remove("CS13").commit();
                    editor.remove("CIoD").commit();
                }

                if((AS1.isChecked()==true||AS2.isChecked()==true||AS3.isChecked()==true||AS4.isChecked()==true||AS5.isChecked()==true||AS6.isChecked()==true||
                        AS7.isChecked()==true||AS8.isChecked()==true||AS9.isChecked()==true||AS11.isChecked()==true||AS12.isChecked()==true
                        ||AS13.isChecked()==true||AS14.isChecked()==true)||(CS1.isChecked()==true||CS2.isChecked()==true||CS3.isChecked()==true
                        ||CS4.isChecked()==true||CS5.isChecked()==true||CS6.isChecked()==true||CS7.isChecked()==true||CS8.isChecked()==true||CS9.isChecked()==true
                        ||CS10.isChecked()==true||CS11.isChecked()==true||CS12.isChecked()==true||CS13.isChecked()==true)) {
                    startActivity(new Intent(getApplicationContext(),RegistroAccidente06.class));
                    finish();
                }else{
                    Toast.makeText(RegistroAccidente5.this, "Seleccione al menos una opción", Toast.LENGTH_SHORT).show();
                }





            }
        });
    }
}