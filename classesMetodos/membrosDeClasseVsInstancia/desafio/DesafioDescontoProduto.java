package desafio;

import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;

public class DesafioDescontoProduto {

    public static void main(String[] args) {

        Loja produto1 = new Loja("Notebook", 3500.89);

        var p2 = new Loja();
        p2.nome = "Mochila";
        p2.preco = 250;

        Loja.desconto = 0.50;

        System.out.println(produto1.nome + " " + produto1.calcular());
        System.out.println(p2.nome + " " + p2.calcular());

        double precoFinalProduto1 = produto1.calcular();
        double precoFinalProduto2 = p2.calcular();

        double mediaCarrinho = (precoFinalProduto1 + precoFinalProduto2) / 2;

        System.out.printf("Media carrinho de compras: R$%f", mediaCarrinho);
    }
}
