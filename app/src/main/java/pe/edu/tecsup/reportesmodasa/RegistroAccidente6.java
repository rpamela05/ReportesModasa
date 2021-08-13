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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente6);
        getSupportActionBar().hide();

        SharedPreferences pref = getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
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
//1
                if(LA1.isChecked()==true){
                    editor.putString("LA1",LA1.getText().toString());
                    editor.commit();
                }if(LA2.isChecked()==true){
                    editor.putString("LA2",LA2.getText().toString());
                    editor.commit();
                }if(LA3.isChecked()==true){
                    editor.putString("LA3",LA3.getText().toString());
                    editor.commit();
                }if(LA4.isChecked()==true){
                    editor.putString("LA4",LA4.getText().toString());
                    editor.commit();
                }if(LA5.isChecked()==true){
                    editor.putString("LA5",LA5.getText().toString());
                    editor.commit();
                }if(LA6.isChecked()==true){
                    editor.putString("LA6",LA6.getText().toString());
                    editor.commit();
                }if(LA7.isChecked()==true){
                    editor.putString("LA7",LA7.getText().toString());
                    editor.commit();
                }if(LA8.isChecked()==true) {
                    editor.putString("LA8.", LA8.getText().toString());
                    editor.commit();
                }if(LA9.isChecked()==true){
                    editor.putString("LA9",LA9.getText().toString());
                    editor.commit();
                }if(LA10.isChecked()==true){
                    editor.putString("LA10",LA10.getText().toString());
                    editor.commit();
                }if(LA11.isChecked()==true){
                    editor.putString("LA11",LA11.getText().toString());
                    editor.commit();
                }if(LA12.isChecked()==true){
                    editor.putString("LA12",LA12.getText().toString());
                    editor.commit();
                }if(LA13.isChecked()==true){
                    editor.putString("LA13", LA13.getText().toString());
                    editor.commit();}

                if (!LA1.isChecked() == true) {
                    editor.remove("LA1").commit();
                }
                if (!LA2.isChecked() == true) {
                    editor.remove("LA2").commit();
                }
                if (!LA3.isChecked() == true) {
                    editor.remove("LA3").commit();
                }
                if (!LA4.isChecked() == true) {
                    editor.remove("LA4").commit();
                }
                if (!LA5.isChecked() == true) {
                    editor.remove("LA5").commit();
                }
                if (!LA6.isChecked() == true) {
                    editor.remove("LA6").commit();
                }
                if (!LA7.isChecked() == true) {
                    editor.remove("LA7").commit();
                }
                if (!LA8.isChecked() == true) {
                    editor.remove("LA8").commit();
                }
                if (!LA9.isChecked() == true) {
                    editor.remove("LA9").commit();
                }
                if (!LA10.isChecked() == true) {
                    editor.remove("LA10").commit();
                }
                if (!LA11.isChecked() == true) {
                    editor.remove("LA11").commit();
                }
                if (!LA12.isChecked() == true) {
                    editor.remove("LA12").commit();
                }
                if (!LA13.isChecked() == true) {
                    editor.remove("LA13").commit();
                }
//2
                if(EG1.isChecked()==true){
                    editor.putString("EG1",EG1.getText().toString());
                    editor.commit();
                }if(EG2.isChecked()==true){
                    editor.putString("EG2",EG2.getText().toString());
                    editor.commit();
                }if(EG3.isChecked()==true){
                    editor.putString("EG3",EG3.getText().toString());
                    editor.commit();
                }if(EG4.isChecked()==true){
                    editor.putString("EG4",EG4.getText().toString());
                    editor.commit();
                }if(EG5.isChecked()==true){
                    editor.putString("EG5",EG5.getText().toString());
                    editor.commit();
                }if(EG6.isChecked()==true) {
                    editor.putString("EG6", EG6.getText().toString());
                    editor.commit();
                }
                if (!EG1.isChecked() == true) {
                    editor.remove("EG1").commit();
                }
                if (!EG2.isChecked() == true) {
                    editor.remove("EG2").commit();
                }
                if (!EG3.isChecked() == true) {
                    editor.remove("EG3").commit();
                }
                if (!EG4.isChecked() == true) {
                    editor.remove("EG4").commit();
                }
                if (!EG5.isChecked() == true) {
                    editor.remove("EG5").commit();
                }
                if (!EG6.isChecked() == true) {
                    editor.remove("EG6").commit();
                }
