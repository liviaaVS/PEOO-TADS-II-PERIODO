package QUESTAO1;
public class Retangulo extends Forma{
    public double base = 0.0;
    public double altura = 0.0;

    public Retangulo( double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea(){
        return this.base*this.altura;
    }

    @Override
    public double CalcularPerimetro(){
        return (this.base*2)+(this.altura*2);
    }
}
