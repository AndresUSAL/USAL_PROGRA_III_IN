import java.util.Scanner;

public class NotasCursoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de alumnos: ");
        int numAlumnos = sc.nextInt();
        sc.nextLine();

        Alumno[] alumnos = new Alumno[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println();
            System.out.println("Alumno " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Nota parcial 1: ");
            double n1 = sc.nextDouble();

            System.out.print("Nota parcial 2: ");
            double n2 = sc.nextDouble();

            System.out.print("Nota examen final: ");
            double nf = sc.nextDouble();

            sc.nextLine();

            alumnos[i] = new Alumno(nombre, n1, n2, nf);
        }

        System.out.println();
        System.out.println("================================================================================");
        System.out.printf("%-15s %10s %10s %15s %10s%n",
                "Alumno", "Parcial1", "Parcial2", "ExamenFinal", "NotaFinal");
        System.out.println("================================================================================");

        double sumaP1 = 0;
        double sumaP2 = 0;
        double sumaExFinal = 0;
        double sumaNotaFinal = 0;

        for (int i = 0; i < alumnos.length; i++) {
            Alumno a = alumnos[i];

            System.out.printf("%-15s %10.2f %10.2f %15.2f %10.2f%n",
                    a.getNombre(),
                    a.getNotaParcial1(),
                    a.getNotaParcial2(),
                    a.getNotaExamenFinal(),
                    a.getNotaFinal());

            sumaP1 += a.getNotaParcial1();
            sumaP2 += a.getNotaParcial2();
            sumaExFinal += a.getNotaExamenFinal();
            sumaNotaFinal += a.getNotaFinal();
        }

        System.out.println("================================================================================");

        // Medias
        double mediaP1 = sumaP1 / numAlumnos;
        double mediaP2 = sumaP2 / numAlumnos;
        double mediaExFinal = sumaExFinal / numAlumnos;
        double mediaNotaFinal = sumaNotaFinal / numAlumnos;

        System.out.println();
        System.out.println("Medias de la clase:");
        System.out.printf("Media Parcial 1:     %.2f%n", mediaP1);
        System.out.printf("Media Parcial 2:     %.2f%n", mediaP2);
        System.out.printf("Media Examen Final:  %.2f%n", mediaExFinal);
        System.out.printf("Media Nota Final:    %.2f%n", mediaNotaFinal);

        sc.close();
    }
}
