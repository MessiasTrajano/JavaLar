
package Utilidades;

import Sistema.Coordenada;
public class BugsDevs {
    protected Coordenada x;
    protected Coordenada y;
    protected String nome;

    public BugsDevs(String nome, int aleatorio1, int aleatorio2){
        this.nome = nome;
        this.x = new Coordenada(15, 1, aleatorio1);
        this.y = new Coordenada(15, 1, aleatorio2);
    }

    public String getNome() {
        return nome;
    }
    public int locX(){
        return x.getCordMovimento();
    }
    public int locY(){
        return y.getCordMovimento();
    }


}