//3
                if(IP1.isChecked()==true){
                    editor.putString("IP1",IP1.getText().toString());
                    editor.commit();
                }if(IP2.isChecked()==true){
                    editor.putString("IP2",IP2.getText().toString());
                    editor.commit();
                }if(IP3.isChecked()==true){
                    editor.putString("IP3",IP3.getText().toString());
                    editor.commit();
                }if(IP4.isChecked()==true){
                    editor.putString("IP4",IP4.getText().toString());
                    editor.commit();
                }if(IP5.isChecked()==true){
                    editor.putString("IP5",IP5.getText().toString());
                    editor.commit();
                }if(IP6.isChecked()==true){
                    editor.putString("IP6",IP6.getText().toString());
                    editor.commit();
                }if(IP7.isChecked()==true){
                    editor.putString("IP7",IP7.getText().toString());
                    editor.commit();
                }if(IP8.isChecked()==true) {
                    editor.putString("IP8.", IP8.getText().toString());
                    editor.commit();
                }if(IP9.isChecked()==true){
                    editor.putString("IP9",IP9.getText().toString());
                    editor.commit();
                }

                if (!IP1.isChecked() == true) {
                    editor.remove("IP1").commit();
                }
                if (!IP2.isChecked() == true) {
                    editor.remove("IP2").commit();
                }
                if (!IP3.isChecked() == true) {
                    editor.remove("IP3").commit();
                }
                if (!IP4.isChecked() == true) {
                    editor.remove("IP4").commit();
                }
                if (!IP5.isChecked() == true) {
                    editor.remove("IP5").commit();
                }
                if (!IP6.isChecked() == true) {
                    editor.remove("IP6").commit();
                }
                if (!IP7.isChecked() == true) {
                    editor.remove("IP7").commit();
                }
                if (!IP8.isChecked() == true) {
                    editor.remove("IP").commit();
                }
                if (!IP9.isChecked() == true) {
                    editor.remove("IP9").commit();
                }
//4
                if(AP1.isChecked()==true){
                    editor.putString("AP1",AP1.getText().toString());
                    editor.commit();
                }if(AP2.isChecked()==true){
                    editor.putString("AP2",AP2.getText().toString());
                    editor.commit();
                }if(AP3.isChecked()==true){
                    editor.putString("AP3",AP3.getText().toString());
                    editor.commit();
                }if(AP4.isChecked()==true){
                    editor.putString("AP4",AP4.getText().toString());
                    editor.commit();
                }if(AP5.isChecked()==true){
                    editor.putString("AP5",AP5.getText().toString());
                    editor.commit();
                }if(AP6.isChecked()==true){
                    editor.putString("AP6",AP6.getText().toString());
                    editor.commit();
                }

                if (!AP1.isChecked() == true) {
                    editor.remove("AP1").commit();
                }
                if (!AP2.isChecked() == true) {
                    editor.remove("AP2").commit();
                }
                if (!AP3.isChecked() == true) {
                    editor.remove("AP3").commit();
                }
                if (!AP4.isChecked() == true) {
                    editor.remove("AP4").commit();
                }
                if (!AP5.isChecked() == true) {
                    editor.remove("AP5").commit();
                }
                if (!AP6.isChecked() == true) {
                    editor.remove("AP6").commit();
                }
