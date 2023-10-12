package Sistema.Planetas;

import Sistema.Coordenada;
import Sistema.Planeta;

public class Php extends Planeta {

    public Php(){

        super("PHP", 2, 60 ,new Coordenada(12, 4, 8), new Coordenada(12, 4, 12));
        this.movimentoTotal = 32;
        this.estado = "vivo";
    }
}
