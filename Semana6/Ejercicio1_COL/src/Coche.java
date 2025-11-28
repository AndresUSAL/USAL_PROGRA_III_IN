/*Realiza un programa que permita almacenar la información del stock de un concesionario
de coches. El programa deberá permitir hacer un CRUD de los coches disponibles en la
tienda mediante un menú con las opciones correspondientes. Haz una versión empleando
colecciones y otra con Arrays.
*/

public class Coche {
    private String marca;
    private String modelo;
    private double precio;

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }
     
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return marca + " " + modelo + " - $" + precio;
    }

}
