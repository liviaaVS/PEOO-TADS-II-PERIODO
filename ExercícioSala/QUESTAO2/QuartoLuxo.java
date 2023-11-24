package QUESTAO2;
public class QuartoLuxo extends Quarto{
    public boolean jacuzzi = false;
    public QuartoLuxo(int numero, int capacidade, double precoBase, boolean jacuzzi) {
        super(numero, capacidade, precoBase);
        this.jacuzzi = jacuzzi;
    }
    public double calcularCusto(){
        if (this.jacuzzi == true) return super.calcularCusto() + 50.00;
        else return super.calcularCusto();
    }

    public String obterInformacoes(){
        return super.obterInformacoes() + calcularCusto() + "\nJacuzzi: " +  this.jacuzzi;
    }
}
