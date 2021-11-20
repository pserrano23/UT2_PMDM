package es.dam.pmdm.ejspinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Spinner.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] elementos={"Elemento 1","Elemento 2","Elemento 3","Elemento 4"};

        ArrayAdapter<String> adapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp=(Spinner)findViewById(R.id.spinner);
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,elementos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Callback cuando se selcciona un elemento del spinner

        TextView t=(TextView)findViewById(R.id.textview);
        Spinner sp=(Spinner)findViewById(R.id.spinner);

        t.setText(sp.getSelectedItem().toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
