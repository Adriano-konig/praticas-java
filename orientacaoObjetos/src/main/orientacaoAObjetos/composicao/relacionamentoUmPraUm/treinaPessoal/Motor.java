package composicao.relacionamentoUmPraUm.treinaPessoal;

public class Motor {

    Boolean ligar = false;
    double fatorInjecao = 1;

    int giro(){
        return (int) Math.round(fatorInjecao * 3000);
    }


}
