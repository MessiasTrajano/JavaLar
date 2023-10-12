package Sistema.Planetas;

import Sistema.Coordenada;
import Sistema.Planeta;

public class C extends Planeta {
    public C(){
        super("C", 10, 0.1 ,new Coordenada(15, 1, 8), new Coordenada(15, 1, 15));
        this.movimentoTotal = 56;
        this.estado = "vivo";
    }
}
