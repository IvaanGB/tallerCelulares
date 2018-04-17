package ivaangb.com.tallercelulares;

import java.util.ArrayList;

/**
 * Created by ivang on 16/4/2018.
 */

public class Datos {

    private static ArrayList<Celulares> celulares = new ArrayList<>();

    public static void guardar(Celulares cel){
        celulares.add(cel);
    }

    public static ArrayList<Celulares> obtener(){
        return celulares;
    }

}
