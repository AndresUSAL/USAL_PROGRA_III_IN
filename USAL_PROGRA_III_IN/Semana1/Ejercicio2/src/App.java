//Crea un segundo proyecto en el que se solicite al usuario dos números y muestre por
//pantalla la suma de ambos. Ejecuta el programa con y sin el depurador y comprueba cómo
//se utiliza. Deberás subir la carpeta del proyecto también a la carpeta Semana1.

    import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            int num1;
            int num2;
   

            System.out.println("dame el num1");
            num1=scanner.nextInt();
            
            System.out.println("dame el num2");
            num2=scanner.nextInt();
            


            int suma =num1+num2;



            System.out.println("la suma de num1: " + num1 + "num2" + num2 + " es: " + suma);
        }
    }
}

