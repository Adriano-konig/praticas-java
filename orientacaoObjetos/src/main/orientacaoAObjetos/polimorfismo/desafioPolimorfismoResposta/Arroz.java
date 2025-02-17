package polimorfismo.desafioPolimorfismoResposta;

public class Arroz extends Comida {

    // COMO ERA ANTES SEM HERANÇA "COMIDA"
//    private double peso;
//
//    Arroz(double peso){
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

    // COM HERANAÇA "COMIDA"
    Arroz(double peso){
        super(peso);
    }
}
