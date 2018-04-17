package ivaangb.com.tallercelulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte_2 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<CelularesSamsung> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_2);

        tabla = findViewById(R.id.tblSamsung);
        celulares = DatosSamsung.obtener();


        for (int i = 0; i < celulares.size(); i++) {


            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);


            c1.setText(""+(i+1));
            c2.setText(celulares.get(i).getMarca());
            c3.setText(celulares.get(i).getColor());
            c4.setText(celulares.get(i).getRam());
            c5.setText(celulares.get(i).getPrecio());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);

            tabla.addView(fila);
        }

    }
}
