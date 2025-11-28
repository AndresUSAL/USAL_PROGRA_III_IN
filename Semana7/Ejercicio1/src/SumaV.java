

import java.util.Scanner;

public class SumaV {

    private Scanner sc;

    public SumaV() {
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("===== MENÚ SUMA =====");
        System.out.println("1) Leer los numeros");
        System.out.println("2) Calcular la suma");
        System.out.println("3) Mostrar el resultado");
        System.out.println("q) Salir");
        System.out.print("Opcion: ");
    }

    public char leerOpcion() {
        String linea = sc.nextLine();
        if (linea.isEmpty()) return ' ';
        return linea.charAt(0);
    }

    public int leerNumero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine();
            try {
                return Integer.parseInt(linea.trim());
            } catch (NumberFormatException e) {
                System.err.println("Error, entero invalido");
            }
        }
    }

    public void mostrarResultado(int resultado) {
        System.out.println("La suma es: " + resultado);
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public void mostrarMensajeError(String msg) {
        System.err.println(msg);
    }
}
