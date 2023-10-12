package Sistema;

public abstract class Planeta {

    protected Coordenada x;
    protected Coordenada y;
    protected String nome;
    protected int unidade;
    protected double horas;
    protected String estado;
    protected double movimentoTotal;

    public Planeta(String nome, int unidade, double horas, Coordenada x, Coordenada y){
    this.nome = nome;
    this.unidade = unidade;
    this.horas = horas;
    this.x = x;
    this.y = y;

    }


    public void movimento(){

        for(int i = 0; i < unidade; i++) {
            if (x.cordMovimento > x.cordMinima && y.cordMovimento == y.cordMaxima) {
                x.cordMovimento += (-1);

            } else if (y.cordMovimento > y.cordMinima && x.cordMovimento < 8) {
                y.cordMovimento += (-1);

            } else if (x.cordMovimento < x.cordMaxima) {
                x.cordMovimento += (1);

            } else if (y.cordMovimento < y.cordMaxima) {
                y.cordMovimento += (1);
            }
        }
    }
    public int pontoX() {
        return x.getCordMovimento();
    }
    public int pontoY() {
        return y.getCordMovimento();
    }

    public  String getNome() {
        return nome;
    }
    public double getHoras() {
        return horas;
    }
    public double getMovimentoTotal() {
        return movimentoTotal;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int numero) {
        this.unidade = unidade + (1*numero);
    }
}