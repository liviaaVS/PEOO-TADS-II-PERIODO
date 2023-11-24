package QUESTAO3;
public abstract class Funcionario {
    private String nome = "";
    private int id = 0;
    private double salario = 0.0;

    public Funcionario(String nome, int id, double salario){
        this.nome = nome;
        this.id =  id;
        this.salario =  salario;
    }
    public void SetSalario(double salario){
        this.salario = salario;
    }
    public abstract double CalcularSalarioFinal();

    public double GetSalario(){
        return this.salario;
    }
    public String toString() {
        return "Nome: " +  this.nome + "\nId: " +  this.id + "\nSalario Inicial: " + this.salario + "\nSalario Final: " + CalcularSalarioFinal();
    }
}
