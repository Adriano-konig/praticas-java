package polimorfismo.desafioPolimorfismoResposta;

public class Sorvete extends Comida{

    // COMO ERA ANTES SEM HERANÇA "COMIDA"
//    private double peso;
//
//    Sorvete(double peso){
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
    Sorvete(double peso){
        super(peso);
    }
}
