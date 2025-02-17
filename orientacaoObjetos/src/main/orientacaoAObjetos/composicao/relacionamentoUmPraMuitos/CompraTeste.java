package composicao.relacionamentoUmPraMuitos;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Paulo";
        c1.adicionarItem("Caneta", 2,2.40); //referencia linha 10 de classe Compra
        c1.adicionarItem(new Item("Lapis", 3,1.40)); //referencia linha 14 de classe Compra
        c1.adicionarItem(new Item("caderno", 1,25.40)); //referencia linha 14 de classe Compra

        System.out.println("Cliente: " + c1.cliente +
                "\nProduto: " + c1.itens.size() +
                "\nValor total: " + c1.calculototal());

        System.out.println();

        // Só pra mostrar a relação bidirecional!!!
        double total = c1.itens.get(0).compra.itens.get(1).compra.calculototal();
        System.out.println("O total R$: " + total);
    }
}
