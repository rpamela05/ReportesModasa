package pe.edu.tecsup.reportesmodasa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegistroAccidente6 extends  AppCompatActivity {
    CheckBox LA1,LA2,LA3,LA4,LA5,LA6,LA7,LA8,LA9,LA10,LA11,LA12,LA13;
    CheckBox EG1,EG2,EG3,EG4,EG5,EG6;
    CheckBox IP1,IP2,IP3,IP4,IP5,IP6,IP7,IP8,IP9;
    CheckBox AP1,AP2,AP3,AP4,AP5,AP6;
    CheckBox IA1,IA2,IA3,IA4,IA5,IA6,IA7,IA8,IA9;
    CheckBox OT1,OT2,OT3,OT4,OT5,OT6;
    CheckBox PE1,PE2,PE3,PE4,PE5,PE6,PE7,PE8,PE9,PE10,PE11,PE12,PE13,PE14;
    CheckBox RC1,RC2,RC3,RC4,RC5,RC6,RC7;
    CheckBox AA1,AA2,AA3,AA4,AA5;
    CheckBox EP1,EP2,EP3;
    CheckBox EPP1,EPP2,EPP3,EPP4;
    CheckBox CS1,CS2,CS3,CS4,CS5,CS6,CS7,CS8;
    CheckBox SE1,SE2,SE3,SE4,SE5;
    CheckBox CI1,CI2,CI3;
    CheckBox CP1,CP2,CP3;
    CheckBox RG1,RG2,RG3,RG4;
    CheckBox PG1,PG2,PG3,PG4,PG5,PG6,PG7,PG8;
    CheckBox CCP1,CCP2,CCP3,CCP4;
    CheckBox CC1,CC2;
    CheckBox SF1,SF2;
    EditText nroRegistro;
    Button btnSiguiente;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente6);
        getSupportActionBar().hide();

        SharedPreferences pref = getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();


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
        //String[] opciones = {cf1, cf2
                //,cf3,cf4,cf5};
        ArrayList opciones = new ArrayList();
        opciones.add(CF1);
        opciones.add(CF2);
        opciones.add(CF3);
        opciones.add(CF4);
        opciones.add(CF5);
        opciones.add(CF6);
        opciones.add(CF7);
        opciones.add(CF8);
        opciones.add(CF9);
        opciones.add(CF10);
        opciones.add(CM1);
        opciones.add(CM2);
        opciones.add(CM3);
        opciones.add(CM4);
        opciones.add(CM5);
        opciones.add(CM6);
        opciones.add(CM7);
        opciones.add(CM8);
        opciones.add(CM9);
        opciones.add(CM10);
        opciones.add(CM11);
        opciones.add(TF1);
        opciones.add(TF2);
        opciones.add(TF3);
        opciones.add(TF4);
        opciones.add(TF5);
        opciones.add(TF6);
        opciones.add(TF7);
        opciones.add(TF8);
        opciones.add(TF9);
        opciones.add(TF10);
        opciones.add(TF11);
        opciones.add(TM1);
        opciones.add(TM2);
        opciones.add(TM3);
        opciones.add(TM4);
        opciones.add(TM5);
        opciones.add(TM6);
        opciones.add(TM7);
        opciones.add(TM8);
        opciones.add(TM9);
        opciones.add(TM10);
        opciones.add(TM11);
        opciones.add(FC1);
        opciones.add(FC2);
        opciones.add(FC3);
        opciones.add(FC4);
        opciones.add(FC5);
        opciones.add(FH1);
        opciones.add(FH2);
        opciones.add(FH3);
        opciones.add(FH4);
        opciones.add(FH5);
        opciones.add(MI1);
        opciones.add(MI2);
        opciones.add(MI3);
        opciones.add(MI4);
        opciones.add(MI5);
        opciones.add(MI6);
        opciones.add(MI7);
        opciones.add(MI8);
        opciones.add(MI9);
        opciones.add(MI10);
        opciones.add(MI11);
        opciones.add(MI12);
        opciones.add(MI13);
        opciones.add(MI14);
        opciones.add(SI1);
        opciones.add(SI2);
        opciones.add(SI3);
        opciones.add(SI4);
        opciones.add(SI5);
        opciones.add(SI6);
        opciones.add(SI7);
        opciones.add(SI8);
        opciones.add(SI9);
        opciones.add(SI10);
        opciones.add(SI11);
        opciones.add(SI12);
        opciones.add(SI13);
        opciones.add(II1);
        opciones.add(II2);
        opciones.add(II3);
        opciones.add(II4);
        opciones.add(II5);
        opciones.add(II6);
        opciones.add(II7);
        opciones.add(II8);
        opciones.add(CI01);
        opciones.add(CI02);
        opciones.add(CI03);
        opciones.add(CI04);
        opciones.add(CI05);
        opciones.add(CI06);
        opciones.add(CI07);
        opciones.add(CI08);
        opciones.add(CI09);
        opciones.add(CI010);
        opciones.add(CI011);
        opciones.add(CI012);
        opciones.add(PI1);
        opciones.add(PI2);
        opciones.add(PI3);
        opciones.add(PI4);
        opciones.add(RI1);
        opciones.add(RI2);
        opciones.add(RI3);
        opciones.add(RI4);
        opciones.add(HE1);
        opciones.add(HE2);
        opciones.add(HE3);
        opciones.add(HE4);
        opciones.add(HE5);
        opciones.add(HE6);
        opciones.add(HE7);
        opciones.add(ET1);
        opciones.add(ET2);
        opciones.add(ET3);
        opciones.add(ET4);
        opciones.add(CE1);
        opciones.add(CE2);
        opciones.add(CE3);
        opciones.add(CE4);
        opciones.add(CE5);
        opciones.add(ME1);
        opciones.add(ME2);
        opciones.add(ME3);
        opciones.add(ME4);
        opciones.add(DE1);
        opciones.add(DE2);
        opciones.add(DE3);
        opciones.add(DE4);
        opciones.add(DE5);
        opciones.add(DE6);
        opciones.add(DE7);
        opciones.add(CIC1);
        opciones.add(CIC2);
        opciones.add(CIN1);
        opciones.add(CIN2);
        ArrayList cleanList = new ArrayList();

        for(int i=0; i<opciones.size();i++){
            if (opciones.get(i) == ""){

            }else{
                cleanList.add(opciones.get(i));
            }
        }
        Toast.makeText(RegistroAccidente6.this, cleanList.toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(RegistroAccidente6.this, "aaa", Toast.LENGTH_SHORT).show();


        nroRegistro = findViewById(R.id.nroRegistro);
        String codigo = pref.getString("codigo", "");

        nroRegistro.setText(codigo);

        btnSiguiente=findViewById(R.id.btnSiguiente);

        //1
        LA1=findViewById(R.id.LA1);
        LA2=findViewById(R.id.LA2);
        LA3=findViewById(R.id.LA3);
        LA4=findViewById(R.id.LA4);
        LA5=findViewById(R.id.LA5);
        LA6=findViewById(R.id.LA6);
        LA7=findViewById(R.id.LA7);
        LA8=findViewById(R.id.LA8);
        LA9=findViewById(R.id.LA9);
        LA10=findViewById(R.id.LA10);
        LA11=findViewById(R.id.LA11);
        LA12=findViewById(R.id.LA12);
        LA13=findViewById(R.id.LA13);


//2
        EG1=findViewById(R.id.EG1);
        EG2=findViewById(R.id.EG2);
        EG3=findViewById(R.id.EG3);
        EG4=findViewById(R.id.EG4);
        EG5=findViewById(R.id.EG5);
        EG6=findViewById(R.id.EG6);


//3
        IP1=findViewById(R.id.IP1);
        IP2=findViewById(R.id.IP2);
        IP3=findViewById(R.id.IP3);
        IP4=findViewById(R.id.IP4);
        IP5=findViewById(R.id.IP5);
        IP6=findViewById(R.id.IP6);
        IP7=findViewById(R.id.IP7);
        IP8=findViewById(R.id.IP8);
        IP9=findViewById(R.id.IP9);


//4

        AP1=findViewById(R.id.AP1);
        AP2=findViewById(R.id.AP2);
        AP3=findViewById(R.id.AP3);
        AP4=findViewById(R.id.AP4);
        AP5=findViewById(R.id.AP5);
        AP6=findViewById(R.id.AP6);

//5

        IA1=findViewById(R.id.IA1);
        IA2=findViewById(R.id.IA2);
        IA3=findViewById(R.id.IA3);
        IA4=findViewById(R.id.IA4);
        IA5=findViewById(R.id.IA5);
        IA6=findViewById(R.id.IA6);
        IA7=findViewById(R.id.IA7);
        IA8=findViewById(R.id.IA8);
        IA9=findViewById(R.id.IA9);


//6
        OT1=findViewById(R.id.OT1);
        OT2=findViewById(R.id.OT2);
        OT3=findViewById(R.id.OT3);
        OT4=findViewById(R.id.OT4);
        OT5=findViewById(R.id.OT5);
        OT6=findViewById(R.id.OT6);


//7
        PE1=findViewById(R.id.PE1);
        PE2=findViewById(R.id.PE2);
        PE3=findViewById(R.id.PE3);
        PE4=findViewById(R.id.PE4);
        PE5=findViewById(R.id.PE5);
        PE6=findViewById(R.id.PE6);
        PE7=findViewById(R.id.PE7);
        PE8=findViewById(R.id.PE8);
        PE9=findViewById(R.id.PE9);
        PE10=findViewById(R.id.PE10);
        PE11=findViewById(R.id.PE11);
        PE12=findViewById(R.id.PE12);
        PE13=findViewById(R.id.PE13);
        PE14=findViewById(R.id.PE14);

//8
        RC1=findViewById(R.id.RC1);
        RC2=findViewById(R.id.RC2);
        RC3=findViewById(R.id.RC3);
        RC4=findViewById(R.id.RC4);
        RC5=findViewById(R.id.RC5);
        RC6=findViewById(R.id.RC6);
        RC7=findViewById(R.id.RC7);

//9
        AA1=findViewById(R.id.AA1);
        AA2=findViewById(R.id.AA2);
        AA3=findViewById(R.id.AA3);
        AA4=findViewById(R.id.AA4);
        AA5=findViewById(R.id.AA5);


//10
        EP1=findViewById(R.id.EP1);
        EP2=findViewById(R.id.EP2);
        EP3=findViewById(R.id.EP3);

//11
        EPP1=findViewById(R.id.EPP1);
        EPP2=findViewById(R.id.EPP2);
        EPP3=findViewById(R.id.EPP3);
        EPP4=findViewById(R.id.EPP4);

//12
        CS1=findViewById(R.id.CS1);
        CS2=findViewById(R.id.CS2);
        CS3=findViewById(R.id.CS3);
        CS4=findViewById(R.id.CS4);
        CS5=findViewById(R.id.CS5);
        CS6=findViewById(R.id.CS6);
        CS7=findViewById(R.id.CS7);
        CS8=findViewById(R.id.CS8);


//13


        SE1=findViewById(R.id.SE1);
        SE2=findViewById(R.id.SE2);
        SE3=findViewById(R.id.SE3);
        SE4=findViewById(R.id.SE4);
        SE5=findViewById(R.id.SE5);
//14
        CI1=findViewById(R.id.CI1);
        CI2=findViewById(R.id.CI2);
        CI3=findViewById(R.id.CI3);

//15
        CP1=findViewById(R.id.CP1);
        CP2=findViewById(R.id.CP2);
        CP3=findViewById(R.id.CP3);
//16
        RG1=findViewById(R.id.RG1);
        RG2=findViewById(R.id.RG2);
        RG3=findViewById(R.id.RG3);
        RG4=findViewById(R.id.RG4);
//17
        PG1=findViewById(R.id.PG1);
        PG2=findViewById(R.id.PG2);
        PG3=findViewById(R.id.PG3);
        PG4=findViewById(R.id.PG4);
        PG5=findViewById(R.id.PG5);
        PG6=findViewById(R.id.PG6);
        PG7=findViewById(R.id.PG7);
        PG8=findViewById(R.id.PG8);

//18

        CCP1=findViewById(R.id.CCP1);
        CCP2=findViewById(R.id.CCP2);
        CCP3=findViewById(R.id.CCP3);
        CCP4=findViewById(R.id.CCP4);
//19
        CC1=findViewById(R.id.CC1);
        CC2=findViewById(R.id.CC2);
//20
        SF1=findViewById(R.id.SF1);
        SF2=findViewById(R.id.SF2);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RegistroAccidente06.class));
                finish();
            }
        });
    }
}


