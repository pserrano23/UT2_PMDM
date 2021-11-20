package es.dam.pmdm.ejemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;



public class MainActivity extends AppCompatActivity implements ToggleButton.OnCheckedChangeListener,
    ImageButton.OnClickListener{

    private ToggleButton tb;
    private ImageView im1;
    private ImageView im2;
    private ImageButton imB1;
    private ImageButton imB2;
    private TextView tV_estado_llamada;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb=(ToggleButton)findViewById(R.id.toggleButton);
        im1=(ImageView)findViewById(R.id.imageView3);
        im2=(ImageView)findViewById(R.id.imageView4);
        imB1=(ImageButton)findViewById(R.id.imageButton2);
        imB2=(ImageButton)findViewById(R.id.imageButton3);
        tV_estado_llamada=(TextView)findViewById(R.id.textViewEstadoLlamada);

        im1.setVisibility(View.VISIBLE);
        im2.setVisibility(View.INVISIBLE);
        imB1.setVisibility(View.VISIBLE);
        imB2.setVisibility(View.INVISIBLE);

        tb.setOnCheckedChangeListener(this);
        imB1.setOnClickListener(this);
        imB2.setOnClickListener(this);
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.VISIBLE);
        } else{
            im1.setVisibility(View.VISIBLE);
            im2.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.imageButton2){
            imB1.setVisibility(View.INVISIBLE);
            imB2.setVisibility(View.VISIBLE);
            tV_estado_llamada.setText("Llamando...");
        } else{
            imB1.setVisibility(View.VISIBLE);
            imB2.setVisibility(View.INVISIBLE);
            tV_estado_llamada.setText("Pulsa para llamar...");
        }

    }
}
