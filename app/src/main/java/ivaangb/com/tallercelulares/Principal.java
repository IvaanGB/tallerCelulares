package ivaangb.com.tallercelulares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lvPrincipal;
    private String [] opPrincipal;
    private Intent in;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lvPrincipal = findViewById(R.id.lvOpciones);
        opPrincipal = getResources().getStringArray(R.array.opciones);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, opPrincipal);

        lvPrincipal.setAdapter(adapter);

        lvPrincipal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        in = new Intent(Principal.this, Registrar.class);
                        startActivity(in);
                        break;

                    case 1:
                        in = new Intent(Principal.this, Listar.class);
                        startActivity(in);
                        break;

                    case 2:
                        in = new Intent(Principal.this, Reporte_2.class);
                        startActivity(in);
                        break;

                    case 3:
                        in = new Intent(Principal.this, Reporte_5.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }

}
