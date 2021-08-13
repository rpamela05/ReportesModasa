package pe.edu.tecsup.reportesmodasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

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
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente6);
        getSupportActionBar().hide();


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


