package ANDRE;
public class QuartoSimples extends Quarto{

    public QuartoSimples(int numero, int capacidade, double precoBase, String descricao){
        super(numero, capacidade, precoBase,"Quarto Simples", descricao);
    }
    @Override
    public double calcularCusto(){
        double custo = super.capacidade * super.precoBase * 1.0;
        return custo;
    }
    @Override
    public String obterInformacoes(){
        return "\nTipo:" + super.tipo +"\nDescrição: " + super.descricao + "\nCusto total: " + calcularCusto();
    }
  
}
