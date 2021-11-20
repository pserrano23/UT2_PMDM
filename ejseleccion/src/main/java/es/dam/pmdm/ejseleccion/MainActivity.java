package es.dam.pmdm.ejseleccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] elementos={"Toledo","Cuenca","Albacete"};
        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);

        adaptador=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,elementos);

        listView.setAdapter(adaptador);

        //listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView=(TextView) findViewById(R.id.textView3);

        textView.setText("Has elegido la opción: "+parent.getItemAtPosition(position).toString());
    }
}
