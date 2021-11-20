package es.dam.pmdm.ejcuadrodialogo;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton=(Button)findViewById(R.id.button2);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Construye un cuadro de dialogo con el theme por defecto
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

        // Instancia un layout XML a su correspondiente objeto view
        View viewDialogo=getLayoutInflater().inflate(R.layout.dialogo_login,null);
        //Obligatorio: se definen final para asegurar que se conserva el valor en la clase interna
        //(es un tema de hilos)
        final EditText email=(EditText)viewDialogo.findViewById(R.id.editTextMail);
        final EditText passwd=(EditText)viewDialogo.findViewById(R.id.editTextPasswd);
        Button loginBtn=(Button)viewDialogo.findViewById(R.id.button);

        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!email.getText().toString().isEmpty() && !passwd.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Login correcto",Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,"Login incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Para que se muestre el cuadro de dialogo
        //Sets a custom view to be the contents of the alert dialog
        builder.setView(viewDialogo);


        //Creates an AlertDialog with the arguments supplied to this builder
        // and immediately displays the dialog.
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
