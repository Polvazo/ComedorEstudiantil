package ventureapp.comedorestudiantil.Main;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import ventureapp.comedorestudiantil.R;

public class separarTicket extends AppCompatActivity implements View.OnClickListener {

    public ListView turno=null;
    public TextView horario;
    private ListView nivel=null;
    public String turnoComida;
    public Button generarTickets;
    public Button seleccionarTurno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.separar_ticket);

        generarTickets = (Button)findViewById(R.id.btn_confirmar);
        generarTickets.setOnClickListener(this);

        seleccionarTurno = (Button)findViewById(R.id.btn_registrar_ticket);
        seleccionarTurno.setOnClickListener(this);

        turno =new ListView(this);

        String [] itemturno = {" Nivel 1 : Turno 12:00 - 12:45 ","Nivel 1 : Turno 12:45 - 1:30","Nivel 1 : Turno 1:30- 2:15"," Nivel 2 : Turno 12:00 - 12:45 ","Nivel 2 : Turno 12:45 - 1:30","Nivel 2 : Turno 1:30- 2:15"};


        ArrayAdapter<String> adapterturno = new ArrayAdapter<String>(this, R.layout.listmenu, R.id.listitem, itemturno);

        turno.setAdapter(adapterturno);


        turno.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view.setSelected(true);
                ViewGroup vg1 = (ViewGroup)view;
                ((ViewGroup) turno.getParent()).removeView(turno);
                 horario = (TextView)vg1.findViewById(R.id.listitem);
                 turnoComida = horario.getText().toString();

            }
        });



    }
   /* public void showDialogListView(View view){

       AlertDialog.Builder builder=new
                AlertDialog.Builder(separarTicket.this);

        builder.setCancelable(true);
        builder.setPositiveButton("OK",null);
        builder.setView(turno);
        AlertDialog dialog=builder.create();
        dialog.show();

        /*AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(separarTicket.this);
        View mview = getLayoutInflater().inflate(R.layout.listmenu, null);
        dialogBuilder.setView(turno);
        dialogBuilder.setPositiveButton("OK",null);
        AlertDialog dialog = dialogBuilder.create();

        dialogBuilder.setView(turno);
        dialog.show();*/



    /*public void generarTicker (View view){

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(separarTicket.this);
        View mview = getLayoutInflater().inflate(R.layout.designticket, null);
        TextView fechaSistema = (TextView) mview.findViewById(R.id.fechaSistema);
        TextView turno        = (TextView) mview.findViewById(R.id.tx_turno);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        fechaSistema.setText(formattedDate);
        turno.setText(turnoComida);



        dialogBuilder.setView(mview);
        AlertDialog dialog = dialogBuilder.create();
        dialog.show();

    }
*/

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_confirmar:

                    AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(separarTicket.this);
                    View mview = getLayoutInflater().inflate(R.layout.designticket, null);
                    TextView fechaSistema = (TextView) mview.findViewById(R.id.fechaSistema);
                    TextView turno1        = (TextView) mview.findViewById(R.id.tx_turno);

                    Calendar c = Calendar.getInstance();
                    SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    String formattedDate = df.format(c.getTime());
                    fechaSistema.setText(formattedDate);
                    turno1.setText(turnoComida);



                    dialogBuilder.setView(mview);
                    AlertDialog dialog = dialogBuilder.create();
                    dialog.show();







            case R.id.btn_registrar_ticket:



                    Toast.makeText(separarTicket.this,"Usted se Registró",Toast.LENGTH_SHORT).show();



                    AlertDialog.Builder builder=new
                            AlertDialog.Builder(separarTicket.this);

                    builder.setCancelable(true);
                    builder.setPositiveButton("OK",null);
                    builder.setView(turno);
                    AlertDialog dialog1=builder.create();
                    dialog1.show();


        }

    }
}
