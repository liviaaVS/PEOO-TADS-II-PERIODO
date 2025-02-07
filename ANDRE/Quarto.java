package ANDRE;

public abstract  class Quarto {
    protected  int numero = 0;
    protected  int capacidade = 0;
    protected  double precoBase = 0.0;
    protected  String tipo = "";
    protected  String descricao = "";
    protected boolean reservado = false;
    protected boolean pago = false;

    Quarto(int numero,int capacidade, double precoBase, String tipo, String descricao){
        this.numero =  numero;
        this.capacidade =  capacidade;
        this.precoBase = precoBase;
        this.tipo = tipo;
        this.descricao = descricao;
    }
    public abstract double calcularCusto();
    public abstract  String obterInformacoes();
}
