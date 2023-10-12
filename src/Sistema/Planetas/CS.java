package Sistema.Planetas;

import Sistema.Coordenada;
import Sistema.Planeta;

public class CS extends Planeta {
    public CS(){
        super("C#", 1, 4 ,new Coordenada(13, 3, 8), new Coordenada(13, 3, 13));
        this.movimentoTotal = 40;
        this.estado = "vivo";
    }
}
