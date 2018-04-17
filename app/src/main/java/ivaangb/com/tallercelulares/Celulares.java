package ivaangb.com.tallercelulares;

/**
 * Created by ivang on 16/4/2018.
 */

public class Celulares {
    private String marca, ram, color, precio;

    public Celulares(String marca, String ram, String color, String precio) {
        this.marca = marca;
        this.ram = ram;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void guardar(){

        Datos.guardar(this);
    }
}
