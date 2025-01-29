package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println(conjunto.size());

        conjunto.add("teste"); //Letra miniscula foi adicionado de conjunto
        conjunto.add("Teste"); //Letra maiuscula esta igual de linha 13 e não foi adicionado pois SET não aceita repetição
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste")); //true -> um conjunto foi removido ao contrario será false
        System.out.println("Como ficou o Tamanho após remove uma " + conjunto.size());

        System.out.println(conjunto.remove("1")); // gerou false pois coloquei "" e uma String por isso não esta axiste
        System.out.println(conjunto.remove(1)); // agora gerou true

        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.contains("x"));
        System.out.println(conjunto.contains(1)); // -> está false porque removi esse conjunto
        System.out.println(conjunto.contains("Teste"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); //Uniao entre dois conjuntos cpnjunto + nums
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(nums);





    }
}
