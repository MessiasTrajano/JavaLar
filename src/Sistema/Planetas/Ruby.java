package Sistema.Planetas;

import Sistema.Coordenada;
import Sistema.Planeta;

public class Ruby extends Planeta {
    public Ruby(){

        super("Ruby On Rails", 2, 48 ,new Coordenada(11, 5, 8), new Coordenada(11, 5, 11));
        this.movimentoTotal = 24;
        this.estado = "vivo";
    }
}
