package pe.edu.tecsup.reportesmodasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroAccidente10 extends AppCompatActivity {

    Button btnSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente10);
        getSupportActionBar().hide();

        btnSiguiente=findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref= getSharedPreferences("Accidente", Context.MODE_PRIVATE);
                startActivity(new Intent(getApplicationContext(),AdminHomeActivity.class));
                finish();
            }
        });
    }
}