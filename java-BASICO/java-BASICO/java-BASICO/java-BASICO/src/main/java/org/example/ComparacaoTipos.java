package org.example;

public class ComparacaoTipos {
    public static void main(String[] args) {
        // declaração de variáveis
        String nomeUsuario = "Marta";
        int senha = 123;


        // comparação de String e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha ==456);

        //exibindo resultado
        System.out.println("O nome do usuario esta correto?" + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
