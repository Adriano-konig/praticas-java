package polimorfismo.exemploAnterior;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado =  new Pessoa(99.0);
        System.out.println(convidado.getPeso());

        Arroz arroz = new Arroz(0.200);
        convidado.comer(arroz);

        Feijao feijao = new Feijao(0.400);
        convidado.comer(feijao);

        Sorvete sorvete = new Sorvete(0.400);
        convidado.comer(sorvete);


        System.out.println(convidado.getPeso());
    }

}
