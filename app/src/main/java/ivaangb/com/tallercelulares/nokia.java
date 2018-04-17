package ivaangb.com.tallercelulares;

import android.widget.TextView;

/**
 * Created by ivang on 16/4/2018.
 */

public class nokia {
    static String precio, cantidad;
    public nokia(String precio, String cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public static double promedio(){
        double prom=0.0;
        double precIni =0;
        precIni = Double.parseDouble(precio) + precIni;

        double cant=0;
        cant= cant+Double.parseDouble(cantidad);

        prom = precIni/cant;

        return prom;
    }



}
