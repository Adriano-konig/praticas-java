package polimorfismo.desafioPolimorfismoResposta;

public class Pessoas {

    private double peso;

    Pessoas(double peso){
        setPeso(peso);
    }

   // COMO ERA ANTES SEM HERANÇA "COMIDA"
//    public void comer(Arroz arroz){
//        this.peso += arroz.getPeso();
//    }
//
//    public void comer(Feijao feijao){
//        this.peso += feijao.getPeso();
//    }
//
//    public void comer(Sorvete sorvete){
//        this.peso += sorvete.getPeso();
//    }

    // Com herança
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }
}
