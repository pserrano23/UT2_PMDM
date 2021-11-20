package es.dam.pmdm.ejemplo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements EditText.OnEditorActionListener{

    private EditText editT1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editT1=(EditText)findViewById(R.id.editText4);
        tv1=(TextView)findViewById(R.id.textView2);

        editT1.setOnEditorActionListener(this);
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        boolean manejada=false;

        if (actionId== EditorInfo.IME_ACTION_SEND){
            tv1.setText("Has pulsado: "+editT1.getText().toString());
            manejada=true;
        }

        return manejada;
    }
}
