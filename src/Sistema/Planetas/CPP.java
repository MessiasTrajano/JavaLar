package Sistema.Planetas;

import Sistema.Coordenada;
import Sistema.Planeta;

public class CPP extends Planeta {
    public CPP(){
        super("C++", 2, 0.5,new Coordenada(14, 2, 8), new Coordenada(14, 2, 14));
        this.movimentoTotal = 48;
        this.estado = "vivo";
    }
}
