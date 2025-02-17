package polimorfismo.exemploAnterior;

public class Sorvete {

   private double peso;

   Sorvete(double peso){
       setPeso(peso);
   }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
       if (peso >= 0){
           this.peso = peso;
       }
    }
}
