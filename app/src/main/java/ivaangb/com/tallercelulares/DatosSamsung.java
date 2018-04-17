package ivaangb.com.tallercelulares;

import java.util.ArrayList;

/**
 * Created by ivang on 16/4/2018.
 */

public class DatosSamsung {

    private static ArrayList<CelularesSamsung> celu = new ArrayList<>();

    public static void guardar(CelularesSamsung cel){
        celu.add(cel);
    }

    public static ArrayList<CelularesSamsung> obtener(){
        return celu;
    }

}
