package polimorfismo.exemploAnterior;

public class Arroz {

    private double peso;

    Arroz(double peso){
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
