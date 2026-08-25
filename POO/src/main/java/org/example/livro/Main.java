package org.example.livro;

public class Main {
    public static void main(String[] args) {
        // instanciar a classe livro.
        Livro livro1= new Livro("a cabana","Michel Araújo", 250, 150);
        Livro livro2= new Livro("a Sereja","Alberth Tailon", 123, 320);

        System.out.println("Titulo:" + livro1.getTitúlo());
        System.out.println("autor:" + livro1.getAutor());
        System.out.println("numeros de paginas:" + livro1.getNumeroDePaginas());
        System.out.println("preco:" + livro1.getPreco());


        System.out.println("titulo:" + livro2.getTitúlo());
        System.out.println("autor:" + livro2.getAutor());
        System.out.println("numeros de paginas:" + livro2.getNumeroDePaginas());
        System.out.println("preco:" + livro2.getPreco());
    }
}
