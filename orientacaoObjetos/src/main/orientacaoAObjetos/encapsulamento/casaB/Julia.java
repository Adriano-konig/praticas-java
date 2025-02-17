package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();
    void testeAcesso(){
        // segredo  -> private
        //facoDentroCasa -> default (pacote)
        //formaDefalar -> protected
        //todosSabem -> public

        //Não consegue acessa porque atributo é privado!!
        //System.out.println(sogra.segredo);

        // não Tem acesso porque não mora mesmo casa
        //System.out.println(sogra.facoDentroDeCasa);

        // não tem acesso porquem não esta herança e nem mesmo pacote
        //System.out.println(sogra.formaDeFalar);

        //Tem acesso porque é publico
        System.out.println(sogra.todossabem);
    }
}
