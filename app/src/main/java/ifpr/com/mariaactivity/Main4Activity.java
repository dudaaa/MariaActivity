package ifpr.com.mariaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ArrayList<String> aleatoriosEmUmaLista = new ArrayList<String>();
        aleatoriosEmUmaLista.add("aleatorio1");
        aleatoriosEmUmaLista.add("aleatorio2");
        aleatoriosEmUmaLista.add("aleatorio3");
        aleatoriosEmUmaLista.add("aleatorio4");
        aleatoriosEmUmaLista.add("aleatorio5");
        aleatoriosEmUmaLista.add("aleatorio6");

        ListView nossoListView = findViewById(R.id.Lista1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                aleatoriosEmUmaLista);

        nossoListView.setAdapter(adapter);

        /*AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id){
                //((TextView)findViewById(R.id.nomes)).setText(position);
            }
        };


        ListView listView = (ListView) findViewById(R.id.Lista1);
        listView.setOnClickListener((View.OnClickListener) itemClickListener);

        //git test
        */
    }
}

