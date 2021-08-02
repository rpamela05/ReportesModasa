package pe.edu.tecsup.reportesmodasa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText email, contraseña;
    Button btnIngresar,btnRegistrar;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();



        fAuth= FirebaseAuth.getInstance();
        fStore=FirebaseFirestore.getInstance();

        email=findViewById(R.id.txtEmail);
        contraseña=findViewById(R.id.txtContraseña);
        btnIngresar=findViewById(R.id.btnIniciar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (email.getText().toString().isEmpty() || contraseña.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Ingrese contraseña y/o correo", Toast.LENGTH_SHORT).show();
                }else{
                fAuth.signInWithEmailAndPassword(email.getText().toString(),contraseña.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        checkUserAccessLevel(authResult.getUser().getUid());
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(LoginActivity.this, "Correo y/o contraseña incorrectas", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            }
        });

        

    }
    private void checkUserAccessLevel(String uid) {
        DocumentReference df= fStore.collection("Users").document(uid);
        df.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.getString("isAdmin")!= null){
                    startActivity(new Intent(getApplicationContext(), AdminHomeActivity.class));
                    finish();
                }if(documentSnapshot.getString("isUser")!= null){
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    finish();
                }
            }
        });
    }
}