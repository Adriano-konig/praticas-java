public class Foreach {

    public static void main(String[] args) {

        double[] notas = {9.9, 9.8, 7.1, 6.7};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        for(double nota: notas){
            System.out.print(nota + " ");
        }
    }
}
