import java.util.Arrays;
import java.util.Scanner;

public class OrdenarStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] palabras = new String[5];

        System.out.println("Introduce 5 palabras:");

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = sc.nextLine();
        }

        Arrays.sort(palabras);

        System.out.println("\nPalabras ordenadas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        sc.close();
    }
}
