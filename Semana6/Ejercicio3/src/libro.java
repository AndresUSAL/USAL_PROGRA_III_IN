/*Realiza un programa que permita gestionar la información de los libros de una biblioteca
(Operaciones CRUD). Usa en esta ocasión un HashMap donde la clave sea un String con el
ISBN del libro. */

class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
       }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String toString() {
        return titulo + " - " + autor + " (" + paginas + " páginas)";
    }
}

