package encapsulamento.desafioEncapsulamento.carros;

public class Carro {

    public final int velocidadeMaxima;
    protected int velocidadeAtual;
    protected int delta = 5;

    Carro(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(){
        if (velocidadeAtual + delta > velocidadeMaxima){
            velocidadeAtual = velocidadeMaxima;
        }else {
            velocidadeAtual += delta;
        }
    }

    public void frear() {
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
