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

public class RegistroAccidente06 extends AppCompatActivity {
    CheckBox CF1, CF2, CF3, CF4, CF5, CF6, CF7, CF8, CF9, CF10;
    CheckBox CM1, CM2, CM3, CM4, CM5, CM6, CM7, CM8, CM9, CM10, CM11;
    CheckBox TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9, TF10, TF11;
    CheckBox TM1, TM2, TM3, TM4, TM5, TM6, TM7, TM8, TM9, TM10, TM11;
    CheckBox FC1, FC2, FC3, FC4, FC5;
    CheckBox FH1, FH2, FH3, FH4, FH5;
    CheckBox MI1, MI2, MI3, MI4, MI5, MI6, MI7, MI8, MI9, MI10, MI11, MI12, MI13, MI14;
    CheckBox SI1, SI2, SI3, SI4, SI5, SI6, SI7, SI8, SI9, SI10, SI11, SI12, SI13;
    CheckBox II1, II2, II3, II4, II5, II6, II7, II8;
    CheckBox CI1, CI2, CI3, CI4, CI5, CI6, CI7, CI8, CI9, CI10, CI11, CI12;
    CheckBox PI1, PI2, PI3, PI4;
    CheckBox RI1, RI2, RI3, RI4;
    CheckBox HE1, HE2, HE3, HE4, HE5, HE6, HE7;
    CheckBox ET1, ET2, ET3, ET4;
    CheckBox CE1, CE2, CE3, CE4, CE5;
    CheckBox ME1, ME2, ME3, ME4;
    CheckBox DE1, DE2, DE3, DE4, DE5, DE6, DE7;
    CheckBox CIC1, CIC2, CIN1, CIN2;
    EditText nroRegistro;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente06);
        getSupportActionBar().hide();

        btnSiguiente = findViewById(R.id.btnSiguiente);
        nroRegistro = findViewById(R.id.nroRegistro);

        CF1 = findViewById(R.id.CF1);
        CF2 = findViewById(R.id.CF2);
        CF3 = findViewById(R.id.CF3);
        CF4 = findViewById(R.id.CF4);
        CF5 = findViewById(R.id.CF5);
        CF6 = findViewById(R.id.CF6);
        CF7 = findViewById(R.id.CF7);
        CF8 = findViewById(R.id.CF8);
        CF9 = findViewById(R.id.CF9);
        CF10 = findViewById(R.id.CF10);

        CM1 = findViewById(R.id.CM1);
        CM2 = findViewById(R.id.CM2);
        CM3 = findViewById(R.id.CM3);
        CM4 = findViewById(R.id.CM4);
        CM5 = findViewById(R.id.CM5);
        CM6 = findViewById(R.id.CM6);
        CM7 = findViewById(R.id.CM7);
        CM8 = findViewById(R.id.CM8);
        CM9 = findViewById(R.id.CM9);
        CM10 = findViewById(R.id.CM10);
        CM11 = findViewById(R.id.CM11);

        TF1 = findViewById(R.id.TF1);
        TF2 = findViewById(R.id.TF2);
        TF3 = findViewById(R.id.TF3);
        TF4 = findViewById(R.id.TF4);
        TF5 = findViewById(R.id.TF5);
        TF6 = findViewById(R.id.TF6);
        TF7 = findViewById(R.id.TF7);
        TF8 = findViewById(R.id.TF8);
        TF9 = findViewById(R.id.TF9);
        TF10 = findViewById(R.id.TF10);
        TF11 = findViewById(R.id.TF11);

        TM1 = findViewById(R.id.TM1);
        TM2 = findViewById(R.id.TM2);
        TM3 = findViewById(R.id.TM3);
        TM4 = findViewById(R.id.TM4);
        TM5 = findViewById(R.id.TM5);
        TM6 = findViewById(R.id.TM6);
        TM7 = findViewById(R.id.TM7);
        TM8 = findViewById(R.id.TM8);
        TM9 = findViewById(R.id.TM9);
        TM10 = findViewById(R.id.TM10);
        TM11 = findViewById(R.id.TM11);

        FC1 = findViewById(R.id.FC1);
        FC2 = findViewById(R.id.FC2);
        FC3 = findViewById(R.id.FC3);
        FC4 = findViewById(R.id.FC4);
        FC5 = findViewById(R.id.FC5);

        FH1 = findViewById(R.id.FH1);
        FH2 = findViewById(R.id.FH2);
        FH3 = findViewById(R.id.FH3);
        FH4 = findViewById(R.id.FH4);
        FH5 = findViewById(R.id.FH5);

        MI1 = findViewById(R.id.MI1);
        MI2 = findViewById(R.id.MI2);
        MI3 = findViewById(R.id.MI3);
        MI4 = findViewById(R.id.MI4);
        MI5 = findViewById(R.id.MI5);
        MI6 = findViewById(R.id.MI6);
        MI7 = findViewById(R.id.MI7);
        MI8 = findViewById(R.id.MI8);
        MI9 = findViewById(R.id.MI9);
        MI10 = findViewById(R.id.MI10);
        MI11 = findViewById(R.id.MI11);
        MI12 = findViewById(R.id.MI12);
        MI13 = findViewById(R.id.MI13);
        MI14 = findViewById(R.id.MI14);

        SI1 = findViewById(R.id.SI1);
        SI2 = findViewById(R.id.SI2);
        SI3 = findViewById(R.id.SI3);
        SI4 = findViewById(R.id.SI4);
        SI5 = findViewById(R.id.SI5);
        SI6 = findViewById(R.id.SI6);
        SI7 = findViewById(R.id.SI7);
        SI8 = findViewById(R.id.SI8);
        SI9 = findViewById(R.id.SI9);
        SI10 = findViewById(R.id.SI10);
        SI11 = findViewById(R.id.SI11);
        SI12 = findViewById(R.id.SI12);
        SI13 = findViewById(R.id.SI13);

        II1 = findViewById(R.id.II1);
        II2 = findViewById(R.id.II2);
        II3 = findViewById(R.id.II3);
        II4 = findViewById(R.id.II4);
        II5 = findViewById(R.id.II5);
        II6 = findViewById(R.id.II6);
        II7 = findViewById(R.id.II7);
        II8 = findViewById(R.id.II8);

        CI1 = findViewById(R.id.CI1);
        CI2 = findViewById(R.id.CI2);
        CI3 = findViewById(R.id.CI3);
        CI4 = findViewById(R.id.CI4);
        CI5 = findViewById(R.id.CI5);
        CI6 = findViewById(R.id.CI6);
        CI7 = findViewById(R.id.CI7);
        CI8 = findViewById(R.id.CI8);
        CI9 = findViewById(R.id.CI9);
        CI10 = findViewById(R.id.CI10);
        CI11 = findViewById(R.id.CI11);
        CI12 = findViewById(R.id.CI12);

        PI1 = findViewById(R.id.PI1);
        PI2 = findViewById(R.id.PI2);
        PI3 = findViewById(R.id.PI3);
        PI4 = findViewById(R.id.PI4);

        RI1 = findViewById(R.id.RI1);
        RI2 = findViewById(R.id.RI2);
        RI3 = findViewById(R.id.RI3);
        RI4 = findViewById(R.id.RI4);

        HE1 = findViewById(R.id.HE1);
        HE2 = findViewById(R.id.HE2);
        HE3 = findViewById(R.id.HE3);
        HE4 = findViewById(R.id.HE4);
        HE5 = findViewById(R.id.HE5);
        HE6 = findViewById(R.id.HE6);
        HE7 = findViewById(R.id.HE7);

        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        ET3 = findViewById(R.id.ET3);
        ET4 = findViewById(R.id.ET4);

        CE1 = findViewById(R.id.CE1);
        CE2 = findViewById(R.id.CE2);
        CE3 = findViewById(R.id.CE3);
        CE4 = findViewById(R.id.CE4);
        CE5 = findViewById(R.id.CE5);

        ME1 = findViewById(R.id.ME1);
        ME2 = findViewById(R.id.ME2);
        ME3 = findViewById(R.id.ME3);
        ME4 = findViewById(R.id.ME4);

        DE1 = findViewById(R.id.DE1);
        DE2 = findViewById(R.id.DE2);
        DE3 = findViewById(R.id.DE3);
        DE4 = findViewById(R.id.DE4);
        DE5 = findViewById(R.id.DE5);
        DE6 = findViewById(R.id.DE6);
        DE7 = findViewById(R.id.DE7);

        CIC1 = findViewById(R.id.CIC1);
        CIC2 = findViewById(R.id.CIC2);

        CIN1 = findViewById(R.id.CIN1);
        CIN2 = findViewById(R.id.CIN2);

        SharedPreferences pref = getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        String codigo = pref.getString("codigo", "");

        nroRegistro.setText(codigo);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CF1.isChecked() == true) {
                    editor.putString("CF1", CF1.getText().toString());
                    editor.commit();
                }
                if (CF2.isChecked() == true) {
                    editor.putString("CF2", CF2.getText().toString());
                    editor.commit();
                }
                if (CF3.isChecked() == true) {
                    editor.putString("CF3", CF3.getText().toString());
                    editor.commit();
                }
                if (CF4.isChecked() == true) {
                    editor.putString("CF4", CF4.getText().toString());
                    editor.commit();
                }
                if (CF5.isChecked() == true) {
                    editor.putString("CF5", CF5.getText().toString());
                    editor.commit();
                }
                if (CF6.isChecked() == true) {
                    editor.putString("CF6", CF6.getText().toString());
                    editor.commit();
                }
                if (CF7.isChecked() == true) {
                    editor.putString("CF7", CF7.getText().toString());
                    editor.commit();
                }
                if (CF8.isChecked() == true) {
                    editor.putString("CF8.", CF8.getText().toString());
                    editor.commit();
                }
                if (CF9.isChecked() == true) {
                    editor.putString("CF9", CF9.getText().toString());
                    editor.commit();
                }
                if (CF10.isChecked() == true) {
                    editor.putString("CF10", CF10.getText().toString());
                    editor.commit();
                }
                if (!CF1.isChecked() == true) {
                    editor.remove("CF1").commit();
                }
                if (!CF2.isChecked() == true) {
                    editor.remove("CF2").commit();
                }
                if (!CF3.isChecked() == true) {
                    editor.remove("CF3").commit();
                }
                if (!CF4.isChecked() == true) {
                    editor.remove("CF4").commit();
                }
                if (!CF5.isChecked() == true) {
                    editor.remove("CF5").commit();
                }
                if (!CF6.isChecked() == true) {
                    editor.remove("CF6").commit();
                }
                if (!CF7.isChecked() == true) {
                    editor.remove("CF7").commit();
                }
                if (!CF8.isChecked() == true) {
                    editor.remove("CF8").commit();
                }
                if (!CF9.isChecked() == true) {
                    editor.remove("CF9").commit();
                }
                if (!CF10.isChecked() == true) {
                    editor.remove("CF10").commit();
                }


                if (CM1.isChecked() == true) {
                    editor.putString("CM1", CM1.getText().toString());
                    editor.commit();
                }
                if (CM2.isChecked() == true) {
                    editor.putString("CM2", CM2.getText().toString());
                    editor.commit();
                }
                if (CM3.isChecked() == true) {
                    editor.putString("CM3", CM3.getText().toString());
                    editor.commit();
                }
                if (CM4.isChecked() == true) {
                    editor.putString("CM4", CM4.getText().toString());
                    editor.commit();
                }
                if (CM5.isChecked() == true) {
                    editor.putString("CM5", CM5.getText().toString());
                    editor.commit();
                }
                if (CM6.isChecked() == true) {
                    editor.putString("CM6", CM6.getText().toString());
                    editor.commit();
                }
                if (CM7.isChecked() == true) {
                    editor.putString("CM7", CM7.getText().toString());
                    editor.commit();
                }
                if (CM8.isChecked() == true) {
                    editor.putString("CM8.", CM8.getText().toString());
                    editor.commit();
                }
                if (CM9.isChecked() == true) {
                    editor.putString("CM9", CM9.getText().toString());
                    editor.commit();
                }
                if (CM10.isChecked() == true) {
                    editor.putString("CM10", CM10.getText().toString());
                    editor.commit();
                }
                if (CM11.isChecked() == true) {
                    editor.putString("CM11", CM11.getText().toString());
                    editor.commit();
                }
                if (!CM1.isChecked() == true) {
                    editor.remove("CM1").commit();
                }
                if (!CM2.isChecked() == true) {
                    editor.remove("CM2").commit();
                }
                if (!CM3.isChecked() == true) {
                    editor.remove("CM3").commit();
                }
                if (!CM4.isChecked() == true) {
                    editor.remove("CM4").commit();
                }
                if (!CM5.isChecked() == true) {
                    editor.remove("CM5").commit();
                }
                if (!CM6.isChecked() == true) {
                    editor.remove("CM6").commit();
                }
                if (!CM7.isChecked() == true) {
                    editor.remove("CM7").commit();
                }
                if (!CM8.isChecked() == true) {
                    editor.remove("CM8").commit();
                }
                if (!CM9.isChecked() == true) {
                    editor.remove("CM9").commit();
                }
                if (!CM10.isChecked() == true) {
                    editor.remove("CM10").commit();
                }
                if (!CM11.isChecked() == true) {
                    editor.remove("CM11").commit();
                }


                if (TF1.isChecked() == true) {
                    editor.putString("TF1", TF1.getText().toString());
                    editor.commit();
                }
                if (TF2.isChecked() == true) {
                    editor.putString("TF2", TF2.getText().toString());
                    editor.commit();
                }
                if (TF3.isChecked() == true) {
                    editor.putString("TF3", TF3.getText().toString());
                    editor.commit();
                }
                if (TF4.isChecked() == true) {
                    editor.putString("TF4", TF4.getText().toString());
                    editor.commit();
                }
                if (TF5.isChecked() == true) {
                    editor.putString("TF5", TF5.getText().toString());
                    editor.commit();
                }
                if (TF6.isChecked() == true) {
                    editor.putString("TF6", TF6.getText().toString());
                    editor.commit();
                }
                if (TF7.isChecked() == true) {
                    editor.putString("TF7", TF7.getText().toString());
                    editor.commit();
                }
                if (TF8.isChecked() == true) {
                    editor.putString("TF8.", TF8.getText().toString());
                    editor.commit();
                }
                if (TF9.isChecked() == true) {
                    editor.putString("TF9", TF9.getText().toString());
                    editor.commit();
                }
                if (TF10.isChecked() == true) {
                    editor.putString("TF10", TF10.getText().toString());
                    editor.commit();
                }
                if (TF11.isChecked() == true) {
                    editor.putString("TF11", TF11.getText().toString());
                    editor.commit();
                }
                if (!TF1.isChecked() == true) {
                    editor.remove("TF1").commit();
                }
                if (!TF2.isChecked() == true) {
                    editor.remove("TF2").commit();
                }
                if (!TF3.isChecked() == true) {
                    editor.remove("TF3").commit();
                }
                if (!TF4.isChecked() == true) {
                    editor.remove("TF4").commit();
                }
                if (!TF5.isChecked() == true) {
                    editor.remove("TF5").commit();
                }
                if (!TF6.isChecked() == true) {
                    editor.remove("TF6").commit();
                }
                if (!TF7.isChecked() == true) {
                    editor.remove("TF7").commit();
                }
                if (!TF8.isChecked() == true) {
                    editor.remove("TF8").commit();
                }
                if (!TF9.isChecked() == true) {
                    editor.remove("TF9").commit();
                }
                if (!TF10.isChecked() == true) {
                    editor.remove("TF10").commit();
                }
                if (!TF11.isChecked() == true) {
                    editor.remove("TF11").commit();
                }


                if (TM1.isChecked() == true) {
                    editor.putString("TM1", TM1.getText().toString());
                    editor.commit();
                }
                if (TM2.isChecked() == true) {
                    editor.putString("TM2", TM2.getText().toString());
                    editor.commit();
                }
                if (TM3.isChecked() == true) {
                    editor.putString("TM3", TM3.getText().toString());
                    editor.commit();
                }
                if (TM4.isChecked() == true) {
                    editor.putString("TM4", TM4.getText().toString());
                    editor.commit();
                }
                if (TM5.isChecked() == true) {
                    editor.putString("TM5", TM5.getText().toString());
                    editor.commit();
                }
                if (TM6.isChecked() == true) {
                    editor.putString("TM6", TM6.getText().toString());
                    editor.commit();
                }
                if (TM7.isChecked() == true) {
                    editor.putString("TM7", TM7.getText().toString());
                    editor.commit();
                }
                if (TM8.isChecked() == true) {
                    editor.putString("TM8.", TM8.getText().toString());
                    editor.commit();
                }
                if (TM9.isChecked() == true) {
                    editor.putString("TM9", TM9.getText().toString());
                    editor.commit();
                }
                if (TM10.isChecked() == true) {
                    editor.putString("TM10", TM10.getText().toString());
                    editor.commit();
                }
                if (TM11.isChecked() == true) {
                    editor.putString("TM11", TM11.getText().toString());
                    editor.commit();
                }
                if (!TM1.isChecked() == true) {
                    editor.remove("TM1").commit();
                }
                if (!TM2.isChecked() == true) {
                    editor.remove("TM2").commit();
                }
                if (!TM3.isChecked() == true) {
                    editor.remove("TM3").commit();
                }
                if (!TM4.isChecked() == true) {
                    editor.remove("TM4").commit();
                }
                if (!TM5.isChecked() == true) {
                    editor.remove("TM5").commit();
                }
                if (!TM6.isChecked() == true) {
                    editor.remove("TM6").commit();
                }
                if (!TM7.isChecked() == true) {
                    editor.remove("TM7").commit();
                }
                if (!TM8.isChecked() == true) {
                    editor.remove("TM8").commit();
                }
                if (!TM9.isChecked() == true) {
                    editor.remove("TM9").commit();
                }
                if (!TM10.isChecked() == true) {
                    editor.remove("TM10").commit();
                }
                if (!TM11.isChecked() == true) {
                    editor.remove("TM11").commit();
                }

                if (FC1.isChecked() == true) {
                    editor.putString("FC1", FC1.getText().toString());
                    editor.commit();
                }
                if (FC2.isChecked() == true) {
                    editor.putString("FC2", FC2.getText().toString());
                    editor.commit();
                }
                if (FC3.isChecked() == true) {
                    editor.putString("FC3", FC3.getText().toString());
                    editor.commit();
                }
                if (FC4.isChecked() == true) {
                    editor.putString("FC4", FC4.getText().toString());
                    editor.commit();
                }
                if (FC5.isChecked() == true) {
                    editor.putString("FC5", FC5.getText().toString());
                    editor.commit();
                }
                if (!FC1.isChecked() == true) {
                    editor.remove("FC1").commit();
                }
                if (!FC2.isChecked() == true) {
                    editor.remove("FC2").commit();
                }
                if (!FC3.isChecked() == true) {
                    editor.remove("FC3").commit();
                }
                if (!FC4.isChecked() == true) {
                    editor.remove("FC4").commit();
                }
                if (!FC5.isChecked() == true) {
                    editor.remove("FC5").commit();
                }

                if (FH1.isChecked() == true) {
                    editor.putString("FH1", FH1.getText().toString());
                    editor.commit();
                }
                if (FH2.isChecked() == true) {
                    editor.putString("FH2", FH2.getText().toString());
                    editor.commit();
                }
                if (FH3.isChecked() == true) {
                    editor.putString("FH3", FH3.getText().toString());
                    editor.commit();
                }
                if (FH4.isChecked() == true) {
                    editor.putString("FH4", FH4.getText().toString());
                    editor.commit();
                }
                if (FH5.isChecked() == true) {
                    editor.putString("FH5", FH5.getText().toString());
                    editor.commit();
                }
                if (!FH1.isChecked() == true) {
                    editor.remove("FH1").commit();
                }
                if (!FH2.isChecked() == true) {
                    editor.remove("FH2").commit();
                }
                if (!FH3.isChecked() == true) {
                    editor.remove("FH3").commit();
                }
                if (!FH4.isChecked() == true) {
                    editor.remove("FH4").commit();
                }
                if (!FH5.isChecked() == true) {
                    editor.remove("FH5").commit();
                }

                if (MI1.isChecked() == true) {
                    editor.putString("MI1", MI1.getText().toString());
                    editor.commit();
                }
                if (MI2.isChecked() == true) {
                    editor.putString("MI2", MI2.getText().toString());
                    editor.commit();
                }
                if (MI3.isChecked() == true) {
                    editor.putString("MI3", MI3.getText().toString());
                    editor.commit();
                }
                if (MI4.isChecked() == true) {
                    editor.putString("MI4", MI4.getText().toString());
                    editor.commit();
                }
                if (MI5.isChecked() == true) {
                    editor.putString("MI5", MI5.getText().toString());
                    editor.commit();
                }
                if (MI6.isChecked() == true) {
                    editor.putString("MI6", MI6.getText().toString());
                    editor.commit();
                }
                if (MI7.isChecked() == true) {
                    editor.putString("MI7", MI7.getText().toString());
                    editor.commit();
                }
                if (MI8.isChecked() == true) {
                    editor.putString("MI8.", MI8.getText().toString());
                    editor.commit();
                }
                if (MI9.isChecked() == true) {
                    editor.putString("MI9", MI9.getText().toString());
                    editor.commit();
                }
                if (MI10.isChecked() == true) {
                    editor.putString("MI10", MI10.getText().toString());
                    editor.commit();
                }
                if (MI11.isChecked() == true) {
                    editor.putString("MI11", MI11.getText().toString());
                    editor.commit();
                }
                if (MI12.isChecked() == true) {
                    editor.putString("MI12", MI12.getText().toString());
                    editor.commit();
                }
                if (MI13.isChecked() == true) {
                    editor.putString("MI13", MI13.getText().toString());
                    editor.commit();
                }
                if (MI14.isChecked() == true) {
                    editor.putString("MI14", MI14.getText().toString());
                    editor.commit();
                }
                if (!MI1.isChecked() == true) {
                    editor.remove("MI1").commit();
                }
                if (!MI2.isChecked() == true) {
                    editor.remove("MI2").commit();
                }
                if (!MI3.isChecked() == true) {
                    editor.remove("MI3").commit();
                }
                if (!MI4.isChecked() == true) {
                    editor.remove("MI4").commit();
                }
                if (!MI5.isChecked() == true) {
                    editor.remove("MI5").commit();
                }
                if (!MI6.isChecked() == true) {
                    editor.remove("MI6").commit();
                }
                if (!MI7.isChecked() == true) {
                    editor.remove("MI7").commit();
                }
                if (!MI8.isChecked() == true) {
                    editor.remove("MI8").commit();
                }
                if (!MI9.isChecked() == true) {
                    editor.remove("MI9").commit();
                }
                if (!MI10.isChecked() == true) {
                    editor.remove("MI10").commit();
                }
                if (!MI11.isChecked() == true) {
                    editor.remove("MI11").commit();
                }
                if (!MI12.isChecked() == true) {
                    editor.remove("MI12").commit();
                }
                if (!MI13.isChecked() == true) {
                    editor.remove("MI13").commit();
                }
                if (!MI14.isChecked() == true) {
                    editor.remove("MI14").commit();
                }

                if (SI1.isChecked() == true) {
                    editor.putString("SI1", SI1.getText().toString());
                    editor.commit();
                }
                if (SI2.isChecked() == true) {
                    editor.putString("SI2", SI2.getText().toString());
                    editor.commit();
                }
                if (SI3.isChecked() == true) {
                    editor.putString("SI3", SI3.getText().toString());
                    editor.commit();
                }
                if (SI4.isChecked() == true) {
                    editor.putString("SI4", SI4.getText().toString());
                    editor.commit();
                }
                if (SI5.isChecked() == true) {
                    editor.putString("SI5", SI5.getText().toString());
                    editor.commit();
                }
                if (SI6.isChecked() == true) {
                    editor.putString("SI6", SI6.getText().toString());
                    editor.commit();
                }
                if (SI7.isChecked() == true) {
                    editor.putString("SI7", SI7.getText().toString());
                    editor.commit();
                }
                if (SI8.isChecked() == true) {
                    editor.putString("SI8.", SI8.getText().toString());
                    editor.commit();
                }
                if (SI9.isChecked() == true) {
                    editor.putString("SI9", SI9.getText().toString());
                    editor.commit();
                }
                if (SI10.isChecked() == true) {
                    editor.putString("SI10", SI10.getText().toString());
                    editor.commit();
                }
                if (SI11.isChecked() == true) {
                    editor.putString("SI11", SI11.getText().toString());
                    editor.commit();
                }
                if (SI12.isChecked() == true) {
                    editor.putString("SI12", SI12.getText().toString());
                    editor.commit();
                }
                if (SI13.isChecked() == true) {
                    editor.putString("SI13", SI13.getText().toString());
                    editor.commit();
                }
                if (!SI1.isChecked() == true) {
                    editor.remove("SI1").commit();
                }
                if (!SI2.isChecked() == true) {
                    editor.remove("SI2").commit();
                }
                if (!SI3.isChecked() == true) {
                    editor.remove("SI3").commit();
                }
                if (!SI4.isChecked() == true) {
                    editor.remove("SI4").commit();
                }
                if (!SI5.isChecked() == true) {
                    editor.remove("SI5").commit();
                }
                if (!SI6.isChecked() == true) {
                    editor.remove("SI6").commit();
                }
                if (!SI7.isChecked() == true) {
                    editor.remove("SI7").commit();
                }
                if (!SI8.isChecked() == true) {
                    editor.remove("SI8").commit();
                }
                if (!SI9.isChecked() == true) {
                    editor.remove("SI9").commit();
                }
                if (!SI10.isChecked() == true) {
                    editor.remove("SI10").commit();
                }
                if (!SI11.isChecked() == true) {
                    editor.remove("SI11").commit();
                }
                if (!SI12.isChecked() == true) {
                    editor.remove("SI12").commit();
                }
                if (!SI13.isChecked() == true) {
                    editor.remove("SI13").commit();
                }


                if (II1.isChecked() == true) {
                    editor.putString("II1", II1.getText().toString());
                    editor.commit();
                }
                if (II2.isChecked() == true) {
                    editor.putString("II2", II2.getText().toString());
                    editor.commit();
                }
                if (II3.isChecked() == true) {
                    editor.putString("II3", II3.getText().toString());
                    editor.commit();
                }
                if (II4.isChecked() == true) {
                    editor.putString("II4", II4.getText().toString());
                    editor.commit();
                }
                if (II5.isChecked() == true) {
                    editor.putString("II5", II5.getText().toString());
                    editor.commit();
                }
                if (II6.isChecked() == true) {
                    editor.putString("II6", II6.getText().toString());
                    editor.commit();
                }
                if (II7.isChecked() == true) {
                    editor.putString("II7", II7.getText().toString());
                    editor.commit();
                }
                if (II8.isChecked() == true) {
                    editor.putString("II8.", II8.getText().toString());
                    editor.commit();
                }
                if (!II1.isChecked() == true) {
                    editor.remove("II1").commit();
                }
                if (!II2.isChecked() == true) {
                    editor.remove("II2").commit();
                }
                if (!II3.isChecked() == true) {
                    editor.remove("II3").commit();
                }
                if (!II4.isChecked() == true) {
                    editor.remove("II4").commit();
                }
                if (!II5.isChecked() == true) {
                    editor.remove("II5").commit();
                }
                if (!II6.isChecked() == true) {
                    editor.remove("II6").commit();
                }
                if (!II7.isChecked() == true) {
                    editor.remove("II7").commit();
                }
                if (!II8.isChecked() == true) {
                    editor.remove("II8").commit();
                }

                if (CI1.isChecked() == true) {
                    editor.putString("CI1", CI1.getText().toString());
                    editor.commit();
                }
                if (CI2.isChecked() == true) {
                    editor.putString("CI2", CI2.getText().toString());
                    editor.commit();
                }
                if (CI3.isChecked() == true) {
                    editor.putString("CI3", CI3.getText().toString());
                    editor.commit();
                }
                if (CI4.isChecked() == true) {
                    editor.putString("CI4", CI4.getText().toString());
                    editor.commit();
                }
                if (CI5.isChecked() == true) {
                    editor.putString("CI5", CI5.getText().toString());
                    editor.commit();
                }
                if (CI6.isChecked() == true) {
                    editor.putString("CI6", CI6.getText().toString());
                    editor.commit();
                }
                if (CI7.isChecked() == true) {
                    editor.putString("CI7", CI7.getText().toString());
                    editor.commit();
                }
                if (CI8.isChecked() == true) {
                    editor.putString("CI8.", CI8.getText().toString());
                    editor.commit();
                }
                if (CI9.isChecked() == true) {
                    editor.putString("CI9", CI9.getText().toString());
                    editor.commit();
                }
                if (CI10.isChecked() == true) {
                    editor.putString("CI10", CI10.getText().toString());
                    editor.commit();
                }
                if (CI11.isChecked() == true) {
                    editor.putString("CI11", CI11.getText().toString());
                    editor.commit();
                }
                if (CI12.isChecked() == true) {
                    editor.putString("CI12", CI12.getText().toString());
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
                if (!CI4.isChecked() == true) {
                    editor.remove("CI4").commit();
                }
                if (!CI5.isChecked() == true) {
                    editor.remove("CI5").commit();
                }
                if (!CI6.isChecked() == true) {
                    editor.remove("CI6").commit();
                }
                if (!CI7.isChecked() == true) {
                    editor.remove("CI7").commit();
                }
                if (!CI8.isChecked() == true) {
                    editor.remove("CI8").commit();
                }
                if (!CI9.isChecked() == true) {
                    editor.remove("CI9").commit();
                }
                if (!CI10.isChecked() == true) {
                    editor.remove("CI10").commit();
                }
                if (!CI11.isChecked() == true) {
                    editor.remove("CI11").commit();
                }
                if (!CI12.isChecked() == true) {
                    editor.remove("CI12").commit();
                }

                if (PI1.isChecked() == true) {
                    editor.putString("PI1", PI1.getText().toString());
                    editor.commit();
                }
                if (PI2.isChecked() == true) {
                    editor.putString("PI2", PI2.getText().toString());
                    editor.commit();
                }
                if (PI3.isChecked() == true) {
                    editor.putString("PI3", PI3.getText().toString());
                    editor.commit();
                }
                if (PI4.isChecked() == true) {
                    editor.putString("PI4", PI4.getText().toString());
                    editor.commit();
                }
                if (!PI1.isChecked() == true) {
                    editor.remove("PI1").commit();
                }
                if (!PI2.isChecked() == true) {
                    editor.remove("PI2").commit();
                }
                if (!PI3.isChecked() == true) {
                    editor.remove("PI3").commit();
                }
                if (!PI4.isChecked() == true) {
                    editor.remove("PI4").commit();
                }

                if (RI1.isChecked() == true) {
                    editor.putString("RI1", RI1.getText().toString());
                    editor.commit();
                }
                if (RI2.isChecked() == true) {
                    editor.putString("RI2", RI2.getText().toString());
                    editor.commit();
                }
                if (RI3.isChecked() == true) {
                    editor.putString("RI3", RI3.getText().toString());
                    editor.commit();
                }
                if (RI4.isChecked() == true) {
                    editor.putString("RI4", RI4.getText().toString());
                    editor.commit();
                }
                if (!RI1.isChecked() == true) {
                    editor.remove("RI1").commit();
                }
                if (!RI2.isChecked() == true) {
                    editor.remove("RI2").commit();
                }
                if (!RI3.isChecked() == true) {
                    editor.remove("RI3").commit();
                }
                if (!RI4.isChecked() == true) {
                    editor.remove("RI4").commit();
                }

                if (HE1.isChecked() == true) {
                    editor.putString("HE1", HE1.getText().toString());
                    editor.commit();
                }
                if (HE2.isChecked() == true) {
                    editor.putString("HE2", HE2.getText().toString());
                    editor.commit();
                }
                if (HE3.isChecked() == true) {
                    editor.putString("HE3", HE3.getText().toString());
                    editor.commit();
                }
                if (HE4.isChecked() == true) {
                    editor.putString("HE4", HE4.getText().toString());
                    editor.commit();
                }
                if (HE5.isChecked() == true) {
                    editor.putString("HE5", HE5.getText().toString());
                    editor.commit();
                }
                if (HE6.isChecked() == true) {
                    editor.putString("HE6", HE6.getText().toString());
                    editor.commit();
                }
                if (HE7.isChecked() == true) {
                    editor.putString("HE7", HE7.getText().toString());
                    editor.commit();
                }
                if (!HE1.isChecked() == true) {
                    editor.remove("HE1").commit();
                }
                if (!HE2.isChecked() == true) {
                    editor.remove("HE2").commit();
                }
                if (!HE3.isChecked() == true) {
                    editor.remove("HE3").commit();
                }
                if (!HE4.isChecked() == true) {
                    editor.remove("HE4").commit();
                }
                if (!HE5.isChecked() == true) {
                    editor.remove("HE5").commit();
                }
                if (!HE6.isChecked() == true) {
                    editor.remove("HE6").commit();
                }
                if (!HE7.isChecked() == true) {
                    editor.remove("HE7").commit();
                }

                if (ET1.isChecked() == true) {
                    editor.putString("ET1", ET1.getText().toString());
                    editor.commit();
                }
                if (ET2.isChecked() == true) {
                    editor.putString("ET2", ET2.getText().toString());
                    editor.commit();
                }
                if (ET3.isChecked() == true) {
                    editor.putString("ET3", ET3.getText().toString());
                    editor.commit();
                }
                if (ET4.isChecked() == true) {
                    editor.putString("ET4", ET4.getText().toString());
                    editor.commit();
                }
                if (!ET1.isChecked() == true) {
                    editor.remove("ET1").commit();
                }
                if (!ET2.isChecked() == true) {
                    editor.remove("ET2").commit();
                }
                if (!ET3.isChecked() == true) {
                    editor.remove("ET3").commit();
                }
                if (!ET4.isChecked() == true) {
                    editor.remove("ET4").commit();
                }


                if (CE1.isChecked() == true) {
                    editor.putString("CE1", CE1.getText().toString());
                    editor.commit();
                }
                if (CE2.isChecked() == true) {
                    editor.putString("CE2", CE2.getText().toString());
                    editor.commit();
                }
                if (CE3.isChecked() == true) {
                    editor.putString("CE3", CE3.getText().toString());
                    editor.commit();
                }
                if (CE4.isChecked() == true) {
                    editor.putString("CE4", CE4.getText().toString());
                    editor.commit();
                }
                if (CE5.isChecked() == true) {
                    editor.putString("CE5", CE5.getText().toString());
                    editor.commit();
                }
                if (!CE1.isChecked() == true) {
                    editor.remove("CE1").commit();
                }
                if (!CE2.isChecked() == true) {
                    editor.remove("CE2").commit();
                }
                if (!CE3.isChecked() == true) {
                    editor.remove("CE3").commit();
                }
                if (!CE4.isChecked() == true) {
                    editor.remove("CE4").commit();
                }
                if (!CE5.isChecked() == true) {
                    editor.remove("CE5").commit();
                }

                if (ME1.isChecked() == true) {
                    editor.putString("ME1", ME1.getText().toString());
                    editor.commit();
                }
                if (ME2.isChecked() == true) {
                    editor.putString("ME2", ME2.getText().toString());
                    editor.commit();
                }
                if (ME3.isChecked() == true) {
                    editor.putString("ME3", ME3.getText().toString());
                    editor.commit();
                }
                if (ME4.isChecked() == true) {
                    editor.putString("ME4", ME4.getText().toString());
                    editor.commit();
                }
                if (!ME1.isChecked() == true) {
                    editor.remove("ME1").commit();
                }
                if (!ME2.isChecked() == true) {
                    editor.remove("ME2").commit();
                }
                if (!ME3.isChecked() == true) {
                    editor.remove("ME3").commit();
                }
                if (!ME4.isChecked() == true) {
                    editor.remove("ME4").commit();
                }


                if (DE1.isChecked() == true) {
                    editor.putString("DE1", DE1.getText().toString());
                    editor.commit();
                }
                if (DE2.isChecked() == true) {
                    editor.putString("DE2", DE2.getText().toString());
                    editor.commit();
                }
                if (DE3.isChecked() == true) {
                    editor.putString("DE3", DE3.getText().toString());
                    editor.commit();
                }
                if (DE4.isChecked() == true) {
                    editor.putString("DE4", DE4.getText().toString());
                    editor.commit();
                }
                if (DE5.isChecked() == true) {
                    editor.putString("DE5", DE5.getText().toString());
                    editor.commit();
                }
                if (DE6.isChecked() == true) {
                    editor.putString("DE6", DE6.getText().toString());
                    editor.commit();
                }
                if (DE7.isChecked() == true) {
                    editor.putString("DE7", DE7.getText().toString());
                    editor.commit();
                }
                if (!DE1.isChecked() == true) {
                    editor.remove("DE1").commit();
                }
                if (!DE2.isChecked() == true) {
                    editor.remove("DE2").commit();
                }
                if (!DE3.isChecked() == true) {
                    editor.remove("DE3").commit();
                }
                if (!DE4.isChecked() == true) {
                    editor.remove("DE4").commit();
                }
                if (!DE5.isChecked() == true) {
                    editor.remove("DE5").commit();
                }
                if (!DE6.isChecked() == true) {
                    editor.remove("DE6").commit();
                }
                if (!DE7.isChecked() == true) {
                    editor.remove("DE7").commit();
                }

                if (CIC1.isChecked() == true) {
                    editor.putString("CIC1", CIC1.getText().toString());
                    editor.commit();
                }
                if (CIC2.isChecked() == true) {
                    editor.putString("CIC2", CIC2.getText().toString());
                    editor.commit();
                }
                if (!CIC1.isChecked() == true) {
                    editor.remove("CIC1").commit();
                }
                if (!CIC2.isChecked() == true) {
                    editor.remove("CIC2").commit();
                }

                if (CIN1.isChecked() == true) {
                    editor.putString("CIN1", CIN1.getText().toString());
                    editor.commit();
                }
                if (CIN2.isChecked() == true) {
                    editor.putString("CIN2", CIN2.getText().toString());
                    editor.commit();
                }
                if (!CIN1.isChecked() == true) {
                    editor.remove("CIN1").commit();
                }
                if (!CIN2.isChecked() == true) {
                    editor.remove("CIN2").commit();
                }

                if (CF1.isChecked() == true ||
                        CF2.isChecked() == true ||
                        CF3.isChecked() == true ||
                        CF4.isChecked() == true ||
                        CF5.isChecked() == true ||
                        CF6.isChecked() == true ||
                        CF7.isChecked() == true ||
                        CF8.isChecked() == true ||
                        CF9.isChecked() == true ||
                        CF10.isChecked() == true ||
                        CM1.isChecked() == true ||
                        CM2.isChecked() == true ||
                        CM3.isChecked() == true ||
                        CM4.isChecked() == true ||
                        CM5.isChecked() == true ||
                        CM6.isChecked() == true ||
                        CM7.isChecked() == true ||
                        CM8.isChecked() == true ||
                        CM9.isChecked() == true ||
                        CM10.isChecked() == true ||
                        CM11.isChecked() == true ||
                        TF1.isChecked() == true ||
                        TF2.isChecked() == true ||
                        TF3.isChecked() == true ||
                        TF4.isChecked() == true ||
                        TF5.isChecked() == true ||
                        TF6.isChecked() == true ||
                        TF7.isChecked() == true ||
                        TF8.isChecked() == true ||
                        TF9.isChecked() == true ||
                        TF10.isChecked() == true ||
                        TF11.isChecked() == true ||
                        TM1.isChecked() == true ||
                        TM2.isChecked() == true ||
                        TM3.isChecked() == true ||
                        TM4.isChecked() == true ||
                        TM5.isChecked() == true ||
                        TM6.isChecked() == true ||
                        TM7.isChecked() == true ||
                        TM8.isChecked() == true ||
                        TM9.isChecked() == true ||
                        TM10.isChecked() == true ||
                        TM11.isChecked() == true ||
                        FC1.isChecked() == true ||
                        FC2.isChecked() == true ||
                        FC3.isChecked() == true ||
                        FC4.isChecked() == true ||
                        FC5.isChecked() == true ||
                        FH1.isChecked() == true ||
                        FH2.isChecked() == true ||
                        FH3.isChecked() == true ||
                        FH4.isChecked() == true ||
                        FH5.isChecked() == true ||
                        MI1.isChecked() == true ||
                        MI2.isChecked() == true ||
                        MI3.isChecked() == true ||
                        MI4.isChecked() == true ||
                        MI5.isChecked() == true ||
                        MI6.isChecked() == true ||
                        MI7.isChecked() == true ||
                        MI8.isChecked() == true ||
                        MI9.isChecked() == true ||
                        MI10.isChecked() == true ||
                        MI11.isChecked() == true ||
                        MI12.isChecked() == true ||
                        MI13.isChecked() == true ||
                        MI14.isChecked() == true ||
                        SI1.isChecked() == true ||
                        SI2.isChecked() == true ||
                        SI3.isChecked() == true ||
                        SI4.isChecked() == true ||
                        SI5.isChecked() == true ||
                        SI6.isChecked() == true ||
                        SI7.isChecked() == true ||
                        SI8.isChecked() == true ||
                        SI9.isChecked() == true ||
                        SI10.isChecked() == true ||
                        SI11.isChecked() == true ||
                        SI12.isChecked() == true ||
                        SI13.isChecked() == true ||
                        II1.isChecked() == true ||
                        II2.isChecked() == true ||
                        II3.isChecked() == true ||
                        II4.isChecked() == true ||
                        II5.isChecked() == true ||
                        II6.isChecked() == true ||
                        II7.isChecked() == true ||
                        II8.isChecked() == true ||
                        CI1.isChecked() == true ||
                        CI2.isChecked() == true ||
                        CI3.isChecked() == true ||
                        CI4.isChecked() == true ||
                        CI5.isChecked() == true ||
                        CI6.isChecked() == true ||
                        CI7.isChecked() == true ||
                        CI8.isChecked() == true ||
                        CI9.isChecked() == true ||
                        CI10.isChecked() == true ||
                        CI11.isChecked() == true ||
                        CI12.isChecked() == true ||
                        PI1.isChecked() == true ||
                        PI2.isChecked() == true ||
                        PI3.isChecked() == true ||
                        PI4.isChecked() == true ||
                        RI1.isChecked() == true ||
                        RI2.isChecked() == true ||
                        RI3.isChecked() == true ||
                        RI4.isChecked() == true ||
                        HE1.isChecked() == true ||
                        HE2.isChecked() == true ||
                        HE3.isChecked() == true ||
                        HE4.isChecked() == true ||
                        HE5.isChecked() == true ||
                        HE6.isChecked() == true ||
                        HE7.isChecked() == true ||
                        ET1.isChecked() == true ||
                        ET2.isChecked() == true ||
                        ET3.isChecked() == true ||
                        ET4.isChecked() == true ||
                        CE1.isChecked() == true ||
                        CE2.isChecked() == true ||
                        CE3.isChecked() == true ||
                        CE4.isChecked() == true ||
                        CE5.isChecked() == true ||
                        ME1.isChecked() == true ||
                        ME2.isChecked() == true ||
                        ME3.isChecked() == true ||
                        ME4.isChecked() == true ||
                        DE1.isChecked() == true ||
                        DE2.isChecked() == true ||
                        DE3.isChecked() == true ||
                        DE4.isChecked() == true ||
                        DE5.isChecked() == true ||
                        DE6.isChecked() == true ||
                        DE7.isChecked() == true ||
                        CIC1.isChecked() == true ||
                        CIC2.isChecked() == true ||
                        CIN1.isChecked() == true ||
                        CIN2.isChecked() == true) {
                    startActivity(new Intent(getApplicationContext(), RegistroAccidente7.class));
                    finish();
                } else {
                    Toast.makeText(RegistroAccidente06.this, "Seleccione al menos una opción", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}