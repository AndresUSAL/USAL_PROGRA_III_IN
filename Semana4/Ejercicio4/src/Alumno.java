//Se debe realizar un programa que solicite por consola el número de alumnos que tiene un curso. Posteriormente se
//solicitarán las notas de 3 exámenes (2 parciales y uno final) por cada alumno. El programa deberá mostrar las
//calificaciones de cada alumno en formato de tabla y la nota final (suponiendo un valor de 10%, 10% y 80%
//respectivamente). Por último se deberá obtener la media por cada examen y de la nota final de la clase. Utiliza
//Arrays de objetos para su resolución.

public class Alumno {
    private String nombre;
    private double notaParcial1;
    private double notaParcial2;
    private double notaExamenFinal;
    private double notaFinal;

    public Alumno(String nombre, double notaParcial1, double notaParcial2, double notaExamenFinal) {
        this.nombre = nombre;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
        this.notaExamenFinal = notaExamenFinal;
        calcularNotaFinal();
    }

    private void calcularNotaFinal() {
        this.notaFinal = notaParcial1 * 0.10 + notaParcial2 * 0.10 + notaExamenFinal * 0.80;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaParcial1() {
        return notaParcial1;
    }

    public double getNotaParcial2() {
        return notaParcial2;
    }

    public double getNotaExamenFinal() {
        return notaExamenFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}


