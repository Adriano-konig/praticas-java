package desafio;

public class Loja {

    String nome ;
    double preco;
    static double desconto = 0.25;

    Loja(){

    }

    Loja(String nomeLoja, double precoInicial){
        nome = nomeLoja;
        preco = precoInicial;
    }

    double calcular(){
        return preco * (1 - desconto);
    }
}
