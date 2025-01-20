public class Produto {

    String nome;
    int preco;
    double desconto;

    Produto(String nomeInicial){
        nome = nomeInicial;
    }

//não tem parametro porque não vou precisa receber parâmetro porque dentro objeto produto ja tem;
    double gerenciamentoDescontoPreco(){
        return preco * (1 - desconto);
}

    //tem parametro e obrigatorio colocar o valor na parentese de classe MainProduto;
    double gerenciamentoDescontoPreco(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }


}
