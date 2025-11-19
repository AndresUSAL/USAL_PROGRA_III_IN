//Haz otra versión del programa anterior que utilice la clase Console para solicitar datos al usuario.
//Investiga cómo realizar conversiones de cadenas a otros tipos con los métodos parseXXXX de las
// Wrapper Classes (Float, Integer, etc). Genera un Jar del programa y ejecutalo tu desde la terminal

import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        
        Console myConsole = System.console();

        String anacimiento = myConsole.readLine("Que año naciste? ");
        String aactual = myConsole.readLine("Cual es el año actual? ");

        int now = Integer.parseInt(anacimiento.trim());
        int born = Integer.parseInt(aactual.trim());

        int edad= born-now;


        myConsole.printf("tu edad es " +edad);



    }
}
