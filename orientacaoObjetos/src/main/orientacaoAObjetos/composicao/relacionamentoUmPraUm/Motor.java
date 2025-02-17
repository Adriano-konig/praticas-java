package composicao.relacionamentoUmPraUm;

public class Motor {

    final Carro carro;
    boolean ligar = false;
    double fatorInjecao = 1;

    Motor(Carro carro){
        this.carro = carro;
    }

    int giros(){
        if (!ligar){
            return 0;
        }else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
