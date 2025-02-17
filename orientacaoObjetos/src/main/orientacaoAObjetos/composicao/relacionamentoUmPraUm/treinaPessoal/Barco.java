package composicao.relacionamentoUmPraUm.treinaPessoal;

public class Barco {

    Motor motor = new Motor();


    void acelerar(){
        motor.fatorInjecao += 0.4;
    }

    void desacelerar(){
        motor.fatorInjecao-= 0.4;
    }

    void ligar(){
        motor.ligar = true;
    }
}
