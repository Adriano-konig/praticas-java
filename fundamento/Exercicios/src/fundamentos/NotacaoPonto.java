package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        double a = 3.2;

        String s = "Bom dia X";


        s = s.replace("X", "Senhora"); //faz substituição
        System.out.println(s);

        //s.toUpperCase(); // Não altere
        s = s.toUpperCase(); // altere para letras Maiscular
        s = s.concat("!!!"); //complementar
        System.out.println(s);

        String y = "Boa tarde x"
                .replace("x","adriano")
                .toUpperCase()
                .concat("!");
        System.out.println(y);

    }
}
