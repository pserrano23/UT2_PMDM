package es.dam.pmdm.ejinicial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;
    private Button button;
    private int cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciamos los objetos Java a los componentes creados en el XML
        textView=(TextView) findViewById(R.id.textView);
        button=(Button) findViewById(R.id.button);
        cont=0;

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        cont++;
        textView.setText("Número de veces pulsado:"+cont);
    }
}
