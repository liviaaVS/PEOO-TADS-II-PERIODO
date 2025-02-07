package ANDRE;
public class QuartoLuxo extends Quarto{
    public QuartoLuxo(int numero, int capacidade, double precoBase, String descricao){
        super(numero, capacidade, precoBase,"Quarto de Luxo", descricao);
    }
    @Override
    public double calcularCusto(){
        double custo = super.capacidade * super.precoBase * 2.5;
        return custo;
    }
    @Override
    public String obterInformacoes(){
        return "\nTipo:" + super.tipo +"\nDescrição: " + super.descricao + "\nCusto total: " + calcularCusto();
    }
  
}
