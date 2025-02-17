package encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcesso(){
        // segredo  -> private
        //facoDentroCasa -> default (pacote)
        //formaDefalar -> protected
        //todosSabem -> public

        //Não consegue acessa porque atributo é privado!!
        //System.out.println(esposa.segredo);

        // Tem acesso porque mora mesmo casa
        System.out.println(esposa.facoDentroDeCasa);

        // Tem acesso porque esta no mesmo pacote
        System.out.println(esposa.formaDeFalar);

        //Tem acesso porque é publico
        System.out.println(esposa.todossabem);
    }
}
