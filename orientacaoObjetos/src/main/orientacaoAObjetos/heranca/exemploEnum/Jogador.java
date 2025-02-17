package heranca.exemploEnum;

public class Jogador {

    int x;
    int y;

    boolean andar(Direcao direcao){

        switch (direcao){
            case SUL:
                y++;
                break;
            case NORTE:
                y--;
                break;
            case LESTE:
                x ++;
                break;
            case OESTE:
                x --;
                break;
        }
        return true;
    }
}
