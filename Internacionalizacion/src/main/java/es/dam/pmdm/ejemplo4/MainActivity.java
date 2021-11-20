package es.dam.pmdm.ejemplo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    boolean cambiarTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button)findViewById(R.id.button);
        cambiarTexto=false;
    }

    public void cambiaTexto(View v){
        TextView tv1=(TextView)findViewById(R.id.textView);

        if (cambiarTexto==false){
            tv1.setText(getString(R.string.saludo2));
            cambiarTexto=true;
        }

        else{
            tv1.setText(getString(R.string.saludo));
            cambiarTexto=false;
        }

    }
}
