package ivaangb.com.tallercelulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Reporte_5 extends AppCompatActivity {
    TextView promedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_5);

        promedio = findViewById(R.id.tvProm);

        promedio.setText("$"+nokia.promedio());
    }





}
