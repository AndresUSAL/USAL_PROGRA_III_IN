//Escribe un programa que solicite el año de nacimiento de una persona y el año actual. Suponiendo que
//ya ha cumplido años, se calculará la edad. Revisa el uso de la clase Scanner, el método printf (viejo
//conocido de C) de System.out. La sintaxis es similar a la que ya conocéis. ¿Diferencia con println?public class App {
    
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scannow = new Scanner(System.in)) {
            int an;
            int ac;

            System.out.println("Cual es su año de nacimiento?");
            an=scannow.nextInt();

            System.out.println("cual es el año actual?");
            ac=scannow.nextInt();
   
            int edad =ac-an;

            System.out.println("Tu edad es " + edad);
        }
   
    
    }
}

