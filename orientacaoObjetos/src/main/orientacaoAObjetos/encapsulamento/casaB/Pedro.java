package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcesso(){
        // segredo  -> private
        //facoDentroCasa -> default (pacote)
        //formaDefalar -> protected
        //todosSabem -> public

        //Não consegue acessa porque atributo é privado!!
        //System.out.println(segredo);

        // não Tem acesso porque não mora mesmo casa
        //System.out.println(facoDentroDeCasa);

        // Tem acesso porque esta herança de Mãe(Mae)
        System.out.println(formaDeFalar);

        //Tem acesso porque é publico
        System.out.println(todossabem);
    }
}
