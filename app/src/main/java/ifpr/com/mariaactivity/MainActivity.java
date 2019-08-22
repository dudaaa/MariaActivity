package ifpr.com.mariaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void confirmarClicado (View v){
        Intent intent = new Intent(this, Main2Activity.class);
        Bundle bundle = new Bundle();

        EditText editTextNome = (EditText) findViewById(R.id.edtTexto1);
        bundle.putString("Nome", editTextNome.getText().toString());

        EditText editTextIdade = (EditText) findViewById(R.id.edtTexto2);
        bundle.putString("Idade", editTextIdade.getText().toString());

        //Spinner theSpinner = (Spinner) findViewById(R.id.spiSexo);
        //bundle.putString("Sexo", theSpinner.getSelectedItem().toString());

        intent.putExtras(bundle);
        startActivity(intent);
    }
}

