package net.mx.com.cetis108.hola1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.*;

public class Hola extends AppCompatActivity {

    Button masacuata;
    TextView nepe;
    EditText chino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);

        masacuata = (Button) findViewById(R.id.Masacuata);
        nepe = (TextView) findViewById(R.id.nepe);
        chino = (EditText) findViewById(R.id.chino);


        masacuata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                String resultado = chino.getText().toString();
                nepe.setText("Hola " + resultado);

            }


        });
    }
}
