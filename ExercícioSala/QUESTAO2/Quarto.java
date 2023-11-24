package QUESTAO2;
public class Quarto {
    private int numero = 0;
    private int capacidade = 0;
    private double precoBase = 0.0;

    Quarto(int numero,int capacidade, double precoBase){
        this.numero =  numero;
        this.capacidade =  capacidade;
        this.precoBase = precoBase;
    }
    public double calcularCusto(){
        double custo =  this.capacidade * precoBase;
        return custo;
    }

    public String obterInformacoes() {
        return "\nN° " + this.numero + "\nCapacidade: " + this.capacidade + "\nPreço Base: " + this.precoBase  + "\nCusto total: ";
    }
}
