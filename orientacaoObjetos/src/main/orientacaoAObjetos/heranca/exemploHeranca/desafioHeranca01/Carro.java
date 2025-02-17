package heranca.exemploHeranca.desafioHeranca01;

public class Carro {

    int velocidadeAtual;

    void acelerar(){
        velocidadeAtual += 5;
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
