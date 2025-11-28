
import java.util.Scanner;
import java.util.Collection;
import java.util.Map;

public class BibliotecaVista {

    private Scanner sc;

    public BibliotecaVista() {
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- MENU BIBLIOTECA ---");
        System.out.println("1) Agregar libro");
        System.out.println("2) Buscar libro por ISBN");
        System.out.println("3) Editar libro");
        System.out.println("4) Eliminar libro");
        System.out.println("5) Listar todos los libros");
        System.out.println("q) Salir");
        System.out.print("Opción: ");
    }

    public char leerOpcion() {
        String linea = sc.nextLine();
        if (linea.isEmpty()) return ' ';
        return linea.charAt(0);
    }

    public String pedirIsbn() {
        System.out.print("Introduce el ISBN: ");
        return sc.nextLine().trim();
    }

    public String pedirTitulo() {
        System.out.print("Introduce el titulo: ");
        return sc.nextLine().trim();
    }

    public String pedirAutor() {
        System.out.print("Introduce el autor: ");
        return sc.nextLine().trim();
    }

    public int pedirPaginas() {
        while (true) {
            System.out.print("Introduce el numero de paginas: ");
            String linea = sc.nextLine();
            try {
                int paginas = Integer.parseInt(linea.trim());
                if (paginas <= 0) {
                    System.err.println("Las paginas deben ser un número mayor que 0");
                } else {
                    return paginas;
                }
            } catch (NumberFormatException e) {
                System.err.println("Introduce un entero valido");
            }
        }
    }

    public void mostrarLibro(String isbn, Libro libro) {
        System.out.println("ISBN: " + isbn + " -> " + libro);
    }

    public void mostrarListaLibros(Collection<Map.Entry<String, Libro>> entradas) {
        if (entradas.isEmpty()) {
            System.out.println("No hay libros en la biblioteca");
            return;
        }
        System.out.println("\n=== LISTA DE LIBROS ===");
        for (Map.Entry<String, Libro> entrada : entradas) {
            String isbn = entrada.getKey();
            Libro libro = entrada.getValue();
            System.out.println(isbn + " -> " + libro);
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public void mostrarError(String msg) {
        System.err.println(msg);
    }
}
