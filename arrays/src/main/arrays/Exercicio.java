
import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] nota = new double[4];
        System.out.println(Arrays.toString(nota));

        nota[0] = 5.0;
        nota[1] = 8.0;
        nota[2] = 7.0;
        nota[3] = 9.5;


        System.out.println(Arrays.toString(nota));

        //como fazer media:
        double total = 0;
        for (int i =0; i < nota.length ; i++){
            total += nota[i];
        }

        double resultado = total / nota.length;

        System.out.println("A media de aluno é: " + resultado);

    }
}
