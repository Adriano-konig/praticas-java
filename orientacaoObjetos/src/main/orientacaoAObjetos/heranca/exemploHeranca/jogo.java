package heranca.exemploHeranca;

public class jogo {

    public static void main(String[] args) {

        //Jogador j1 = new Jogador();
        Montro j1 = new Montro(); // crie classe extends como Montro e Hernça de Jogador
        j1.x = 10;
        j1.y = 10;

        //Jogador j2 = new Jogador();
        Heroi j2 = new Heroi(); // crie classe extends como Heroi e Hernça de Jogador
        j2.x = 10;
        j2.y = 11;

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

    }


}
