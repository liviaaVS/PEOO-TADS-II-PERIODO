package QUESTAO2;
public class SuitePresidencial extends Quarto {
    public boolean SalaReunioes = false;
    public SuitePresidencial(int numero, int capacidade, double precoBase, boolean SalaReunioes) {
        super(numero, capacidade, precoBase);
        this.SalaReunioes =  SalaReunioes;
    }
    public double calcularCusto(){
        if (this.SalaReunioes == true) return super.calcularCusto() + 200.00;
        else return super.calcularCusto();
    }

    public String obterInformacoes(){
        return super.obterInformacoes() + calcularCusto() + "\nSala de Reunioes: " +  this.SalaReunioes;
    }

}
