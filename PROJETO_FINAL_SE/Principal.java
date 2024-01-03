import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Principal {
    
    static Scanner leia = new Scanner(System.in);
    static int opcao=-1;
    static SistemaEscolar se = new SistemaEscolar();

    public static void continuar(){
        System.out.println("Fazer outra operação? 1.SIM | 2.NAO");
        int escolha = leia.nextInt();
        if(escolha != 1) opcao = 0;
    }


    public static void basededados(){

        Disciplina disc1 = new Disciplina("Algoritmos"); /* id 0 */
        se.CadastrarDisciplina(disc1);
        Disciplina disc2 = new Disciplina("POO"); /* id 1 */
        se.CadastrarDisciplina(disc2);
        Disciplina disc3 = new Disciplina("Arquitetura de PC"); /* id 2 */
        se.CadastrarDisciplina(disc3);
        Disciplina disc4 = new Disciplina("Programação"); /* id 3 */
        se.CadastrarDisciplina(disc4);

        Aluno aluno1 = new Aluno("Livia", 40029);
        se.CadastrarAluno(aluno1);
        Aluno aluno2 = new Aluno("Ryan", 45885);
        se.CadastrarAluno(aluno2);
        Aluno aluno3 = new Aluno("Juliano", 7896);
        se.CadastrarAluno(aluno3);

        Professor prof1 = new Professor("Jorgiano");
        se.CadastrarProfessor(prof1);
        Professor prof2 = new Professor("Lucena");
        se.CadastrarProfessor(prof2);
        Professor prof3 = new Professor("Bráulio");
        se.CadastrarProfessor(prof3);
        Professor prof4 = new Professor("Joseph");
        se.CadastrarProfessor(prof4);

        se.CadastrarProfessorDisciplina(3, 3);
        se.CadastrarAlunoDisciplina(7896,2);
        se.CadastrarAlunoDisciplina(45885, 2);
        se.CadastrarAlunoDisciplina(45885, 3);
        se.CadastrarAlunoDisciplina(40029, 3);
        se.CadastrarAlunoDisciplina(7896, 3);

    
    }
    public static void main(String[] args) {
            basededados();                
                do{
                System.out.println("+-----------------------SISTEMA ESCOLAR: ADMINISTRAÇÃO--------------------+\n");

                System.out.println("+-------------------------+---------------------+-------------------------+");
                System.out.println("|          Sessão         |       Opção         |      Descrição          |");
                System.out.println("+-------------------------+---------------------+-------------------------+");
                System.out.println("|         Cadastrar       |         1           | Disciplina              |");
                System.out.println("|         Cadastrar       |         2           | Professor               |");
                System.out.println("|         Cadastrar       |         3           | Aluno                   |");
                System.out.println("|         Cadastrar       |         4           | Professor em disciplina |");
                System.out.println("|         Cadastrar       |         5           | Aluno em disciplina     |");
                System.out.println("+-------------------------+---------------------+-------------------------+");
                System.out.println("|          Remover        |         6           | Professor de disciplina |");
                System.out.println("+-------------------------+---------------------+-------------------------+");
                System.out.println("|        Visualizar       |         7           | Visualizar Professores  |");
                System.out.println("|        Visualizar       |         8           | Visualizar Alunos       |");
                System.out.println("|        Visualizar       |         9           | Visualizar Disciplinas  |");
                System.out.println("|        Visualizar       |         10          | Gerar Boletim           |");
                System.out.println("+-------------------------+---------------------+-------------------------+");
                System.out.println("|        Atribuição       |         11          | Atribuir Nota a Aluno   |");
                System.out.println("+-------------------------+---------------------+-------------------------+");

                                opcao =  leia.nextInt();

                    switch(opcao){
                        case 1:
                            System.out.println("+-------------- Cadastrar Disciplina --------------+");
                            leia.nextLine(); // Consumir o caractere de nova linha restante no buffer
                            System.out.print("Insira o nome da Disciplina: ");
                            String nomedisc = leia.nextLine();
                            Disciplina disc = new Disciplina(nomedisc);
                            se.CadastrarDisciplina(disc);
                            continuar();
                            break;
                        case 2:
                            System.out.println("+-------------- Cadastrar Professor --------------+\n");
                            leia.nextLine(); // Consumir o caractere de nova linha restante no buffer
                            System.out.print("Insira o nome do Professor: ");
                            String nomepro = leia.nextLine();
                            Professor prof = new Professor(nomepro);
                            se.CadastrarProfessor(prof);
                            continuar();                          
                            break;
                        case 3:
                            System.out.println("+-------------- Cadastrar Aluno --------------+\n");
                            leia.nextLine(); // Consumir o caractere de nova linha restante no buffer
                            System.out.print("Insira o nome Aluno: ");
                            String nomealu = leia.nextLine();
                            System.out.print("Insira a matrícula: ");
                            String inputMatricula = leia.nextLine();
                            int matricula = Integer.parseInt(inputMatricula);
                            Aluno alu = new Aluno(nomealu, matricula);
                            se.CadastrarAluno(alu);
                            continuar();
                            break;                        
                        case 4:
                            System.out.println("+-------------- Cadastrar um Professor em uma disciplina --------------+");

                            se.ListarProfessores();
                            System.out.print("Insira o id do professor: ");
                            int idprof =  leia.nextInt();

                            System.out.print("__________________________________");

                            se.ListarDisciplinas();
                            System.out.print("Insira o id da disciplina: ");
                            int iddisc =  leia.nextInt();

                            se.CadastrarProfessorDisciplina(idprof-1, iddisc-1);
                            continuar();                          
                            break;
                        case 5:
                            System.out.println("+-------------- Cadastrar um Aluno em uma disciplina --------------+");

                            se.ListarAlunos();
                            System.out.print("Insira a matrícula do aluno: ");
                            int idAluno =  leia.nextInt();

                            System.out.println("__________________________________");

                            se.ListarDisciplinas();
                            System.out.print("Insira o id da disciplina: ");
                            int iddisca =  leia.nextInt();

                            se.CadastrarAlunoDisciplina(idAluno,iddisca-1);  
                            continuar();                          
                            break;
                        case 6:
                            System.out.print("+-------------- Remover um Professor de uma disciplina --------------+");
                            se.ListarDisciplinas();
                            System.out.print("Insira o id da disciplina: ");
                            iddisc = leia.nextInt();
                            se.RemoverProfessorDisciplina(iddisc-1);
                            continuar();                          
                            break;
                        case 7:
                            System.out.println("+-------------- Vizualizar Professores --------------+\n");                           
                            se.ListarProfessores();
                            continuar();
                            break;
                        case 8:
                            System.out.println("+-------------- Vizualizar Alunos --------------+\n");
                            se.ListarAlunos();
                            continuar();
                            break;  

                        case 9:
                            System.out.println("+-------------- Vizualizar Disciplinas --------------+\n");
                            se.ListarDisciplinas();
                            continuar();
                            break; 
                        case 10:
                            System.out.println("+-------------- Gerar boletim  --------------+\n");
                            se.ListarAlunos();
                            System.out.print("Insira a Matrícula do Aluno.");
                            int mat =  leia.nextInt();
                            se.GerarBoletim(mat);
                            continuar();
                            break;
                        case 11:
                            System.out.println("+-------------- Atribuir Nota  --------------+\n");
                            se.ListarAlunos();
                            System.out.print("Escolha o Aluno por id: ");
                            int id_aluno = leia.nextInt();
                            System.out.println("Lista de disciplinas do Aluno:  " + se.getListadeAlunos().get(id_aluno-1).getNomeAluno());
                            System.out.println("______________________________________________\n");
                            if(se.getListadeAlunos().get(id_aluno-1).getBotelim().size() != 0){
                            se.ListarDisciplinasAluno(id_aluno-1);

                            System.out.print("Digite o id da disciplina: ");
                            int disciplina = leia.nextInt();
                            leia.nextLine();
                            System.out.println("Disciplina selecionada!");
                            System.out.print("Insira nota 01: ");
                            int nota01 = leia.nextInt();
                            System.out.print("Insira nota 02: ");
                            int nota02 = leia.nextInt();
                            System.out.println();
                            se.AtribuirNotaAluno(id_aluno-1, disciplina, nota01, nota02);
                            }else System.out.println("Esse aluno ainda não possui disciplinas.\n");
                            continuar();
                            break; 
                    }

                }while(opcao !=0);
            }
         

}
