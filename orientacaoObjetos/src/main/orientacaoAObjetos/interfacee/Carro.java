package interfacee;

public class Carro {

    public final int velocidadeMaxima;
    protected int velocidadeAtual;
    private int delta = 5;

    Carro(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    void acelerar(){
        if (velocidadeAtual + getDelta() > velocidadeMaxima){
            velocidadeAtual = velocidadeMaxima;
        }else {
            velocidadeAtual += getDelta();
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
