package ventureapp.comedorestudiantil.Main;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import ventureapp.comedorestudiantil.R;

public class principal extends AppCompatActivity {
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Declaraion
        register = (Button)findViewById(R.id.btn_registrar);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(principal.this);
                View mview = getLayoutInflater().inflate(R.layout.registro_fragmento, null);

                dialogBuilder.setView(mview);
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });


    }
    public void login (View view){
        Intent pasar = new Intent(principal.this, menuLogin.class);
        startActivity(pasar);

    }

}
