package ivaangb.com.tallercelulares;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Registrar extends AppCompatActivity {
    private Spinner spnMarca, spnColor;
    private EditText precio, memoria;
    private String [] brand, colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        memoria = findViewById(R.id.txtMemoria);
        precio = findViewById(R.id.txtPrecio);
        spnMarca = findViewById(R.id.spnMarcas);
        spnColor = findViewById(R.id.spnColores);
        brand = getResources().getStringArray(R.array.spnMarcas);
        colors = getResources().getStringArray(R.array.spnColores);

        ArrayAdapter<String> mar = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, brand);
        spnMarca.setAdapter(mar);

        ArrayAdapter<String> col = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, colors);
        spnColor.setAdapter(col);
    }



    public boolean validar() {
        if (!metodos.validarSpinner(spnMarca, getResources().getString(R.string.errorSpn))) {
            return false;
        }

        if (!metodos.validarSpinner(spnColor, getResources().getString(R.string.errorSpn))) {
            return false;
        }

        if (precio.getText().toString().isEmpty() || Double.parseDouble(precio.getText().toString())==0.0){
            precio.requestFocus();
            precio.setError(getResources().getString(R.string.errorPrecio));
            return false;
        }

        if (memoria.getText().toString().isEmpty() || Double.parseDouble(memoria.getText().toString())==0.0){
            memoria.requestFocus();
            memoria.setError(getResources().getString(R.string.errorRam));
            return false;
        }

        return true;
    }

        public void siEsSamsung(){
            Double cantMemoria= Double.parseDouble(memoria.getText().toString());
            if (spnMarca.getSelectedItemPosition()==3) {
                if (cantMemoria >= 2 && cantMemoria <= 4) {
                    String marcaS, ramS, valorS, colorS;

                    marcaS = "" + spnMarca.getSelectedItem();
                    colorS = "" + spnColor.getSelectedItem();
                    valorS = precio.getText().toString();
                    ramS = memoria.getText().toString();

                    CelularesSamsung cel = new CelularesSamsung("" + marcaS, "" + ramS, "" + colorS, "" + valorS);

                    cel.guardar();

                }
            }
    }

    public void siEsNokia(){
        String valor = precio.getText().toString();
        if (spnMarca.getSelectedItemPosition()==1) {
            nokia nok = new nokia(valor,"1");
        }
    }

    public void registrar (View v){
        if (validar()){
            String marca, ram, valor, color;

            marca = ""+spnMarca.getSelectedItem();
            color = ""+spnColor.getSelectedItem();
            valor = precio.getText().toString();
            ram = memoria.getText().toString();

            metodos.alert(this,
                    ""+getResources().getString(R.string.ttlAlert),
                    ""+getResources().getString(R.string.msjAlert));

            Celulares cel = new Celulares(""+marca, ""+ram, ""+color, ""+valor);
            cel.guardar();
            siEsSamsung();
            siEsNokia();



            metodos.limpiar(spnMarca, spnColor, precio, memoria);
        }
    }

    public void limpiar (View v){
        metodos.limpiar(spnMarca, spnColor, precio, memoria);
    }
}
