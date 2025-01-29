import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos aluno da turma: ");
        int qtdadeAluno = teclado.nextInt();

        System.out.println("Quantas nota: ");
        int qtdadeNota = teclado.nextInt();

        double[][] notasTurma = new double[qtdadeAluno][qtdadeNota];

        double total = 0;
        for (int a = 0; a < notasTurma.length; a++) {
            for (int n = 0; n < notasTurma[a].length; n++) {
                System.out.printf("Informe a nota %d de aluno %d: ", n+1, a+1);
                notasTurma[a][n] = teclado.nextDouble();
                total += notasTurma[a][n];
            }
        }

        double media = total / (qtdadeAluno + qtdadeNota);
        System.out.println("A media de turma é: " + media);

        for (double[] notasAluno: notasTurma){
            System.out.println(Arrays.toString(notasAluno));
        }

        teclado.close();
    }
}
