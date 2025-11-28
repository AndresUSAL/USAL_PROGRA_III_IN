import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class BibliotecaModelo {

    private HashMap<String, Libro> libros;

    public BibliotecaModelo() {
        this.libros = new HashMap<>();
    }

    public boolean existeLibro(String isbn) {
        return libros.containsKey(isbn);
    }

    public boolean agregarLibro(String isbn, Libro libro) {
        if (libros.containsKey(isbn)) {
            return false;
        }
        libros.put(isbn, libro);
        return true;
    }

    public Libro buscarLibro(String isbn) {
        return libros.get(isbn);
    }

    public boolean eliminarLibro(String isbn) {
        if (!libros.containsKey(isbn)) {
            return false;
        }
        libros.remove(isbn);
        return true;
    }

    public boolean editarLibro(String isbn, String nuevoTitulo, String nuevoAutor, int nuevasPaginas) {
        Libro l = libros.get(isbn);
        if (l == null) {
            return false;
        }
        l.setTitulo(nuevoTitulo);
        l.setAutor(nuevoAutor);
        l.setPaginas(nuevasPaginas);
        return true;
    }

    public boolean estaVacia() {
        return libros.isEmpty();
    }

    public Collection<Map.Entry<String, Libro>> getTodos() {
        return libros.entrySet();
    }
}
