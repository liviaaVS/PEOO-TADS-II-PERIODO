package src.QUESTAO01;


public class Circulo {
    private double raio = 0.0;
    private double pi = 3.14;
    private double area = 0.0;


    public void SetRaio( double raio){
        this.raio = raio;
        System.out.println("Raio Inserido com sucesso!");
    }

    public void calcularArea(){
        this.area = this.pi * Math.pow(this.raio, 2);
    }
    public double GetArea(){
        return this.area;
    }
}


