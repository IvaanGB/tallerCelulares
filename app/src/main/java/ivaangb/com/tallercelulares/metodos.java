package ivaangb.com.tallercelulares;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ivang on 16/4/2018.
 */

public class metodos {
    public static void alert(final Context main, String titulo, String mensaje){
        AlertDialog alertDialog = new AlertDialog.Builder(main).create();
        alertDialog.setTitle(titulo);
        alertDialog.setMessage(mensaje);
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public static boolean validarSpinner(Spinner spinner, String error){
        if (spinner.getSelectedItemPosition() == 0) {
            spinner.requestFocus();
            errorSpinner(spinner, error);
            return false;
        }
        return true;
    }

    public static TextView errorSpinner(Spinner spinner, String error) {
        TextView errorText = (TextView) spinner.getSelectedView();
        errorText.setError("");
        errorText.setTextColor(Color.RED);
        errorText.setText(error);
        return errorText;
    }

    public static void limpiar(Spinner marca, Spinner color, EditText precio, EditText ram){
        marca.setSelection(0);
        color.setSelection(0);
        precio.setText("");
        ram.setText("");
    }

}
