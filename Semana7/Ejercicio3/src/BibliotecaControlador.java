
public class BibliotecaControlador {

    private BibliotecaModelo modelo;
    private BibliotecaVista vista;

    public BibliotecaControlador(BibliotecaModelo modelo, BibliotecaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            vista.mostrarMenu();
            char opcion = vista.leerOpcion();

            switch (opcion) {
                case '1':
                    agregarLibro();
                    break;
                case '2':
                    buscarLibro();
                    break;
                case '3':
                    editarLibro();
                    break;
                case '4':
                    eliminarLibro();
                    break;
                case '5':
                    listarLibros();
                    break;
                case 'q':
                case 'Q':
                    salir = true;
                    break;
                default:
                    vista.mostrarError("Opcion invalida");
            }
        }
    }

    private void agregarLibro() {
        String isbn = vista.pedirIsbn();
        if (modelo.existeLibro(isbn)) {
            vista.mostrarError("Ya existe un libro con ese ISBN");
            return;
        }

        String titulo = vista.pedirTitulo();
        String autor = vista.pedirAutor();
        int paginas = vista.pedirPaginas();

        Libro nuevo = new Libro(titulo, autor, paginas);
        boolean ok = modelo.agregarLibro(isbn, nuevo);

        if (ok) {
            vista.mostrarMensaje("Libro agregado");
        } else {
            vista.mostrarError("No se pudo agregar el libro");
        }
    }

    private void buscarLibro() {
        String isbn = vista.pedirIsbn();
        Libro l = modelo.buscarLibro(isbn);
        if (l == null) {
            vista.mostrarError("No existe ningún libro con ese ISBN");
        } else {
            vista.mostrarLibro(isbn, l);
        }
    }

    private void editarLibro() {
        String isbn = vista.pedirIsbn();
        Libro l = modelo.buscarLibro(isbn);
        if (l == null) {
            vista.mostrarError("No existe ningún libro con ese ISBN");
            return;
        }

        vista.mostrarMensaje("Introduce los NUEVOS datos del libro");
        String nuevoTitulo = vista.pedirTitulo();
        String nuevoAutor = vista.pedirAutor();
        int nuevasPaginas = vista.pedirPaginas();

        boolean ok = modelo.editarLibro(isbn, nuevoTitulo, nuevoAutor, nuevasPaginas);
        if (ok) {
            vista.mostrarMensaje("Libro editado correctamente");
        } else {
            vista.mostrarError("No se pudo editar el libro");
        }
    }

    private void eliminarLibro() {
        String isbn = vista.pedirIsbn();
        boolean ok = modelo.eliminarLibro(isbn);
        if (ok) {
            vista.mostrarMensaje("Libro eliminado");
        } else {
            vista.mostrarError("No existe ningún libro con ese ISBN");
        }
    }

    private void listarLibros() {
        vista.mostrarListaLibros(modelo.getTodos());
    }
}
