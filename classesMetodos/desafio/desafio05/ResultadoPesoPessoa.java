package desafio05;

public class ResultadoPesoPessoa {

    public static void main(String[] args) {

        //Aqui use o metodo Pessoas(){nome = "Paulo"; peso = 7.8;}
        Pessoa p1 = new Pessoa();

        Comida c2 = new Comida("carne", 0.8);

        //Aqui use o metodo Pessoas(String nome, double peso){this.nome = nome; this.peso = peso;}
        Pessoa p2 = new Pessoa("João", 80.0);

        System.out.println(p2.apresentar());
        p2.calculoNovoPeso(c2);

        System.out.println(p2.apresentar());




    }
}