//5
                if(IA1.isChecked()==true){
                    editor.putString("IA1",IA1.getText().toString());
                    editor.commit();
                }if(IA2.isChecked()==true){
                    editor.putString("IA2",IA2.getText().toString());
                    editor.commit();
                }if(IA3.isChecked()==true){
                    editor.putString("IA3",IA3.getText().toString());
                    editor.commit();
                }if(IA4.isChecked()==true){
                    editor.putString("IA4",IA4.getText().toString());
                    editor.commit();
                }if(IA5.isChecked()==true){
                    editor.putString("IA5",IA5.getText().toString());
                    editor.commit();
                }if(IA6.isChecked()==true){
                    editor.putString("IA6",IA6.getText().toString());
                    editor.commit();
                }if(IA7.isChecked()==true){
                    editor.putString("IA7",IA7.getText().toString());
                    editor.commit();
                }if(IA8.isChecked()==true) {
                    editor.putString("IA8.", IA8.getText().toString());
                    editor.commit();
                }if(IA9.isChecked()==true){
                    editor.putString("IA9",IA9.getText().toString());
                    editor.commit();
                }
                if (!IA1.isChecked() == true) {
                    editor.remove("IA1").commit();
                }
                if (!IA2.isChecked() == true) {
                    editor.remove("IA2").commit();
                }
                if (!IA3.isChecked() == true) {
                    editor.remove("IA3").commit();
                }
                if (!IA4.isChecked() == true) {
                    editor.remove("IA4").commit();
                }
                if (!IA5.isChecked() == true) {
                    editor.remove("IA5").commit();
                }
                if (!IA6.isChecked() == true) {
                    editor.remove("IA6").commit();
                }
                if (!IA7.isChecked() == true) {
                    editor.remove("IA7").commit();
                }
                if (!IA8.isChecked() == true) {
                    editor.remove("IA8").commit();
                }
                if (!IA9.isChecked() == true) {
                    editor.remove("IA9").commit();
                }
//  6
                if(OT1.isChecked()==true){
                    editor.putString("OT1",OT1.getText().toString());
                    editor.commit();
                }if(OT2.isChecked()==true){
                    editor.putString("OT2",OT2.getText().toString());
                    editor.commit();
                }if(OT3.isChecked()==true){
                    editor.putString("OT3",OT3.getText().toString());
                    editor.commit();
                }if(OT4.isChecked()==true){
                    editor.putString("OT4",OT4.getText().toString());
                    editor.commit();
                }if(OT5.isChecked()==true){
                    editor.putString("OT5",OT5.getText().toString());
                    editor.commit();
                }if(OT6.isChecked()==true){
                    editor.putString("OT6",OT6.getText().toString());
                    editor.commit();
                }

                if (!OT1.isChecked() == true) {
                    editor.remove("OT1").commit();
                }
                if (!OT2.isChecked() == true) {
                    editor.remove("OT2").commit();
                }
                if (!OT3.isChecked() == true) {
                    editor.remove("OT3").commit();
                }
                if (!OT4.isChecked() == true) {
                    editor.remove("OT4").commit();
                }
                if (!OT5.isChecked() == true) {
                    editor.remove("OT5").commit();
                }
                if (!OT6.isChecked() == true) {
                    editor.remove("OT6").commit();
                }
