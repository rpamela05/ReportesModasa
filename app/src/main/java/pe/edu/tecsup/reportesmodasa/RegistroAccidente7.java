package pe.edu.tecsup.reportesmodasa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


public class RegistroAccidente7 extends AppCompatActivity {
    Button btnSiguiente;
    TextView tx1, tx2,tx3,tx4,tx5;
    EditText rp1,rp2,rp3,rp4,rp5,fa1,fa2,fa3,fa4,fa5;
    EditText nroRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente7);
        getSupportActionBar().hide();
        SharedPreferences pref= getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        DatabaseReference databaseReference;
        databaseReference= FirebaseDatabase.getInstance().getReference();
        btnSiguiente=findViewById(R.id.btnSiguiente);
        nroRegistro = findViewById(R.id.nroRegistro);
        String codigo = pref.getString("codigo", "");

        nroRegistro.setText(codigo);


        tx1=findViewById(R.id.tx1);
        tx2=findViewById(R.id.tx2);
        tx3=findViewById(R.id.tx3);
        tx4=findViewById(R.id.tx4);
        tx5=findViewById(R.id.tx5);

        rp1=findViewById(R.id.rp1);
        rp2=findViewById(R.id.rp2);
        rp3=findViewById(R.id.rp3);
        rp4=findViewById(R.id.rp4);
        rp5=findViewById(R.id.rp5);

        fa1=findViewById(R.id.fa1);
        fa2=findViewById(R.id.fa2);
        fa3=findViewById(R.id.fa3);
        fa4=findViewById(R.id.fa4);
        fa5=findViewById(R.id.fa5);

        fa1.setInputType(InputType.TYPE_NULL);
        fa2.setInputType(InputType.TYPE_NULL);
        fa3.setInputType(InputType.TYPE_NULL);
        fa4.setInputType(InputType.TYPE_NULL);
        fa5.setInputType(InputType.TYPE_NULL);


        String LA1=pref.getString("LA1","");
        String LA2=pref.getString("LA2","");
        String LA3=pref.getString("LA3","");
        String LA4=pref.getString("LA4","");
        String LA5=pref.getString("LA5","");
        String LA6=pref.getString("LA6","");
        String LA7=pref.getString("LA7","");
        String LA8=pref.getString("LA8","");
        String LA9=pref.getString("LA9","");
        String LA10=pref.getString("LA10","");
        String LA11=pref.getString("LA11","");
        String LA12=pref.getString("LA12","");
        String LA13=pref.getString("LA13","");
        String EG1=pref.getString("EG1","");
        String EG2=pref.getString("EG2","");
        String EG3=pref.getString("EG3","");
        String EG4=pref.getString("EG4","");
        String EG5=pref.getString("EG5","");
        String EG6=pref.getString("EG6","");
        String IP1=pref.getString("IP1","");
        String IP2=pref.getString("IP2","");
        String IP3=pref.getString("IP3","");
        String IP4=pref.getString("IP4","");
        String IP5=pref.getString("IP5","");
        String IP6=pref.getString("IP6","");
        String IP7=pref.getString("IP7","");
        String IP8=pref.getString("IP8","");
        String IP9=pref.getString("IP9","");
        String AP1=pref.getString("AP1","");
        String AP2=pref.getString("AP2","");
        String AP3=pref.getString("AP3","");
        String AP4=pref.getString("AP4","");
        String AP5=pref.getString("AP5","");
        String AP6=pref.getString("AP6","");
        String IA1=pref.getString("IA1","");
        String IA2=pref.getString("IA2","");
        String IA3=pref.getString("IA3","");
        String IA4=pref.getString("IA4","");
        String IA5=pref.getString("IA5","");
        String IA6=pref.getString("IA6","");
        String IA7=pref.getString("IA7","");
        String IA8=pref.getString("IA8","");
        String IA9=pref.getString("IA9","");
        String OT1=pref.getString("OT1","");
        String OT2=pref.getString("OT2","");
        String OT3=pref.getString("OT3","");
        String OT4=pref.getString("OT4","");
        String OT5=pref.getString("OT5","");
        String OT6=pref.getString("OT6","");
        String PE1=pref.getString("PE1","");
        String PE2=pref.getString("PE2","");
        String PE3=pref.getString("PE3","");
        String PE4=pref.getString("PE4","");
        String PE5=pref.getString("PE5","");
        String PE6=pref.getString("PE6","");
        String PE7=pref.getString("PE7","");
        String PE8=pref.getString("PE8","");
        String PE9=pref.getString("PE9","");
        String PE10=pref.getString("PE10","");
        String PE11=pref.getString("PE11","");
        String PE12=pref.getString("PE12","");
        String PE13=pref.getString("PE13","");
        String PE14=pref.getString("PE14","");
        String RC1=pref.getString("RC1","");
        String RC2=pref.getString("RC2","");
        String RC3=pref.getString("RC3","");
        String RC4=pref.getString("RC4","");
        String RC5=pref.getString("RC5","");
        String RC6=pref.getString("RC6","");
        String RC7=pref.getString("RC7","");
        String AA1=pref.getString("AA1","");
        String AA2=pref.getString("AA2","");
        String AA3=pref.getString("AA3","");
        String AA4=pref.getString("AA4","");
        String AA5=pref.getString("AA5","");
        String EP1=pref.getString("EP1","");
        String EP2=pref.getString("EP2","");
        String EP3=pref.getString("EP3","");
        String EPP1=pref.getString("EPP1","");
        String EPP2=pref.getString("EPP2","");
        String EPP3=pref.getString("EPP3","");
        String EPP4=pref.getString("EPP4","");
        String CS1=pref.getString("CS1","");
        String CS2=pref.getString("CS2","");
        String CS3=pref.getString("CS3","");
        String CS4=pref.getString("CS4","");
        String CS5=pref.getString("CS5","");
        String CS6=pref.getString("CS6","");
        String CS7=pref.getString("CS7","");
        String CS8=pref.getString("CS8","");
        String SE1=pref.getString("SE1","");
        String SE2=pref.getString("SE2","");
        String SE3=pref.getString("SE3","");
        String SE4=pref.getString("SE4","");
        String SE5=pref.getString("SE5","");
        String CI1=pref.getString("CI1","");
        String CI2=pref.getString("CI2","");
        String CI3=pref.getString("CI3","");
        String CP1=pref.getString("CP1","");
        String CP2=pref.getString("CP2","");
        String CP3=pref.getString("CP3","");
        String RG1=pref.getString("RG1","");
        String RG2=pref.getString("RG2","");
        String RG3=pref.getString("RG3","");
        String RG4=pref.getString("RG4","");
        String PG1=pref.getString("PG1","");
        String PG2=pref.getString("PG2","");
        String PG3=pref.getString("PG3","");
        String PG4=pref.getString("PG4","");
        String PG5=pref.getString("PG5","");
        String PG6=pref.getString("PG6","");
        String PG7=pref.getString("PG7","");
        String PG8=pref.getString("PG8","");
        String CCP1=pref.getString("CCP1","");
        String CCP2=pref.getString("CCP2","");
        String CCP3=pref.getString("CCP3","");
        String CCP4=pref.getString("CCP4","");
        String CC1=pref.getString("CC1","");
        String CC2=pref.getString("CC2","");
        String SF1=pref.getString("SF1","");
        String SF2=pref.getString("SF2","");
        ArrayList opcodes = new ArrayList();
        opcodes.add(LA1);
        opcodes.add(LA2);
        opcodes.add(LA3);
        opcodes.add(LA4);
        opcodes.add(LA5);
        opcodes.add(LA6);
        opcodes.add(LA7);
        opcodes.add(LA8);
        opcodes.add(LA9);
        opcodes.add(LA10);
        opcodes.add(LA11);
        opcodes.add(LA12);
        opcodes.add(LA13);
        opcodes.add(EG1);
        opcodes.add(EG2);
        opcodes.add(EG3);
        opcodes.add(EG4);
        opcodes.add(EG5);
        opcodes.add(EG6);
        opcodes.add(IP1);
        opcodes.add(IP2);
        opcodes.add(IP3);
        opcodes.add(IP4);
        opcodes.add(IP5);
        opcodes.add(IP6);
        opcodes.add(IP7);
        opcodes.add(IP8);
        opcodes.add(IP9);
        opcodes.add(AP1);
        opcodes.add(AP2);
        opcodes.add(AP3);
        opcodes.add(AP4);
        opcodes.add(AP5);
        opcodes.add(AP6);
        opcodes.add(IA1);
        opcodes.add(IA2);
        opcodes.add(IA3);
        opcodes.add(IA4);
        opcodes.add(IA5);
        opcodes.add(IA6);
        opcodes.add(IA7);
        opcodes.add(IA8);
        opcodes.add(IA9);
        opcodes.add(OT1);
        opcodes.add(OT2);
        opcodes.add(OT3);
        opcodes.add(OT4);
        opcodes.add(OT5);
        opcodes.add(OT6);
        opcodes.add(PE1);
        opcodes.add(PE2);
        opcodes.add(PE3);
        opcodes.add(PE4);
        opcodes.add(PE5);
        opcodes.add(PE6);
        opcodes.add(PE7);
        opcodes.add(PE8);
        opcodes.add(PE9);
        opcodes.add(PE10);
        opcodes.add(PE11);
        opcodes.add(PE12);
        opcodes.add(PE13);
        opcodes.add(PE14);
        opcodes.add(RC1);
        opcodes.add(RC2);
        opcodes.add(RC3);
        opcodes.add(RC4);
        opcodes.add(RC5);
        opcodes.add(RC6);
        opcodes.add(RC7);
        opcodes.add(AA1);
        opcodes.add(AA2);
        opcodes.add(AA3);
        opcodes.add(AA4);
        opcodes.add(AA5);
        opcodes.add(EP1);
        opcodes.add(EP2);
        opcodes.add(EP3);
        opcodes.add(EPP1);
        opcodes.add(EPP2);
        opcodes.add(EPP3);
        opcodes.add(EPP4);
        opcodes.add(CS1);
        opcodes.add(CS2);
        opcodes.add(CS3);
        opcodes.add(CS4);
        opcodes.add(CS5);
        opcodes.add(CS6);
        opcodes.add(CS7);
        opcodes.add(CS8);
        opcodes.add(SE1);
        opcodes.add(SE2);
        opcodes.add(SE3);
        opcodes.add(SE4);
        opcodes.add(SE5);
        opcodes.add(CI1);
        opcodes.add(CI2);
        opcodes.add(CI3);
        opcodes.add(CP1);
        opcodes.add(CP2);
        opcodes.add(CP3);
        opcodes.add(RG1);
        opcodes.add(RG2);
        opcodes.add(RG3);
        opcodes.add(RG4);
        opcodes.add(PG1);
        opcodes.add(PG2);
        opcodes.add(PG3);
        opcodes.add(PG4);
        opcodes.add(PG5);
        opcodes.add(PG6);
        opcodes.add(PG7);
        opcodes.add(PG8);
        opcodes.add(CCP1);
        opcodes.add(CCP2);
        opcodes.add(CCP3);
        opcodes.add(CCP4);
        opcodes.add(CC1);
        opcodes.add(CC2);
        opcodes.add(SF1);
        opcodes.add(SF2);

        ArrayList cleanList = new ArrayList();
        for(int i=0; i<opcodes.size();i++){
            if (opcodes.get(i) == ""){

            }else{
                cleanList.add(opcodes.get(i));
            }
        }

        if(cleanList.size()<1){

        }else{
            tx1.setText(cleanList.get(0).toString());
        }


        if(cleanList.size()<2){

        }else{
            tx2.setText(cleanList.get(1).toString());
        }


        if(cleanList.size()<3){

        }else{
            tx3.setText(cleanList.get(2).toString());
        }


        if(cleanList.size()<4){

        }else{
            tx4.setText(cleanList.get(3).toString());
        }


        if(cleanList.size()<5){

        }else{
            tx5.setText(cleanList.get(4).toString());
        }

        fa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog(fa1);
            }
        });
        fa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog2(fa2);
            }
        });
        fa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog3(fa3);
            }
        });
        fa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog4(fa4);
            }
        });
        fa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog5(fa5);
            }
        });

        String CS01=pref.getString("CS01","");
        String CS02=pref.getString("CS02","");
        String CS03=pref.getString("CS03","");
        String CS04=pref.getString("CS04","");
        String CS05=pref.getString("CS05","");
        String CS06=pref.getString("CS06","");
        String CS07=pref.getString("CS07","");
        String CS08=pref.getString("CS08","");
        String CS9=pref.getString("CS9","");
        String CS10=pref.getString("CS10","");
        String CS11=pref.getString("CS11","");
        String CS12=pref.getString("CS12","");
        String CS13=pref.getString("CS13","");
        String AS1=pref.getString("AS1","");
        String AS2=pref.getString("AS2","");
        String AS3=pref.getString("AS3","");
        String AS4=pref.getString("AS4","");
        String AS5=pref.getString("AS5","");
        String AS6=pref.getString("AS6","");
        String AS7=pref.getString("AS7","");
        String AS8=pref.getString("AS8","");
        String AS9=pref.getString("AS9","");
        String AS10=pref.getString("AS10","");
        String AS11=pref.getString("AS11","");
        String AS12=pref.getString("AS12","");
        String AS13=pref.getString("AS13","");
        String AS14=pref.getString("AS14","");
        String AS15=pref.getString("AS15","");
        ArrayList opciones1 = new ArrayList();
        ArrayList opciones2 = new ArrayList();
        opciones1.add(CS01);
        opciones1.add(CS02);
        opciones1.add(CS03);
        opciones1.add(CS04);
        opciones1.add(CS05);
        opciones1.add(CS06);
        opciones1.add(CS07);
        opciones1.add(CS08);
        opciones1.add(CS9);
        opciones1.add(CS10);
        opciones1.add(CS11);
        opciones1.add(CS12);
        opciones1.add(CS13);
        opciones2.add(AS1);
        opciones2.add(AS2);
        opciones2.add(AS3);
        opciones2.add(AS4);
        opciones2.add(AS5);
        opciones2.add(AS6);
        opciones2.add(AS7);
        opciones2.add(AS8);
        opciones2.add(AS9);
        opciones2.add(AS10);
        opciones2.add(AS11);
        opciones2.add(AS12);
        opciones2.add(AS13);
        opciones2.add(AS14);
        opciones2.add(AS15);


        ArrayList CondicionesSubEst = new ArrayList();

        ArrayList ActosSubEst = new ArrayList();

        for(int i=0; i<opciones2.size();i++){
            if (opciones2.get(i) == ""){

            }else{
                ActosSubEst.add(opciones2.get(i));
            }
        }

        for(int i=0; i<opciones1.size();i++){
            if (opciones1.get(i) == ""){

            }else{
                CondicionesSubEst.add(opciones1.get(i));
            }
        }

        String CF1=pref.getString("CF1","");
        String CF2=pref.getString("CF2","");
        String CF3=pref.getString("CF3","");
        String CF4=pref.getString("CF4","");
        String CF5=pref.getString("CF5","");
        String CF6=pref.getString("CF6","");
        String CF7=pref.getString("CF7","");
        String CF8=pref.getString("CF8","");
        String CF9=pref.getString("CF9","");
        String CF10=pref.getString("CF10","");
        String CM1=pref.getString("CM1","");
        String CM2=pref.getString("CM2","");
        String CM3=pref.getString("CM3","");
        String CM4=pref.getString("CM4","");
        String CM5=pref.getString("CM5","");
        String CM6=pref.getString("CM6","");
        String CM7=pref.getString("CM7","");
        String CM8=pref.getString("CM8","");
        String CM9=pref.getString("CM9","");
        String CM10=pref.getString("CM10","");
        String CM11=pref.getString("CM11","");
        String TF1=pref.getString("TF1","");
        String TF2=pref.getString("TF2","");
        String TF3=pref.getString("TF3","");
        String TF4=pref.getString("TF4","");
        String TF5=pref.getString("TF5","");
        String TF6=pref.getString("TF6","");
        String TF7=pref.getString("TF7","");
        String TF8=pref.getString("TF8","");
        String TF9=pref.getString("TF9","");
        String TF10=pref.getString("TF10","");
        String TF11=pref.getString("TF11","");
        String TM1=pref.getString("TM1","");
        String TM2=pref.getString("TM2","");
        String TM3=pref.getString("TM3","");
        String TM4=pref.getString("TM4","");
        String TM5=pref.getString("TM5","");
        String TM6=pref.getString("TM6","");
        String TM7=pref.getString("TM7","");
        String TM8=pref.getString("TM8","");
        String TM9=pref.getString("TM9","");
        String TM10=pref.getString("TM10","");
        String TM11=pref.getString("TM11","");
        String FC1=pref.getString("FC1","");
        String FC2=pref.getString("FC2","");
        String FC3=pref.getString("FC3","");
        String FC4=pref.getString("FC4","");
        String FC5=pref.getString("FC5","");
        String FH1=pref.getString("FH1","");
        String FH2=pref.getString("FH2","");
        String FH3=pref.getString("FH3","");
        String FH4=pref.getString("FH4","");
        String FH5=pref.getString("FH5","");
        String MI1=pref.getString("MI1","");
        String MI2=pref.getString("MI2","");
        String MI3=pref.getString("MI3","");
        String MI4=pref.getString("MI4","");
        String MI5=pref.getString("MI5","");
        String MI6=pref.getString("MI6","");
        String MI7=pref.getString("MI7","");
        String MI8=pref.getString("MI8","");
        String MI9=pref.getString("MI9","");
        String MI10=pref.getString("MI10","");
        String MI11=pref.getString("MI11","");
        String MI12=pref.getString("MI12","");
        String MI13=pref.getString("MI13","");
        String MI14=pref.getString("MI14","");
        String SI1=pref.getString("SI1","");
        String SI2=pref.getString("SI2","");
        String SI3=pref.getString("SI3","");
        String SI4=pref.getString("SI4","");
        String SI5=pref.getString("SI5","");
        String SI6=pref.getString("SI6","");
        String SI7=pref.getString("SI7","");
        String SI8=pref.getString("SI8","");
        String SI9=pref.getString("SI9","");
        String SI10=pref.getString("SI10","");
        String SI11=pref.getString("SI11","");
        String SI12=pref.getString("SI12","");
        String SI13=pref.getString("SI13","");
        String II1=pref.getString("II1","");
        String II2=pref.getString("II2","");
        String II3=pref.getString("II3","");
        String II4=pref.getString("II4","");
        String II5=pref.getString("II5","");
        String II6=pref.getString("II6","");
        String II7=pref.getString("II7","");
        String II8=pref.getString("II8","");
        String CI01=pref.getString("CI1","");
        String CI02=pref.getString("CI2","");
        String CI03=pref.getString("CI3","");
        String CI04=pref.getString("CI4","");
        String CI05=pref.getString("CI5","");
        String CI06=pref.getString("CI6","");
        String CI07=pref.getString("CI7","");
        String CI08=pref.getString("CI8","");
        String CI09=pref.getString("CI9","");
        String CI010=pref.getString("CI10","");
        String CI011=pref.getString("CI11","");
        String CI012=pref.getString("CI12","");
        String PI1=pref.getString("PI1","");
        String PI2=pref.getString("PI2","");
        String PI3=pref.getString("PI3","");
        String PI4=pref.getString("PI4","");
        String RI1=pref.getString("RI1","");
        String RI2=pref.getString("RI2","");
        String RI3=pref.getString("RI3","");
        String RI4=pref.getString("RI4","");
        String HE1=pref.getString("HE1","");
        String HE2=pref.getString("HE2","");
        String HE3=pref.getString("HE3","");
        String HE4=pref.getString("HE4","");
        String HE5=pref.getString("HE5","");
        String HE6=pref.getString("HE6","");
        String HE7=pref.getString("HE7","");
        String ET1=pref.getString("ET1","");
        String ET2=pref.getString("ET2","");
        String ET3=pref.getString("ET3","");
        String ET4=pref.getString("ET4","");
        String CE1=pref.getString("CE1","");
        String CE2=pref.getString("CE2","");
        String CE3=pref.getString("CE3","");
        String CE4=pref.getString("CE4","");
        String CE5=pref.getString("CE5","");
        String ME1=pref.getString("ME1","");
        String ME2=pref.getString("ME2","");
        String ME3=pref.getString("ME3","");
        String ME4=pref.getString("ME4","");
        String DE1=pref.getString("DE1","");
        String DE2=pref.getString("DE2","");
        String DE3=pref.getString("DE3","");
        String DE4=pref.getString("DE4","");
        String DE5=pref.getString("DE5","");
        String DE6=pref.getString("DE6","");
        String DE7=pref.getString("DE7","");
        String CIC1=pref.getString("CIC1","");
        String CIC2=pref.getString("CIC2","");
        String CIN1=pref.getString("CIN1","");
        String CIN2=pref.getString("CIN2","");
        ArrayList opciones3 = new ArrayList();
        ArrayList opciones4 = new ArrayList();
        opciones3.add(CF1);
        opciones3.add(CF2);
        opciones3.add(CF3);
        opciones3.add(CF4);
        opciones3.add(CF5);
        opciones3.add(CF6);
        opciones3.add(CF7);
        opciones3.add(CF8);
        opciones3.add(CF9);
        opciones3.add(CF10);
        opciones3.add(CM1);
        opciones3.add(CM2);
        opciones3.add(CM3);
        opciones3.add(CM4);
        opciones3.add(CM5);
        opciones3.add(CM6);
        opciones3.add(CM7);
        opciones3.add(CM8);
        opciones3.add(CM9);
        opciones3.add(CM10);
        opciones3.add(CM11);
        opciones3.add(TF1);
        opciones3.add(TF2);
        opciones3.add(TF3);
        opciones3.add(TF4);
        opciones3.add(TF5);
        opciones3.add(TF6);
        opciones3.add(TF7);
        opciones3.add(TF8);
        opciones3.add(TF9);
        opciones3.add(TF10);
        opciones3.add(TF11);
        opciones3.add(TM1);
        opciones3.add(TM2);
        opciones3.add(TM3);
        opciones3.add(TM4);
        opciones3.add(TM5);
        opciones3.add(TM6);
        opciones3.add(TM7);
        opciones3.add(TM8);
        opciones3.add(TM9);
        opciones3.add(TM10);
        opciones3.add(TM11);
        opciones3.add(FC1);
        opciones3.add(FC2);
        opciones3.add(FC3);
        opciones3.add(FC4);
        opciones3.add(FC5);
        opciones3.add(FH1);
        opciones3.add(FH2);
        opciones3.add(FH3);
        opciones3.add(FH4);
        opciones3.add(FH5);
        opciones3.add(MI1);
        opciones3.add(MI2);
        opciones3.add(MI3);
        opciones3.add(MI4);
        opciones3.add(MI5);
        opciones3.add(MI6);
        opciones3.add(MI7);
        opciones3.add(MI8);
        opciones3.add(MI9);
        opciones3.add(MI10);
        opciones3.add(MI11);
        opciones3.add(MI12);
        opciones3.add(MI13);
        opciones3.add(MI14);
        opciones4.add(SI1);
        opciones4.add(SI2);
        opciones4.add(SI3);
        opciones4.add(SI4);
        opciones4.add(SI5);
        opciones4.add(SI6);
        opciones4.add(SI7);
        opciones4.add(SI8);
        opciones4.add(SI9);
        opciones4.add(SI10);
        opciones4.add(SI11);
        opciones4.add(SI12);
        opciones4.add(SI13);
        opciones4.add(II1);
        opciones4.add(II2);
        opciones4.add(II3);
        opciones4.add(II4);
        opciones4.add(II5);
        opciones4.add(II6);
        opciones4.add(II7);
        opciones4.add(II8);
        opciones4.add(CI01);
        opciones4.add(CI02);
        opciones4.add(CI03);
        opciones4.add(CI04);
        opciones4.add(CI05);
        opciones4.add(CI06);
        opciones4.add(CI07);
        opciones4.add(CI08);
        opciones4.add(CI09);
        opciones4.add(CI010);
        opciones4.add(CI011);
        opciones4.add(CI012);
        opciones4.add(PI1);
        opciones4.add(PI2);
        opciones4.add(PI3);
        opciones4.add(PI4);
        opciones4.add(RI1);
        opciones4.add(RI2);
        opciones4.add(RI3);
        opciones4.add(RI4);
        opciones4.add(HE1);
        opciones4.add(HE2);
        opciones4.add(HE3);
        opciones4.add(HE4);
        opciones4.add(HE5);
        opciones4.add(HE6);
        opciones4.add(HE7);
        opciones4.add(ET1);
        opciones4.add(ET2);
        opciones4.add(ET3);
        opciones4.add(ET4);
        opciones4.add(CE1);
        opciones4.add(CE2);
        opciones4.add(CE3);
        opciones4.add(CE4);
        opciones4.add(CE5);
        opciones4.add(ME1);
        opciones4.add(ME2);
        opciones4.add(ME3);
        opciones4.add(ME4);
        opciones4.add(DE1);
        opciones4.add(DE2);
        opciones4.add(DE3);
        opciones4.add(DE4);
        opciones4.add(DE5);
        opciones4.add(DE6);
        opciones4.add(DE7);
        opciones4.add(CIC1);
        opciones4.add(CIC2);
        opciones4.add(CIN1);
        opciones4.add(CIN2);
        ArrayList FactPersonales = new ArrayList();
        ArrayList FactLaborales = new ArrayList();

        for(int i=0; i<opciones3.size();i++){
            if (opciones3.get(i) == ""){

            }else{
                FactPersonales.add(opciones3.get(i));
            }
        }

        for(int i=0; i<opciones4.size();i++){
            if (opciones4.get(i) == ""){

            }else{
                FactLaborales.add(opciones4.get(i));
            }
        }

      


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RegistroAccidente10.class));
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("codigo",nroRegistro.getText().toString());
                String responsable1=rp1.getText().toString();
                String responsable2=rp2.getText().toString();
                String responsable3=rp3.getText().toString();
                String responsable4=rp4.getText().toString();
                String responsable5=rp5.getText().toString();
                String fechaCor1=fa1.getText().toString();
                String fechaCor2=fa2.getText().toString();
                String fechaCor3=fa3.getText().toString();
                String fechaCor4=fa4.getText().toString();
                String fechaCor5=fa5.getText().toString();
                editor.putString("responsable1",responsable1);
                editor.putString("responsable2",responsable2);
                editor.putString("responsable3",responsable3);
                editor.putString("responsable4",responsable4);
                editor.putString("responsable5",responsable5);

                editor.putString("fechaCor1",fechaCor1);
                editor.putString("fechaCor2",fechaCor2);
                editor.putString("fechaCor3",fechaCor3);
                editor.putString("fechaCor4",fechaCor4);
                editor.putString("fechaCor5",fechaCor5);

                editor.commit();

                String dni=pref.getString("dni","");
                String turno=pref.getString("turno","");
                String horas=pref.getString("horas","");
                String codigo=pref.getString("codigo","");

                String fechaAccidente=pref.getString("fechaAccidente","");
                String HoraAccidente=pref.getString("HoraAccidente","");
                String fechaInvestigacion=pref.getString("fechaInvestigacion","");
                String lugarAccidente=pref.getString("lugarAccidente","");
                String gravedadAccidente=pref.getString("gravedadAccidente","");
                String gradoIncidente=pref.getString("gradoIncidente","");
                String diasDescanso=pref.getString("diasDescanso","");
                String nroTrabajadores=pref.getString("nroTrabajadores","");
                String descripcionCuerpo=pref.getString("descripcion","");

                String Descripcion=pref.getString("edtDescripcion","");

                String AccImg1=pref.getString("AccImg1","");
                String AccImg2=pref.getString("AccImg2","");
                String AccImg3=pref.getString("AccImg3","");

                guardarDatos(dni,turno,horas,codigo,fechaAccidente,HoraAccidente,fechaInvestigacion,lugarAccidente,gravedadAccidente,gradoIncidente,
                        diasDescanso,nroTrabajadores,descripcionCuerpo,Descripcion,AccImg1,AccImg2,AccImg3,responsable1,
                        responsable2, responsable3,responsable4,responsable5,fechaCor1,fechaCor2,fechaCor3,fechaCor4,fechaCor5, databaseReference);

                DatabaseReference cadena=databaseReference.child("Formulario").child(dni);

                cadena.child("CondicionesSubEst").setValue(CondicionesSubEst);
                cadena.child("ActosSubEst").setValue(ActosSubEst);
                cadena.child("FactPersonales").setValue(FactPersonales);
                cadena.child("FactLaborales").setValue(FactLaborales);
                cadena.child("NAC").setValue(cleanList);

                startActivity(new Intent(getApplicationContext(), RegistroAccidente12.class));
                finish();


            }
        });
    }

    private void guardarDatos(String dni, String turno, String horas, String codigo, String fechaAccidente, String horaAccidente, String fechaInvestigacion, String lugarAccidente, String gravedadAccidente, String gradoIncidente, String diasDescanso, String nroTrabajadores, String descripcionCuerpo, String descripcion, String accImg1, String accImg2, String accImg3, String responsable1, String responsable2, String responsable3, String responsable4, String responsable5, String fechaCor1, String fechaCor2, String fechaCor3, String fechaCor4, String fechaCor5, DatabaseReference databaseReference) {
        Map<String,Object> formulario = new HashMap<>();
        formulario.put("dni",dni);
        formulario.put("turno",turno);
        formulario.put("horas",horas);
        formulario.put("codigo",codigo);
        formulario.put("fechaAccidente",fechaAccidente);
        formulario.put("horaAccidente",horaAccidente);
        formulario.put("fechaInvestigacion",fechaInvestigacion);
        formulario.put("lugarAccidente",lugarAccidente);
        formulario.put("gravedadAccidente",gravedadAccidente);
        formulario.put("gradoIncidente",gradoIncidente);
        formulario.put("diasDescanso",diasDescanso);
        formulario.put("nroTrabajadores",nroTrabajadores);
        formulario.put("descripcionCuerpo",descripcionCuerpo);
        formulario.put("descripcion",descripcion);
        formulario.put("accImg1",accImg1);
        formulario.put("accImg2",accImg2);
        formulario.put("accImg3",accImg3);
        formulario.put("responsable1",responsable1);
        formulario.put("responsable2",responsable2);
        formulario.put("responsable3",responsable3);
        formulario.put("responsable4",responsable4);
        formulario.put("responsable5",responsable5);
        formulario.put("fechaCor1",fechaCor1);
        formulario.put("fechaCor2",fechaCor2);
        formulario.put("fechaCor3",fechaCor3);
        formulario.put("fechaCor4",fechaCor4);
        formulario.put("fechaCor5",fechaCor5);
        databaseReference.child("Formulario").child(dni).setValue(formulario);
    }


    private void showDateDialog5(EditText fa5) {
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
                fa5.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new DatePickerDialog(this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void showDateDialog4(EditText fa4) {
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
                fa4.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new DatePickerDialog(this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void showDateDialog3(EditText fa3) {
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
                fa3.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new DatePickerDialog(this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void showDateDialog2(EditText fa2) {
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
                fa2.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new DatePickerDialog(this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void showDateDialog(EditText fa1) {
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
                fa1.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };
        new DatePickerDialog(this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
    
}