import java.text.DecimalFormat;

public class MainProduto {

    public static void main(String[] args) {

        //Antes:
        //Produto p1 = new Produto();
        //p1.nome = "notebook";
        //Depois criei => Produto(String nomeInicial){nome = nomeInicial}
        Produto p1 = new Produto("notebook");
        p1.preco = 2500;
        p1.desconto = 0.35;

        var precoComDesconto = p1.preco * (1 - p1.desconto);
        DecimalFormat df = new DecimalFormat("##,000");
        var ajusteFormata = df.format(precoComDesconto);
        System.out.println("Produto:" + p1.nome + "\nPreco com desconto R$: " + ajusteFormata);

        //antes:
       // var p2 = new Produto();
       // p2.nome = "Caneta Azul";
        //Depois criei => Produto(String nomeInicial){nome = nomeInicial}
        var p2 = new Produto("Caneta Azul");
        p2.preco = 250;
        p2.desconto = 0.05;

        //Depois criar metodo no objeto Produto melhor forma fazer:
        //Antes:
        //var precoComDescontoCaneta = p2.preco * (1 - p2.desconto);
        //Depois:
        var precoComDescontoCaneta = p2.gerenciamentoDescontoPreco();
        DecimalFormat dfCaneta = new DecimalFormat("#,00");
        var ajusteFormataCasasCaneta = dfCaneta.format(precoComDescontoCaneta);
        System.out.println("Produto: " + p2.nome + "\nPreco com 5% desconto ficará: " + ajusteFormataCasasCaneta);

        //Antes:
        //var p3 = new Produto();
        //p3.nome = "Monitor";
        //Depois criei => Produto(String nomeInicial){nome = nomeInicial}
        var p3 = new Produto("monitor");
        p3.preco = 3500;
        p3.desconto = 0.50;

        //Depois criar metodo no objeto Produto melhor forma fazer:
        //Antes:
        //var precoComDescontoMonitor = p3.gerenciamentoDescontoPreco();
        //Depois com valor de parentese pois esse que chama um metodo que tem parametro e obrigatorio senão vai reclama:
        var precoComDescontoMonitor = p3.gerenciamentoDescontoPreco(0.1);
        DecimalFormat dfMonitor = new DecimalFormat("#,000");
        var ajusteFormataCasaMonitor = dfMonitor.format(precoComDescontoMonitor);

        System.out.println("Produto: " + p3.nome + "\nPreço com desconto ficará: " + ajusteFormataCasaMonitor);



    }
}
