package QUESTAO3;
public class Gerente extends Funcionario {
    private String departamento =  "";
    private int nivel = 0;

    public Gerente(String nome, int id, double salario, String departamento, int nivel){
        super(nome, id, salario);
        this.departamento = departamento;
        this.nivel = nivel;
    }
    @Override
    public double CalcularSalarioFinal(){
        double salarioFinal = (super.GetSalario() * this.nivel );
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " + this.departamento + "\nNível: " + this.nivel;
    }

}
