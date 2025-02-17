package composicao.relacionamentoUmPraUm;

public class Carro {

//    Motor motor = new Motor();
    final Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6){
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if (motor.fatorInjecao > 0.5){
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar(){
        motor.ligar = true;
    }

    void desligar(){
        motor.ligar = false;
    }

    boolean estaLigado(){
        return motor.ligar;
    }
}