package Sistema.Planetas;

import Sistema.Coordenada;
import Sistema.Planeta;

public class Python extends Planeta {
    public Python(){
        super("Python", 4, 24 ,new Coordenada(9, 7, 8), new Coordenada(9, 7, 9));
        this.movimentoTotal = 8;
        this.estado = "vivo";
    }


}
