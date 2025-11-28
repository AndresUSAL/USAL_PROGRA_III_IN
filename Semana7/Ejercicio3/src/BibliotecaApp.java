/*Refactoriza los ejemplos proporcionados en la sesión anterior CRUD sobre colecciones, para
que el proyecto siga el patrón MVC. Vigila la responsabilidad de cada clase y que no se
realizan acciones que no les correspondan (e.g. E/S en el modelo o en el controlador, etc.). */


public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaModelo modelo = new BibliotecaModelo();
        BibliotecaVista vista = new BibliotecaVista();
        BibliotecaControlador controlador = new BibliotecaControlador(modelo, vista);

        controlador.iniciar();
    }
}



