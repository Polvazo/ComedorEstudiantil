package ventureapp.comedorestudiantil.Main;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ventureapp.comedorestudiantil.R;


public class menuLogin extends AppCompatActivity {
    private Button separar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_login);
separar = (Button)findViewById(R.id.separar_ticket);
        separar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar = new Intent(menuLogin.this, separarTicket.class);
                startActivity(pasar);

            }
        });
    }




}
