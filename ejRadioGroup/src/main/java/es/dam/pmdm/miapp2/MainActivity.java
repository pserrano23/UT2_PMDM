/*Ejemplo con RadioGroup y CheckBox*/


package es.dam.pmdm.miapp2;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        CheckBox.OnCheckedChangeListener{

    private RadioGroup rg;
    private CheckBox cb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculamos al objeto rg con la interfaz gráfica XML
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        cb=(CheckBox)findViewById(R.id.checkBox);
        //asociamos un listener para un evento al control radiobutton
        rg.setOnCheckedChangeListener(this);
        cb.setOnCheckedChangeListener(this);
    }

    // Método de respuesta al evento
    @Override
    public void onCheckedChanged(RadioGroup group, int op) {
        TextView textView=(TextView)findViewById(R.id.textView_opcion);
        switch (op){
            case R.id.radioButton:
                textView.setText("La opción elegida es 1");
                break;
            case R.id.radioButton2:
                textView.setText("La opción elegida es 2");
                break;
            case R.id.radioButton3:
                textView.setText("La opción elegida es 3");
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        TextView textView=(TextView)findViewById(R.id.textView_cb);
        if (isChecked)
            textView.setText("Te gusta la opción!!!");
        else
            textView.setText("No te gusta la opción!!!");
    }
}
