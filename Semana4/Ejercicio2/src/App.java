import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("introduce tu peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("introduce tu altura en metros: ");
        double altura = sc.nextDouble();


      
        Usuario u = new Usuario(nombre, peso, altura);

        double imc = u.calcularIMC();

        if (imc < 0) {
            System.err.println("Error: peso o altura no válidos.");
            return;
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-15s %10s %10s %10s%n", "Nombre", "Peso(kg)", "Altura(m)", "IMC");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-15s %10.2f %10.2f %10.2f%n",
                u.getNombre(), u.getPeso(), u.getAltura(), imc);
        System.out.println("---------------------------------------------------------");

        sc.close();
    }
}
