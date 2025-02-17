package heranca.exemploHeranca02.desafioHeranca02;

public class Carro {

    int velocidadeMaxima;
    int velocidadeAtual;
    int delta = 5;

    Carro(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidadeAtual + delta > velocidadeMaxima){
            velocidadeAtual = velocidadeMaxima;
        }else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "A velocidade atual é " + velocidadeAtual;
    }
    }