//  7
                if(PE1.isChecked()==true){
                    editor.putString("PE1",PE1.getText().toString());
                    editor.commit();
                }if(PE2.isChecked()==true){
                    editor.putString("PE2",PE2.getText().toString());
                    editor.commit();
                }if(PE3.isChecked()==true){
                    editor.putString("PE3",PE3.getText().toString());
                    editor.commit();
                }if(PE4.isChecked()==true){
                    editor.putString("PE4",PE4.getText().toString());
                    editor.commit();
                }if(PE5.isChecked()==true){
                    editor.putString("PE5",PE5.getText().toString());
                    editor.commit();
                }if(PE6.isChecked()==true){
                    editor.putString("PE6",PE6.getText().toString());
                    editor.commit();
                }if(PE7.isChecked()==true){
                    editor.putString("PE7",PE7.getText().toString());
                    editor.commit();
                }if(PE8.isChecked()==true) {
                    editor.putString("PE8.", PE8.getText().toString());
                    editor.commit();
                }if(PE9.isChecked()==true){
                    editor.putString("PE9",PE9.getText().toString());
                    editor.commit();
                }if(PE10.isChecked()==true){
                    editor.putString("PE10",PE10.getText().toString());
                    editor.commit();
                }if(PE11.isChecked()==true){
                    editor.putString("PE11",PE11.getText().toString());
                    editor.commit();
                }if(PE12.isChecked()==true){
                    editor.putString("PE12",PE12.getText().toString());
                    editor.commit();
                }if(PE13.isChecked()==true){
                    editor.putString("PE13",PE13.getText().toString());
                    editor.commit();
                }if(PE13.isChecked()==true){
                    editor.putString("PE13",PE13.getText().toString());
                    editor.commit();
                }if(PE14.isChecked()==true){
                    editor.putString("PE14",PE14.getText().toString());
                    editor.commit();}

                if (!PE1.isChecked() == true) {
                    editor.remove("PE1").commit();
                }
                if (!PE2.isChecked() == true) {
                    editor.remove("PE2").commit();
                }
                if (!PE3.isChecked() == true) {
                    editor.remove("PE3").commit();
                }
                if (!PE4.isChecked() == true) {
                    editor.remove("PE4").commit();
                }
                if (!PE5.isChecked() == true) {
                    editor.remove("PE5").commit();
                }
                if (!PE6.isChecked() == true) {
                    editor.remove("PE6").commit();
                }
                if (!PE7.isChecked() == true) {
                    editor.remove("PE7").commit();
                }
                if (!PE8.isChecked() == true) {
                    editor.remove("PE8").commit();
                }
                if (!PE9.isChecked() == true) {
                    editor.remove("PE9").commit();
                }
                if (!PE10.isChecked() == true) {
                    editor.remove("PE10").commit();
                }
                if (!PE11.isChecked() == true) {
                    editor.remove("PE11").commit();
                }
                if (!PE12.isChecked() == true) {
                    editor.remove("PE12").commit();
                }
                if (!PE13.isChecked() == true) {
                    editor.remove("PE13").commit();
                }
                if (!PE14.isChecked() == true) {
                    editor.remove("PE14").commit();
                }
//8
                if(RC1.isChecked()==true){
                    editor.putString("RC1",RC1.getText().toString());
                    editor.commit();
                }if(RC2.isChecked()==true){
                    editor.putString("RC2",RC2.getText().toString());
                    editor.commit();
                }if(RC3.isChecked()==true){
                    editor.putString("RC3",RC3.getText().toString());
                    editor.commit();
                }if(RC4.isChecked()==true){
                    editor.putString("RC4",RC4.getText().toString());
                    editor.commit();
                }if(RC5.isChecked()==true){
                    editor.putString("RC5",RC5.getText().toString());
                    editor.commit();
                }if(RC6.isChecked()==true){
                    editor.putString("RC6",RC6.getText().toString());
                    editor.commit();
                }if(RC7.isChecked()==true){
                    editor.putString("RC7",RC7.getText().toString());
                    editor.commit();
                }
                if (!RC1.isChecked() == true) {
                    editor.remove("RC1").commit();
                }
                if (!RC2.isChecked() == true) {
                    editor.remove("RC2").commit();
                }
                if (!RC3.isChecked() == true) {
                    editor.remove("RC3").commit();
                }
                if (!RC4.isChecked() == true) {
                    editor.remove("RC4").commit();
                }
                if (!RC5.isChecked() == true) {
                    editor.remove("RC5").commit();
                }
                if (!RC6.isChecked() == true) {
                    editor.remove("RC6").commit();
                }
                if (!RC7.isChecked() == true) {
                    editor.remove("RC7").commit();
                }
