package composicao.relacionamentoUmPraUm.treinaPessoal;

public class TesteBarco {

    public static void main(String[] args) {

        Barco barco = new Barco();

        barco.acelerar();
        barco.acelerar();

        System.out.println(barco.motor.giro());
    }
}
