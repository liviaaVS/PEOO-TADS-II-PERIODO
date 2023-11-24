import java.util.Scanner;
import QUESTAO1.*;
import QUESTAO2.QuartoLuxo;
import QUESTAO2.QuartoSimples;
import QUESTAO2.SuitePresidencial;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double value;
        System.out.println("Digite o raio do círculo: ");
        value = leia.nextDouble();

        Circulo c1 = new Circulo(value);
        c1.CalcularPerimetro();

        System.out.println("Area: " + c1.CalcularArea() + "\nPerímetro: " + c1.CalcularPerimetro());
        
        System.out.println("*** TESTANDO RETÂNGULO ***");
        Retangulo r1 = new Retangulo(16, 4);

        System.out.println("Area: " + r1.CalcularArea() + "\nPerímetro: " + r1.CalcularPerimetro());

        System.out.println("\n*** TESTANDO QUARTO SIMPLES***");
        QuartoSimples qs1 = new QuartoSimples(123, 30, 100.00);
        System.out.println(qs1.obterInformacoes());

        System.out.println("\n*** TESTANDO QUARTO DE LUXO***");

        
        QuartoLuxo ql1 = new QuartoLuxo(124, 50, 200.00, false);
        QuartoLuxo ql2 = new QuartoLuxo(124, 50, 200.00, true);

        System.out.println("Quarto de luxo 1: " +  ql1.obterInformacoes());
        System.out.println("Quarto de luxo 2: " +  ql2.obterInformacoes());
      
        System.out.println("\n*** TESTANDO SUITE PRESIDENCIAL***");


        SuitePresidencial sp1 = new SuitePresidencial(124, 50, 500.00, false);
        SuitePresidencial sp2 = new SuitePresidencial(124, 50, 500.00, true);

        System.out.println("Suíte Presidencial 1: " +  sp1.obterInformacoes());
        System.out.println("Suíte Presidencial2: " +  sp2.obterInformacoes());


        System.out.println("\n*** TESTANDO FUNCIONARIO PROGRAMADOR***");

        Programador pro1 = new Programador("Livia", 0, 1330.00, "Java");

        System.out.println(pro1.toString());

        System.out.println("\n*** TESTANDO FUNCIONARIO GERENTE***");

        Gerente gere1 = new Gerente("JoycinhaXD", 1, 2200.00,"Finanças", 3);
        System.out.println(gere1.toString());
        


    }
}
