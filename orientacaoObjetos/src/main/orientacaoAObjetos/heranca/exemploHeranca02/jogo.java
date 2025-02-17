package heranca.exemploHeranca02;

import heranca.exemploEnum.Direcao;

public class jogo {

    public static void main(String[] args) {

        //Jogador j1 = new Jogador();
        Montro montro = new Montro(); // crie classe extends como Montro e Hernça de Jogador
        montro.x = 10;
        montro.y = 10;

        //Jogador j2 = new Jogador();
        Heroi heroi = new Heroi(); // crie classe extends como Heroi e Hernça de Jogador
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro tem => " + montro.vida);
        System.out.println("Heroi tem => " +heroi.vida);

        montro.atacar(heroi);
        heroi.atacar(montro);

        montro.andar(Direcao.NORTE);
        montro.atacar(heroi);
        heroi.atacar(montro);

        System.out.println(montro.vida);
        System.out.println(heroi.vida);

    }


}
