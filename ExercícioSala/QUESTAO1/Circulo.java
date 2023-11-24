package QUESTAO1;

public class Circulo extends Forma {
    public double raio = 0.0;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override // Overide pois estão substituindo metodos abstratos da classe pai
    public double CalcularArea() {
        return (this.raio * this.raio) * 3.14;
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }
}
