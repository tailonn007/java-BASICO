package org.example;

public class Loja {
    public static void main(String[] args) {

        // 1. Declaração de variáveis
        String nomeMercado = "Mamão com Açúcar";
        double valorCompra = 250.0;
        int prestacoes = 5;


        double valorParcela = valorCompra / prestacoes;

        // 3. Exibindo os resultados
        System.out.println("--- Resumo da Compra ---");
        System.out.println("Mercado: " + nomeMercado);
        System.out.println("Valor total: R$ " + valorCompra);
        System.out.println("Sua compra foi dividida em " + prestacoes + " vezes sem juros.");
        System.out.println("Valor de cada parcela: R$ " + valorParcela);

    }

}
