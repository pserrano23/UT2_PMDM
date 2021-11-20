package es.dam.pmdm.ejinicial2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Button bMas,bMenos;
    private TextView textView;
    private int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bMas=(Button) findViewById(R.id.bMas);
        bMenos=(Button) findViewById(R.id.bMenos);
        textView=(TextView)findViewById(R.id.textView);

        cont=0;

        bMas.setOnClickListener(new RespuestaBotonMas());
        bMenos.setOnClickListener(new RespuestaBotonMenos());
    }

    class RespuestaBotonMas implements  View.OnClickListener{

        @Override
        public void onClick(View view) {
            cont++;
            Log.e("contador", String.valueOf(cont));
            textView.setText("Votos:"+cont);
        }
    }
    class RespuestaBotonMenos implements  View.OnClickListener{

        @Override
        public void onClick(View view) {
            cont--;
            textView.setText("Votos:"+cont);
        }
    }

}