//    9

                if(AA1.isChecked()==true){
                    editor.putString("AA1",AA1.getText().toString());
                    editor.commit();
                }if(AA2.isChecked()==true){
                    editor.putString("AA2",AA2.getText().toString());
                    editor.commit();
                }if(AA3.isChecked()==true){
                    editor.putString("AA3",AA3.getText().toString());
                    editor.commit();
                }if(AA4.isChecked()==true){
                    editor.putString("AA4",AA4.getText().toString());
                    editor.commit();
                }if(AA5.isChecked()==true){
                    editor.putString("AA5",AA5.getText().toString());
                    editor.commit();
                }


                if (!AA1.isChecked() == true) {
                    editor.remove("AA1").commit();
                }
                if (!AA2.isChecked() == true) {
                    editor.remove("AA2").commit();
                }
                if (!AA3.isChecked() == true) {
                    editor.remove("AA3").commit();
                }
                if (!AA4.isChecked() == true) {
                    editor.remove("AA4").commit();
                }
                if (!AA5.isChecked() == true) {
                    editor.remove("AA5").commit();
                }

//  10

                if(EP1.isChecked()==true){
                    editor.putString("EP1",EP1.getText().toString());
                    editor.commit();
                }if(EP2.isChecked()==true){
                    editor.putString("EP2",EP2.getText().toString());
                    editor.commit();
                }if(EP3.isChecked()==true){
                    editor.putString("EP3",EP3.getText().toString());
                    editor.commit();
                }

                if (!EP1.isChecked() == true) {
                    editor.remove("EP1").commit();
                }
                if (!EP2.isChecked() == true) {
                    editor.remove("EP2").commit();
                }
                if (!EP3.isChecked() == true) {
                    editor.remove("EP3").commit();
                }
// 11
                if(EPP1.isChecked()==true){
                    editor.putString("EPP1",EPP1.getText().toString());
                    editor.commit();
                }if(EPP2.isChecked()==true){
                    editor.putString("EPP2",EPP2.getText().toString());
                    editor.commit();
                }if(EPP3.isChecked()==true){
                    editor.putString("EPP3",EPP3.getText().toString());
                    editor.commit();
                }if(EPP4.isChecked()==true){
                    editor.putString("EPP4",EPP4.getText().toString());
                    editor.commit();
                }

                if (!EPP1.isChecked() == true) {
                    editor.remove("EPP1").commit();
                }
                if (!EPP2.isChecked() == true) {
                    editor.remove("EPP2").commit();
                }
                if (!EPP3.isChecked() == true) {
                    editor.remove("EPP3").commit();
                }
                if (!EPP4.isChecked() == true) {
                    editor.remove("EPP4").commit();
                }
//12
                if(CS1.isChecked()==true){
                    editor.putString("CS1",CS1.getText().toString());
                    editor.commit();
                }if(CS2.isChecked()==true){
                    editor.putString("CS2",CS2.getText().toString());
                    editor.commit();
                }if(CS3.isChecked()==true){
                    editor.putString("CS3",CS3.getText().toString());
                    editor.commit();
                }if(CS4.isChecked()==true){
                    editor.putString("CS4",CS4.getText().toString());
                    editor.commit();
                }if(CS5.isChecked()==true){
                    editor.putString("CS5",CS5.getText().toString());
                    editor.commit();
                }if(CS6.isChecked()==true){
                    editor.putString("CS6",CS6.getText().toString());
                    editor.commit();
                }if(CS7.isChecked()==true){
                    editor.putString("CS7",CS7.getText().toString());
                    editor.commit();
                }if(CS8.isChecked()==true) {
                    editor.putString("CS8.", CS8.getText().toString());
                    editor.commit();
                }

                if (!CS1.isChecked() == true) {
                    editor.remove("CS1").commit();
                }
                if (!CS2.isChecked() == true) {
                    editor.remove("CS2").commit();
                }
                if (!CS3.isChecked() == true) {
                    editor.remove("CS3").commit();
                }
                if (!CS4.isChecked() == true) {
                    editor.remove("CS4").commit();
                }
                if (!CS5.isChecked() == true) {
                    editor.remove("CS5").commit();
                }
                if (!CS6.isChecked() == true) {
                    editor.remove("CS6").commit();
                }
                if (!CS7.isChecked() == true) {
                    editor.remove("CS7").commit();
                }
                if (!CS8.isChecked() == true) {
                    editor.remove("CS8").commit();
                }

