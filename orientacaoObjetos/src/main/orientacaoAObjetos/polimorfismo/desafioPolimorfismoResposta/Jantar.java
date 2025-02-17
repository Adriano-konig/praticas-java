package polimorfismo.desafioPolimorfismoResposta;

public class Jantar {

    public static void main(String[] args) {

        //Desafio polimorfismo e organizar para melhorar como criar herança "Comida", metodos e diminuir codigos.
        Pessoas convidado = new Pessoas(99.00);
        System.out.println(convidado.getPeso());

        Arroz arroz = new Arroz(0.200);
        Feijao feijao = new Feijao(0.400);
        Sorvete sorvete = new Sorvete(0.400);

        convidado.comer(arroz);
        System.out.println(convidado.getPeso());

        convidado.comer(feijao);
        convidado.comer(sorvete);

        System.out.println(convidado.getPeso());
    }
}
