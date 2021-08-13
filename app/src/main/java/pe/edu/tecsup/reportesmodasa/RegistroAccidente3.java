package pe.edu.tecsup.reportesmodasa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegistroAccidente3 extends AppCompatActivity {
    private static final int COD_SELECCIONA = 10;
    private static final int COD_FOTO = 20;
    Button btnSiguiente,btnSeleccionar1,btnSeleccionar2,btnSeleccionar3;
    EditText nroRegistro,edtDescripcion;
    ImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_accidente3);
        getSupportActionBar().hide();

        btnSiguiente=findViewById(R.id.btnSiguiente);
        btnSeleccionar1=findViewById(R.id.btnSeleccionar1);
        btnSeleccionar2=findViewById(R.id.btnSeleccionar2);
        btnSeleccionar3=findViewById(R.id.btnSeleccionar3);
        nroRegistro=findViewById(R.id.nroRegistro);
        edtDescripcion=findViewById(R.id.edtDescripcion);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);


        SharedPreferences pref=getSharedPreferences("Accidente", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();

        String codigo=pref.getString("codigo","");


        btnSeleccionar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogoOpciones();
            }
        });
        btnSeleccionar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogoOpciones2();
            }
        });
        btnSeleccionar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogoOpciones3();
            }
        });


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RegistroAccidente4.class));
                finish();
            }
        });
    }

    private void mostrarDialogoOpciones3() {
        final CharSequence[] opciones={"Tomar Foto","Elegir de Galeria","Cancelar"};
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Elegir una Opción");
        builder.setItems(opciones, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                if (opciones[i].equals("Tomar Foto")){

                }else {
                    if(opciones[i].equals("Elegir de Galeria")){
                        Intent intent=new Intent(Intent.ACTION_GET_CONTENT, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        intent.setType("image/*");
                        startActivityForResult(Intent.createChooser(intent,"Seleccione"),14);
                    }else{
                        dialog.dismiss();
                    }
                }
            }
        });
        builder.show();
    }

    private void mostrarDialogoOpciones2() {
        final CharSequence[] opciones={"Tomar Foto","Elegir de Galeria","Cancelar"};
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Elegir una Opción");
        builder.setItems(opciones, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                if (opciones[i].equals("Tomar Foto")){

                }else {
                    if(opciones[i].equals("Elegir de Galeria")){
                        Intent intent=new Intent(Intent.ACTION_GET_CONTENT, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        intent.setType("image/*");
                        startActivityForResult(Intent.createChooser(intent,"Seleccione"),12);
                    }else{
                        dialog.dismiss();
                    }
                }
            }
        });
        builder.show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==10){
            Uri miPath=data.getData();
            img1.setImageURI(miPath);
        }if(requestCode==12){
            Uri miPath2=data.getData();
            img2.setImageURI(miPath2);
        }if(requestCode==14){
            Uri miPath3=data.getData();
            img3.setImageURI(miPath3);
        }
    }

    private void mostrarDialogoOpciones() {
        final CharSequence[] opciones={"Tomar Foto","Elegir de Galeria","Cancelar"};
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Elegir una Opción");
        builder.setItems(opciones, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                if (opciones[i].equals("Tomar Foto")){

                }else {
                    if(opciones[i].equals("Elegir de Galeria")){
                        Intent intent=new Intent(Intent.ACTION_GET_CONTENT, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        intent.setType("image/*");
                        startActivityForResult(Intent.createChooser(intent,"Seleccione"),10);
                    }else{
                        dialog.dismiss();
                    }
                }
            }
        });
        builder.show();
    }
}