//13
                if(SE1.isChecked()==true){
                    editor.putString("SE1",SE1.getText().toString());
                    editor.commit();
                }if(SE2.isChecked()==true){
                    editor.putString("SE2",SE2.getText().toString());
                    editor.commit();
                }if(SE3.isChecked()==true){
                    editor.putString("SE3",SE3.getText().toString());
                    editor.commit();
                }if(SE4.isChecked()==true){
                    editor.putString("SE4",SE4.getText().toString());
                    editor.commit();
                }if(SE5.isChecked()==true){
                    editor.putString("SE5",SE5.getText().toString());
                    editor.commit();
                }

                if (!SE1.isChecked() == true) {
                    editor.remove("SE1").commit();
                }
                if (!SE2.isChecked() == true) {
                    editor.remove("SE2").commit();
                }
                if (!SE3.isChecked() == true) {
                    editor.remove("SE3").commit();
                }
                if (!SE4.isChecked() == true) {
                    editor.remove("SE4").commit();
                }
                if (!SE5.isChecked() == true) {
                    editor.remove("SE5").commit();
                }

//   14
                if(CI1.isChecked()==true){
                    editor.putString("CI1",CI1.getText().toString());
                    editor.commit();
                }if(CI2.isChecked()==true){
                    editor.putString("CI2",CI2.getText().toString());
                    editor.commit();
                }if(CI3.isChecked()==true){
                    editor.putString("CI3",CI3.getText().toString());
                    editor.commit();
                }

                if (!CI1.isChecked() == true) {
                    editor.remove("CI1").commit();
                }
                if (!CI2.isChecked() == true) {
                    editor.remove("CI2").commit();
                }
                if (!CI3.isChecked() == true) {
                    editor.remove("CI3").commit();
                }
//  15

                if(CP1.isChecked()==true){
                    editor.putString("CP1",CP1.getText().toString());
                    editor.commit();
                }if(CP2.isChecked()==true){
                    editor.putString("CP2",CP2.getText().toString());
                    editor.commit();
                }if(CP3.isChecked()==true){
                    editor.putString("CP3",CP3.getText().toString());
                    editor.commit();
                }

                if (!CP1.isChecked() == true) {
                    editor.remove("CP1").commit();
                }
                if (!CP2.isChecked() == true) {
                    editor.remove("CP2").commit();
                }
                if (!CP3.isChecked() == true) {
                    editor.remove("CP3").commit();
                }

//16
                if(RG1.isChecked()==true){
                    editor.putString("RG1",RG1.getText().toString());
                    editor.commit();
                }if(RG2.isChecked()==true){
                    editor.putString("RG2",RG2.getText().toString());
                    editor.commit();
                }if(RG3.isChecked()==true){
                    editor.putString("RG3",RG3.getText().toString());
                    editor.commit();
                }if(RG4.isChecked()==true){
                    editor.putString("RG4",RG4.getText().toString());
                    editor.commit();
                }

                if (!RG1.isChecked() == true) {
                    editor.remove("RG1").commit();
                }
                if (!RG2.isChecked() == true) {
                    editor.remove("RG2").commit();
                }
                if (!RG3.isChecked() == true) {
                    editor.remove("RG3").commit();
                }
                if (!RG4.isChecked() == true) {
                    editor.remove("RG4").commit();
                }
// 17

                if(PG1.isChecked()==true){
                    editor.putString("PG1",PG1.getText().toString());
                    editor.commit();
                }if(PG2.isChecked()==true){
                    editor.putString("PG2",PG2.getText().toString());
                    editor.commit();
                }if(PG3.isChecked()==true){
                    editor.putString("PG3",PG3.getText().toString());
                    editor.commit();
                }if(PG4.isChecked()==true){
                    editor.putString("PG4",PG4.getText().toString());
                    editor.commit();
                }if(PG5.isChecked()==true){
                    editor.putString("PG5",PG5.getText().toString());
                    editor.commit();
                }if(PG6.isChecked()==true){
                    editor.putString("PG6",PG6.getText().toString());
                    editor.commit();
                }if(PG7.isChecked()==true){
                    editor.putString("PG7",PG7.getText().toString());
                    editor.commit();
                }if(PG8.isChecked()==true) {
                    editor.putString("PG8.", PG8.getText().toString());
                    editor.commit();
                }

                if (!PG1.isChecked() == true) {
                    editor.remove("PG1").commit();
                }
                if (!PG2.isChecked() == true) {
                    editor.remove("PG2").commit();
                }
                if (!PG3.isChecked() == true) {
                    editor.remove("PG3").commit();
                }
                if (!PG4.isChecked() == true) {
                    editor.remove("PG4").commit();
                }
                if (!PG5.isChecked() == true) {
                    editor.remove("PG5").commit();
                }
                if (!PG6.isChecked() == true) {
                    editor.remove("PG6").commit();
                }
                if (!PG7.isChecked() == true) {
                    editor.remove("PG7").commit();
                }
                if (!PG8.isChecked() == true) {
                    editor.remove("PG8").commit();
                }
