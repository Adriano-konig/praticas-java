package desafio05;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(){
        nome = "Paulo";
        peso = 7.0;
    }

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    Comida c1 = new Comida();

    double calculoPeso(){
        return peso + c1.pesoComida;
    }

    void calculoNovoPeso(Comida comida){
        this.peso += comida.pesoComida;
    }

    String apresentar(){
        return "meu nome é " + nome + " tem " + peso + " Kgs";
    }


}
