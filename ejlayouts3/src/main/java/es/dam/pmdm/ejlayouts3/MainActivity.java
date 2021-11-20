package es.dam.pmdm.ejlayouts3;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AnadeHijos();
        Recorrer();
    }

    @Override
    public void onClick(View v) {

        Button b=(Button)v;
        b.setBackgroundColor(Color.rgb(255, 0, 0));
        TextView  tv=(TextView) findViewById(R.id.textView);
        tv.setText("El boton pulsado ha sido:"+b.getText());

    }

    private void AnadeHijos() {
        GridLayout g=(GridLayout)findViewById(R.id.grid1);
        //fija el número de filas y columnas del GridLayout
        g.setRowCount(6);
        g.setColumnCount(3);
        Button b;

        //Crear 18 botones dentro del for :fijamos texto, idy lo asociamos
        // al Layout,
        //además añadimos una función de respuesta al evento click
        for (int i=0;i<18;i++){
            //le pasamos al botón la actividad principal como contexto
            b=new Button(this);
            b.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            b.setText("btn"+i);
            b.setId(View.generateViewId());//Requiere API21, devuelve un ID
            b.setOnClickListener(this);
            //añadimos el botón al GridLayout
            g.addView(b);
        }
    }

/*    private void Recorrer(){
        Button b;
        GridLayout g=(GridLayout)findViewById(R.id.grid1);
        for (int i=0; i<g.getChildCount();i++){
            b=(Button) g.getChildAt(i);

            Log.d("Objeto1:"," "+ b.getText());
        }

    }*/

    //Forma de hacer un cast si hay varios tipos de objetos. Son subclases de View
    private void Recorrer(){
        Button b;
        View v;
        GridLayout g=(GridLayout)findViewById(R.id.grid1);


        //Vemos cuantos elementos hijo tiene el GridLayout
        for (int i=0; i<g.getChildCount();i++){
            v= g.getChildAt(i);
            //Nos permite ver el tipo de hijo de GridLayout, en este caso Button
            if (v.getClass().getSimpleName().equals("Button")){
                b=(Button)v;
                //Visualizamos en el logcat, nos puede servir para depurar
                Log.d("Objeto :"," "+ b.getText());

            }

        }

    }



}
