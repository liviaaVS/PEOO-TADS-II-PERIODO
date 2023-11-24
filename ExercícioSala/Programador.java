import java.util.Set;

public class Programador extends Funcionario{
    public String linguagem = "";
    
    public Programador(String nome, int id, double salario, String linguagem){
        super(nome, id, salario);
        this.linguagem = linguagem;
    }

    @Override
    public double CalcularSalarioFinal(){
        if(this.linguagem.toUpperCase().trim().equals("JAVA")){
            double salarioFinal = super.GetSalario() + (super.GetSalario() * 0.5);
            return salarioFinal;
        }
        return super.GetSalario();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLinguagem: " + this.linguagem;
    }

}
