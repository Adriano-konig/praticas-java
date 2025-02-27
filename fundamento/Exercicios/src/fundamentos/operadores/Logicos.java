package fundamentos.operadores;

public class Logicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        //Tabela verdade E
        System.out.println("\nTabela verdade E");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //Tabela verdade OU (OR)
        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //Tabela verdade OU Exclusivo XOR
        System.out.println("\nTabela verdade OU Exclusivo XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //Tabela verdade Negação
        System.out.println("\nTabela verdade OU Exclusivo XOR");
        System.out.println(!true);
        System.out.println(!false);
    }
}
