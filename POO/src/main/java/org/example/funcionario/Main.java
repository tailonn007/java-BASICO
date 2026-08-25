package org.example.funcionario;

public class Main {
    public static void main(String[] args) {
        // instanciar classes: Livro e Funcionario.
        Livro livro1 = new Livro("O corno chamado Alberth ", "Felipe Leal",250,155 );
        Funcionario funcionario1 = new Funcionario("Ramon Jesus", "082.002.008-79", "09.08.2007", "ramon56@gmail.com");


        System.out.println("\n== DADOS DO LIVRO==");
        System.out.println("Titulo:" + livro1.getTitúlo());
        System.out.println("Autor:" + livro1.getAutor());
        System.out.println("Numeros De Paginas:" + livro1.getNumeroDePaginas());
        System.out.println("preco:" + livro1.getPreco());


        System.out.println("\n== DADOS DO FUNCIONARIO");
        System.out.println("Nome:" + funcionario1.getNome());
        System.out.println("Cpf:" + funcionario1.getCpf());
        System.out.println("Data De Nascimento:" + funcionario1.getDataDeNascimento());
        System.out.println("Email:" + funcionario1.getEmail());
    }
}
