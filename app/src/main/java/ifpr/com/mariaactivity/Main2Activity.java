package ifpr.com.mariaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(
                getApplicationContext(),
                "Esses são seus dados pessoais!",
               Toast.LENGTH_LONG
        ).show();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String nome = bundle.getString("Nome");
        TextView nomeTextView = (TextView) findViewById(R.id.textViewNome);
        nomeTextView.setText(nome);

        String idade = bundle.getString("Idade");
        TextView idadeTextView = (TextView) findViewById(R.id.textViewIdade);
        idadeTextView.setText(idade);

        String sexo = bundle.getString("Sexo");
        TextView sexoTextView = (TextView) findViewById(R.id.textViewIdade);
        sexoTextView.setText(sexo);
    }

    public void vaiPraTerceiraActivity(View v){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}


