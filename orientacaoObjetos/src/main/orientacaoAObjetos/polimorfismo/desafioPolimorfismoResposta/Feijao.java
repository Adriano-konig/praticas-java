package polimorfismo.desafioPolimorfismoResposta;

public class Feijao extends Comida{

    // COMO ERA ANTES SEM HERANÇA "COMIDA"
//    private double peso;
//
//    Feijao(double peso){
//        setPeso(peso);
//    }
//
//    public double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(double peso) {
//        if(peso >= 0){
//            this.peso = peso;
//        }
//    }

    //COM HERANÇA "COMIDA"
        Feijao(double peso){
            super(peso);
    }

}
