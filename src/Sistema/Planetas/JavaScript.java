package Sistema.Planetas;

import Sistema.Coordenada;
import Sistema.Planeta;

public class JavaScript extends Planeta {

    public JavaScript(){
        super("JavaScript", 3, 10 ,new Coordenada(10, 6, 8), new Coordenada(10, 6, 10));
        this.movimentoTotal = 16;
        this.estado = "vivo";
    }

}
