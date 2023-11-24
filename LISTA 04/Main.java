import src.QUESTAO01.Circulo;
import src.QUESTAO02.Disciplina;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("\nBEM VINDO A LISTA 04 DA DISCIPLINA DE POO");
        System.out.println("SELECIONE A QUESTAO QUE DESEJA TESTAR: ");
        System.out.println(
                "1 - Um círculo\n2 - Uma disciplina\n3 - Um retângulo\n4 - Uma equação do II grau\n5 - Agenda de compromissos\n6 - Playlist\n7 - Fechar programa.");
    }

    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            double raio;
            int opcao = 0;
            while (opcao != 7) {
                System.out.flush();
                menu();
                opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("CLASSE: CIRCULO");
                        Circulo meuCirculo = new Circulo();
                        System.out.println("Digite o raio: ");
                        raio = leia.nextDouble();
                        meuCirculo.SetRaio(raio);
                        meuCirculo.calcularArea();
                        double area = meuCirculo.GetArea(); // Calcula a área do círculo
                        System.out.println("A área do círculo é: " + area);
                        System.out.println("Pressione enter para continuar...");
                        leia.nextLine();
                        break;
                    case 2:
                        Disciplina minhDisciplina = new Disciplina();
                        System.out.println("CLASSE DISCIPLINA");

                        for(int x=0;x<2;x++){
                            int aux =  leia.nextInt();
                            minhDisciplina.construtor(aux, x);
                        }
                        minhDisciplina.SetMediaP();
                        double aux = minhDisciplina.GetMediaP();

                        if(minhDisciplina.aprovado(aux)){
                            System.out.println("Aprovado!");
                            System.out.println("Media: "+ minhDisciplina.GetMediaP());
                        }else{
                            System.out.println("Recuperação, digite a nota da prova final.");
                            int notapf = leia.nextInt();

                            minhDisciplina.SetMediaF(notapf);
                            aux = minhDisciplina.GetMediaF();
                            if(minhDisciplina.aprovado(aux)) System.out.println("Aprovado!");
                            else System.out.println("Reprovado");
                            System.out.println(minhDisciplina.toString());
                        }
                        System.out.println("Pressione enter para continuar...");
                        String a = leia.nextLine();
                        break;
                    case 3:
                        System.out.println("CLASSE RETÂNGULO");

                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
