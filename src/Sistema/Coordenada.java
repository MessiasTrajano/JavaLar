package Sistema;

public class Coordenada {
    protected int cordMaxima;
    protected int cordMinima;
    protected int cordMovimento;

    public Coordenada( int cordMaxima, int cordMinima, int cordMovimento){
        this.cordMaxima = cordMaxima;
        this.cordMinima= cordMinima;
        this.cordMovimento = cordMovimento;
    }

    public int getCordMaxima() {
        return cordMaxima;
    }

    public int getCordMinima() {
        return cordMinima;
    }

    public int getCordMovimento() {
        return cordMovimento;
    }


}
