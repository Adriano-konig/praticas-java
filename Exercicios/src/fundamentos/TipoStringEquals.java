package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {

        System.out.println("2" == "2"); // => True

        String s = new String("2");
        System.out.println(s == "2"); // => False

        System.out.println(s.equals(s)); //=> True  ele faz comparação


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita o valor s2: ");
        String s2 = teclado.next(); //Essa ponto ele aceita usar ou sem trim funiona se fosse sem dele caso utilizar nextLine() se vc dê um ou mais espaços o resultado vai ser' contrario.
        System.out.println("2" == s2.trim()); // False (trim = retire espaço branco)
        System.out.println("2".equals(s2)); // True
        System.out.println("-----------------------------------------------");


        Scanner teclado1 = new Scanner(System.in);

        System.out.println("Digita o valor s3: ");
        String s3 = teclado1.nextLine();
        System.out.println("2".equals(s3)); //False
        System.out.println("2".equals(s3.trim())); //True (Deixe espaço branco)

        teclado.close();
    }
}
