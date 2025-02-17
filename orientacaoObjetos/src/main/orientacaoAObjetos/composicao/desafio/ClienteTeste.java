package composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        //aqui linha 11 esta chamado o método adicionarItens de linha 11 de classe compra
        compra1.adicionarItens(new Produto("lapis", 1.50), 30);
        //aqui linha 13 esta chamado o método adicionarItens de linha 15 de classe compra
        compra1.adicionarItens("caderno", 18.50, 20);

        Compra compra2 = new Compra();
        //aqui linha 11 esta chamado o método adicionarItens de linha 11 de classe compra
        compra2.adicionarItens(new Produto("Borracha", 2.50), 10);
        //aqui linha 13 esta chamado o método adicionarItens de linha 15 de classe compra
        compra2.adicionarItens("apontador", 3.50, 20);

        Cliente cliente1 = new Cliente("Carlos");
        //aqui o metodo adicionarCompra esta chamado a linha 15 de classe Cliente
        cliente1.adicionarCompra(compra1);
        //aqui esta chamado a linha 9 de classe Cliente
        cliente1.compras.add(compra2);

        System.out.println(cliente1.obterValortotal());










    }
}
