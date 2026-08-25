package org.example.veiculo;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroDePaginas;
    private int valorDaCompra;

    public Livro(String titulo, String autor, String isbn, int numeroDePaginas, int valorDaCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valorDaCompra = valorDaCompra;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(int valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", valorDaCompra=" + valorDaCompra +
                '}';
    }
}
