package colecoes.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo"); //put e como alteração vai mudar nome Roberto para Ricardo.
        usuarios.put(2, "Bruno");
        usuarios.put(3, "João");
        usuarios.put(4, "Robeca");
        usuarios.put(5, "Ricardo");


        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Bruno"));

        System.out.println(usuarios.get(4));

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }




    }
}
