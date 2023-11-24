package QUESTAO2;
public class QuartoSimples extends Quarto {
   
    public QuartoSimples(int numero, int capacidade, double precoBase) {
        super(numero, capacidade, precoBase);
    }
    public double calcularCusto(){
       return super.calcularCusto();
    }

    public String obterInformacoes(){
        return super.obterInformacoes();
    }
    // Other methods specific to QuartoSimples can be added here
    
}
