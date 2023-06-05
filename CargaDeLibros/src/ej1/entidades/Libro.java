/*
 ISBN, Título, Autor, Número de páginas
 */
package ej1.entidades;

/**
 *
 * @author Ali
 */
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;
//constructor vacio
    public Libro() {
    }
//cons lleno
    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
   
     @Override
    public String toString() {
        return "Libro{" + "Titulo=" + titulo + ", Autor=" + autor + ", numPag=" + paginas + ", iSBN=" + ISBN + '}';
    }
    
}