// 18
                if(CCP1.isChecked()==true){
                    editor.putString("CCP1",CCP1.getText().toString());
                    editor.commit();
                }if(CCP2.isChecked()==true){
                    editor.putString("CCP2",CCP2.getText().toString());
                    editor.commit();
                }if(CCP3.isChecked()==true){
                    editor.putString("CCP3",CCP3.getText().toString());
                    editor.commit();
                }if(CCP4.isChecked()==true){
                    editor.putString("CCP4",CCP4.getText().toString());
                    editor.commit();
                }

                if (!CCP1.isChecked() == true) {
                    editor.remove("CCP1").commit();
                }
                if (!CCP2.isChecked() == true) {
                    editor.remove("CCP2").commit();
                }
                if (!CCP3.isChecked() == true) {
                    editor.remove("CCP3").commit();
                }
                if (!CCP4.isChecked() == true) {
                    editor.remove("CCP4").commit();
                }
//19
                if(CC1.isChecked()==true){
                    editor.putString("CC1",CC1.getText().toString());
                    editor.commit();
                }if(CC2.isChecked()==true){
                    editor.putString("CC2",CC2.getText().toString());
                    editor.commit();
                }
                if (!CC1.isChecked() == true) {
                    editor.remove("CC1").commit();
                }
                if (!CC2.isChecked() == true) {
                    editor.remove("CC2").commit();
                }


//  20
                if(SF1.isChecked()==true){
                    editor.putString("SF1",SF1.getText().toString());
                    editor.commit();
                }if(SF2.isChecked()==true){
                    editor.putString("SF2",SF2.getText().toString());
                    editor.commit();
                }
                if (!SF1.isChecked() == true) {
                    editor.remove("SF1").commit();
                }
                if (!SF2.isChecked() == true) {
                    editor.remove("SF2").commit();
                }
//CHECKED

