package fundamentos;

public class Wrapper {
    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //int
//        Integer i = Integer.parseInt("10000");
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 124.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        boolean boo = Boolean.parseBoolean("false");
        System.out.println(boo);
        System.out.println(("" + boo).toUpperCase());

        Character c = '#'; //char
        System.out.println(c + "....");

    }
}
