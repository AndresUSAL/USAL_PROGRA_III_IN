import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {

    static HashMap<String, Libro> libros = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU BIBLIOTECA (HashMap) ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por ISBN");
            System.out.println("3. Editar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Listar todos");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregar(sc);
                case 2 -> buscar(sc);
                case 3 -> editar(sc);
                case 4 -> eliminar(sc);
                case 5 -> listar();
            }
        }while(opcion != 6);
    }
    
    static void agregar(Scanner sc) {
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Paginas: ");
        int paginas = sc.nextInt();
        sc.nextLine();

        libros.put(isbn, new Libro(titulo, autor, paginas));
        System.out.println("Libreo agregado");
    }

    static void buscar(Scanner sc) {
        System.out.print("ISBN a buscar: ");
        String isbn = sc.nextLine();

        Libro l = libros.get(isbn);
        if(l == null) {
            System.out.println("no existe ese ISBN");
        } else {
            System.out.println(l);
        }
    }

    static void editar(Scanner sc) {
        System.out.print("ISBN del libro para editar");
        String isbn = sc.nextLine();
        
        Libro l = libros.get(isbn);
        if(l == null) {
            System.out.println("No exsite es ISBN");
            return;
        }
    

    System.out.print("Nuevo titulo: ");
    l.setTitulo(sc.nextLine());
    System.out.print("Nuevo autor: ");
    l.setAutor(sc.nextLine());
    System.out.print("Nuevas paginas: ");
    l.setPaginas(sc.nextInt());
    sc.nextLine();

    System.out.println("Libro editado.");
    }

    static void eliminar(Scanner sc){
        System.out.print("ISBN para eliminar ");
        String isbn = sc.nextLine();

        libros.remove(isbn);
        System.out.println("Libro eliminado");
    }

    static void listar() {
        if(libros.isEmpty()) {
            System.out.println("No hay libros");
            return;
        }
        for(String clave : libros.keySet()) {
            System.out.println(clave + " -> " + libros.get(clave));
        }
    }
}

