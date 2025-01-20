public class This {

    public static void main(String[] args) {

        DataThis data = new DataThis();
        data.ano = 2025;

        var data2 = new DataThis(14, 12, 2026);

        String dataFormatada1 = data.formataData();

        System.out.println(dataFormatada1);
        System.out.println(data2.formataData());

    }
}
