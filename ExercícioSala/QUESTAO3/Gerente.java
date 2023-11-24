package QUESTAO3;
public class Gerente extends Funcionario {
    private String departamento =  "";
    private int nivel = 0;

    public Gerente(String nome, int id, double salario, String departamento, int nivel){
        super(nome, id, salario);
        this.departamento = departamento;
        this.nivel = nivel;
    }
    public double calcularBonificacao(){
        return super.GetSalario() * 0.05;
    }

    @Override
    public double CalcularSalarioFinal(){
        double salarioFinal = (super.GetSalario() * this.nivel ) + calcularBonificacao();
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonificaçao de 5% (Incide no salario base): " + calcularBonificacao() + "\nDepartamento: " + this.departamento + "\nNível: " + this.nivel;
    }

}
