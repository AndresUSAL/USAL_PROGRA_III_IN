//Haz un programa que solicite un número entero N al usuario mayor que cero (en caso contrario el
//programa mostrará un error por el canal de error System.err y solicitará de nuevo al usuario el valor N
//hasta que sea válido). Una vez que sea válido, el programa solicitará al usuario N veces números de
//coma flotante y se deberá calcular la media aritmética de todos los números introducidos. Para este
//problema deberás emplear los métodos de E/S de biblioteca.jar. Incluye el JAR de la biblioteca.jar
//disponible en Studium en tu proyecto e investiga cómo importar clases o métodos necesarios para
//resolverlo.

import com.coti.tools.Esdia;

public class PidaNumero {
    public static void main(String[] args) {
        int N = 0;
        double suma = 0.0;

        // Pedir N hasta que sea mayor que 0
        do {
            try {
                N = Esdia.readInt("Introduce un número entero mayor que 0: ");
                if (N <= 0) {
                    System.err.println("Error: el número debe ser mayor que 0.");
                }
            } catch (Exception e) {
                System.err.println("Error: entrada no válida. Inténtalo de nuevo.");
            }
        } while (N <= 0);

        // Leer N números de coma flotante
        for (int i = 1; i <= N; i++) {
            try {
                double num = Esdia.readDouble("Introduce el número " + i + ": ");
                suma += num;
            } catch (Exception e) {
                System.err.println("Error: valor no válido. Inténtalo de nuevo.");
                i--; // repetir la misma iteración
            }
        }

        double media = suma / N;
        System.out.println("La media aritmética es: " + media);
    }
}

