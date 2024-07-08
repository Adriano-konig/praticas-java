package treinarSemCopiar;

public class TipoString {

    public static void main(String[] args) {

        String nome = "Adriano";
        String sobrenome = "konig";
        String empresa = "Zup Innavation";
        String cidade = "Curitiba";
        String bairro = "Agua verde";
        String endereco = "Avenida Iguaçu";
        int numero = 2000;
        String complementa = "apto 90A";
        int idade = 37;
        double salario = 5400.80;


        System.out.printf("Meu nome é %s %s tenho %d anos e moro em %s e bairro %s e o endereço é %s numero casa %s complementa %s e trabalho de uma empresa chama se %s e meu salario atual é R$%.2f",
                nome,
                sobrenome,
                idade,
                cidade,
                bairro,
                endereco,
                numero,
                complementa,
                empresa,
                salario
                );

        String frase = String.format("\nMeu nome é %s %s tenho %d anos e moro em %s e bairro %s e o endereço é %s numero casa %s complementa %s e trabalho de uma empresa chama se %s e meu salario atual é R$%.2f",
                nome,
                sobrenome,
                idade,
                cidade,
                bairro,
                endereco,
                numero,
                complementa,
                empresa,
                salario
                );
        System.out.println(frase);

        System.out.println("\n\nNome: " + nome.toUpperCase()
                + "\n sobrenome: " + sobrenome.toUpperCase()
                + "\n idade: " + idade
                + "\n cidade: " + cidade.replace("Curitiba","Florianopolis".concat(" - SC"))
                + "\n endereço: " + bairro.replace("Agua verde", "vila nova".toUpperCase()));

        String fraseAtualizado = String.format("\n\nNome: " + nome.toUpperCase()
                + "\n sobrenome: " + sobrenome.toUpperCase()
                + "\n idade: " + idade
                + "\n cidade: " + cidade.replace("Curitiba","Rio de Janeiro".concat(" - RJ"))
                + "\n endereço: " + bairro.replace("Agua verde", "lapa".toUpperCase()));
        System.out.println(fraseAtualizado);


    }
}
