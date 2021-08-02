package pe.edu.tecsup.reportesmodasa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AdminHomeActivity extends AppCompatActivity {

    GridView gridView;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    EditText email, contraseña, rcontraseña;

    String[] opciones = {"Agregar usuario", "Lista de declaraciones"
            ,"Registro del accidente","Cerrar sesión"};

    int[] imagenes = {R.drawable.ic_outline_person_add_24,
            R.drawable.ic_baseline_view_headline_24,R.drawable.ic_outline_assignment_24,R.drawable.ic_outline_login_24};
    int[] colores={R.color.add_user,R.color.lista_declaraciones,R.color.registro_accidente,R.color.log_out};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fAuth= FirebaseAuth.getInstance();
        fStore=FirebaseFirestore.getInstance();

        MainAdapter adapter = new MainAdapter(AdminHomeActivity.this,opciones,imagenes,colores);
        gridView=findViewById(R.id.uGridView);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    AlertDialog.Builder builder=new AlertDialog.Builder(AdminHomeActivity.this);

                    View v=getLayoutInflater().inflate(R.layout.custom_dialog,null);


                    email=v.findViewById(R.id.txtcorreo);
                    contraseña=v.findViewById(R.id.txtcontraseña);
                    rcontraseña=v.findViewById(R.id.txtrcontraseña);

                    builder.setTitle("Crear usuario");
                    builder.setView(v);

                    builder.setNegativeButton("Cancelar",null);
                    builder.setPositiveButton("Crear", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (contraseña.getText().toString().equals(rcontraseña.getText().toString())){
                                        fAuth.createUserWithEmailAndPassword(email.getText().toString(),contraseña.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                            @Override
                                            public void onSuccess(AuthResult authResult) {
                                                FirebaseUser user = fAuth.getCurrentUser();
                                                Toast.makeText(AdminHomeActivity.this, "Usuario Creado", Toast.LENGTH_SHORT).show();
                                                DocumentReference documentReference= fStore.collection("Users").document(user.getUid());
                                                Map<String,Object> userInfo=new HashMap<>();
                                                userInfo.put("Email",email.getText().toString());
                                                userInfo.put("isUser","1");
                                                documentReference.set(userInfo);
                                                startActivity(new Intent(getApplicationContext(), AdminHomeActivity.class));
                                                finish();
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Toast.makeText(AdminHomeActivity.this, "Error", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            }else{
                                Toast.makeText(AdminHomeActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    builder.show();

                }if (position==1){
                    Toast.makeText(AdminHomeActivity.this, "1", Toast.LENGTH_SHORT).show();
                }if (position==2){
                    Intent intent=new Intent(AdminHomeActivity.this,RegistroAccidente.class);
                    startActivity(intent);
                }if (position==3){
                    FirebaseAuth.getInstance().signOut();
                    startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                    finish();
                }
            }
        });

    }
}