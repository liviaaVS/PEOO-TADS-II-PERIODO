package src.QUESTAO03;

public class Retangulo {
    private double base = 0.0;
    private double altura = 0.0;

    public void Retangulo(double base, double altura){
        this.base = base;
        this.altura =  altura;
    }
    public void SetBase(double base){
        this.base =  base;
    }
    
    public void SetAltura(double altura){
        this.altura =  altura;
    }

    public double GetBase(){
        return this.base;
    }

    public double GetAltura(){
        return this.altura;
    }

    public double CalArea(){
        return this.base * this.altura;
    }
    public double CalDiagonal(){
        return (this.base*this.base) + (this.altura * this.altura);
    }
    public String toString(){
        return "Base: " + this.base + "\nAltura: " + this.altura + "\nArea: " + CalArea() + "\nDiagonal: " + CalDiagonal();
    }
}
