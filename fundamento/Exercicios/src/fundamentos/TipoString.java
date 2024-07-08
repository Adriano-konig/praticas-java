package fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(2)); // Buscar letra ordem de palvra sempre comeca 0,1,2...
        System.out.println("Olá pessoal".charAt(0)); // Buscar letra ordem de palvra sempre comeca 0,1,2...
        System.out.println("Olá pessoal".charAt(3)); // Buscar letra ordem de palvra sempre comeca 0,1,2...
        System.out.println("Olá pessoal".charAt(5)); // Buscar letra ordem de palvra sempre comeca 0,1,2...

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("BOA"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.toLowerCase().startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equals("BOA TARDE"));

        var nome = "Pedro";
        var sobrenome = "santos";
        var idade = 33;
        var salario = 12345.89F;

        System.out.println("Seu nome é: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nSalario: $" + salario + "\n\n");

        System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nNome: %s %s tem %d anos e ganha R$%.2f. \n", nome, sobrenome, idade, salario);
        System.out.printf(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 8));
        System.out.println("Frase qualquer".substring(6, 10));

    }
}
