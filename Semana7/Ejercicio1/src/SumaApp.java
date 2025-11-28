/*Un profesor necesita sumar dos números enteros. Se pide crear un programa con el
siguiente menú y se debe ceñir al patrón MVC.
1.- Leer los números
2.- Calcular la suma
3.- Mostrar el resultado
q.- Salir */

public class SumaApp {

    public static void main(String[] args) {
        SumaM modelo = new SumaM();
        SumaV vista = new SumaV();
        SumaC controlador = new SumaC(modelo, vista);
        controlador.iniciar();
    }
}