//                        --1
                if (LA1.isChecked() == true ||
                        LA2.isChecked() == true ||
                        LA3.isChecked() == true ||
                        LA4.isChecked() == true ||
                        LA5.isChecked() == true ||
                        LA6.isChecked() == true ||
                        LA7.isChecked() == true ||
                        LA8.isChecked() == true ||
                        LA9.isChecked() == true ||
                        LA10.isChecked() == true ||
                        LA11.isChecked() == true ||
                        LA12.isChecked() == true ||
                        LA13.isChecked() == true ||
//                        --2
                        EG1.isChecked() == true ||
                        EG2.isChecked() == true ||
                        EG3.isChecked() == true ||
                        EG4.isChecked() == true ||
                        EG5.isChecked() == true ||
                        EG6.isChecked() == true ||
//                        --3
                        IP1.isChecked() == true ||
                        IP2.isChecked() == true ||
                        IP3.isChecked() == true ||
                        IP4.isChecked() == true ||
                        IP5.isChecked() == true ||
                        IP6.isChecked() == true ||
                        IP7.isChecked() == true ||
                        IP8.isChecked() == true ||
                        IP9.isChecked() == true ||
//                       ---4
                        AP1.isChecked() == true ||
                        AP2.isChecked() == true ||
                        AP3.isChecked() == true ||
                        AP4.isChecked() == true ||
                        AP5.isChecked() == true ||
                        AP6.isChecked() == true ||
//                       ---5
                        IA1.isChecked() == true ||
                        IA2.isChecked() == true ||
                        IA3.isChecked() == true ||
                        IA4.isChecked() == true ||
                        IA5.isChecked() == true ||
                        IA6.isChecked() == true ||
                        IA7.isChecked() == true ||
                        IA8.isChecked() == true ||
                        IA9.isChecked() == true ||
//                        --
                        OT1.isChecked() == true ||
                        OT2.isChecked() == true ||
                        OT3.isChecked() == true ||
                        OT4.isChecked() == true ||
                        OT5.isChecked() == true ||
                        OT6.isChecked() == true ||
//                        --
                        PE1.isChecked() == true ||
                        PE2.isChecked() == true ||
                        PE3.isChecked() == true ||
                        PE4.isChecked() == true ||
                        PE5.isChecked() == true ||
                        PE6.isChecked() == true ||
                        PE7.isChecked() == true ||
                        PE8.isChecked() == true ||
                        PE9.isChecked() == true ||
                        PE10.isChecked() == true ||
                        PE11.isChecked() == true ||
                        PE12.isChecked() == true ||
                        PE13.isChecked() == true ||
                        PE14.isChecked() == true ||
//                        --
                        RC1.isChecked() == true ||
                        RC2.isChecked() == true ||
                        RC3.isChecked() == true ||
                        RC4.isChecked() == true ||
                        RC5.isChecked() == true ||
                        RC6.isChecked() == true ||
                        RC7.isChecked() == true ||
//                        --
                        AA1.isChecked() == true ||
                        AA2.isChecked() == true ||
                        AA3.isChecked() == true ||
                        AA4.isChecked() == true ||
                        AA5.isChecked() == true ||
//                        --

                        EP1.isChecked() == true ||
                        EP2.isChecked() == true ||
                        EP3.isChecked() == true ||
//                        --

                        EPP1.isChecked() == true ||
                        EPP2.isChecked() == true ||
                        EPP3.isChecked() == true ||
                        EPP4.isChecked() == true ||
//                        --
                        CS1.isChecked() == true ||
                        CS2.isChecked() == true ||
                        CS3.isChecked() == true ||
                        CS4.isChecked() == true ||
                        CS5.isChecked() == true ||
                        CS6.isChecked() == true ||
                        CS7.isChecked() == true ||
                        CS8.isChecked() == true ||
//                        --
                        SE1.isChecked() == true ||
                        SE2.isChecked() == true ||
                        SE3.isChecked() == true ||
                        SE4.isChecked() == true ||
                        SE5.isChecked() == true ||
//                        --
                        CI1.isChecked() == true ||
                        CI2.isChecked() == true ||
                        CI3.isChecked() == true ||
//                        --
                        CP1.isChecked() == true ||
                        CP2.isChecked() == true ||
                        CP3.isChecked() == true ||
//                       --
                        RG1.isChecked() == true ||
                        RG2.isChecked() == true ||
                        RG3.isChecked() == true ||
                        RG4.isChecked() == true ||
//                        --
                        PG1.isChecked() == true ||
                        PG2.isChecked() == true ||
                        PG3.isChecked() == true ||
                        PG4.isChecked() == true ||
                        PG5.isChecked() == true ||
                        PG6.isChecked() == true ||
                        PG7.isChecked() == true ||
                        PG8.isChecked() == true ||
//                        --
                        CCP1.isChecked() == true ||
                        CCP2.isChecked() == true ||
                        CCP3.isChecked() == true ||
                        CCP4.isChecked() == true ||
//                         --
                        CC1.isChecked() == true ||
                        CC2.isChecked() == true ||
//                        --
                        SF1.isChecked() == true ||
                        SF2.isChecked() == true ) {
                    startActivity(new Intent(getApplicationContext(), RegistroAccidente7.class));
                    finish();
                } else {
                    Toast.makeText(RegistroAccidente6.this, "Seleccione al menos una opción", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}



