import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Principal {
    
    static Scanner leia = new Scanner(System.in);
    static int opcao2, opcao;
    static SistemaEscolar se = new SistemaEscolar();

    public static void continuar(){
        System.out.println("Fazer outra operação? 1.SIM | 2.NAO");
        int escolha = leia.nextInt();
        if(escolha != 1) opcao = 0;
    }


    public static void basededados(){

        Disciplina disc1 = new Disciplina("Algoritmos");
        se.CadastrarDisciplina(disc1);
        Disciplina disc2 = new Disciplina("PEOO");
        se.CadastrarDisciplina(disc2);
        Disciplina disc3 = new Disciplina("Arquitetura de PC");
        se.CadastrarDisciplina(disc3);

        Aluno aluno1 = new Aluno("Livia", 40029);
        se.CadastrarAluno(aluno1);
        Aluno aluno2 = new Aluno("Ryan", 45885);
        se.CadastrarAluno(aluno2);
        Aluno aluno3 = new Aluno("Outra pessoa", 7896);
        se.CadastrarAluno(aluno3);

        Professor prof1 = new Professor("Jorgiano");
        se.CadastrarProfessor(prof1);
        Professor prof2 = new Professor("Lucena");
        se.CadastrarProfessor(prof2);
        Professor prof3 = new Professor("Bráulio");
        se.CadastrarProfessor(prof3);

    
    }
    public static void main(String[] args) {
            basededados();
        
            System.out.println("### <link>Sistema Escolar</link> ###");
            System.out.println("### Faça login como: ###");
            System.out.println("1. Aluno  ");
            System.out.println("2. Professor ");
            System.out.println("3. Administrador ");
            opcao =  leia.nextInt();

            if(opcao == 1){
                
                System.out.println("SISTEMA ESCOLAR: Aluno");
                System.out.println("\n1. Digite sua matrícula: ");
               


            }
            if(opcao == 2){
                
                System.out.println("SISTEMA ESCOLAR: Professor");
                System.out.println("\n1. Digite seu id: ");
               

            }
            if(opcao == 3){
                
                do{
                System.out.println("SISTEMA ESCOLAR: ADMINISTRAÇÃO");
                System.out.println("\n1. Cadastrar Disciplina");
                System.out.println("2. Cadastrar Professor");
                System.out.println("3. Cadastrar Aluno");
                System.out.println("4. Cadastrar um Professor em uma disciplina");
                System.out.println("5. Cadastrar um Aluno de uma disciplina");
                System.out.println("6. Remover um Professor o de uma disciplina");
                System.out.println("7. Vizualizar Professores");
                System.out.println("8. Vizualizar Alunos");
                System.out.println("9. Vizualizar Disciplinas");
                opcao2 =  leia.nextInt();

                    switch(opcao2){
                        case 1:
                            System.out.println("|-------------- Cadastrar Disciplina");
                            System.out.println("Insira o nome da Disciplina: ");
                            String nomedisc = leia.nextLine();
                            Disciplina disc = new Disciplina(nomedisc);
                            se.CadastrarDisciplina(disc);
                            continuar();                          
                            break;
                        case 2:
                            System.out.println("|-------------- Cadastrar Professor");
                            System.out.println("Insira o nome do Professor: ");
                            String nomepro = leia.nextLine();
                            Professor prof = new Professor(nomepro);
                            se.CadastrarProfessor(prof);
                            continuar();                          
                            break;
                        case 3:
                            System.out.println("|-------------- Cadastrar Aluno");
                            System.out.println("Insira o nome Aluno: ");
                            String nomealu = leia.nextLine();
                            System.out.println("Insira a matrícula: ");
                            int matricula = leia.nextInt();
                            Aluno alu = new Aluno(nomealu, matricula);
                            se.CadastrarAluno(alu);
                            continuar();                          
                            break;
                        case 4:
                            System.out.println("|-------------- Cadastrar um Professor em uma disciplina");

                            se.ListarProfessores();
                            System.out.println("Insira o id do professor: ");
                            int idprof =  leia.nextInt();

                            System.out.println("__________________________________");

                            se.ListarDisciplinas();
                            System.out.println("Insira o nome da disciplina: ");
                            int iddisc =  leia.nextInt();

                            se.CadastrarProfessorDisciplina(idprof-1, iddisc);
                            continuar();                          
                            break;
                        case 5:
                            System.out.println("|-------------- Cadastrar um Aluno em uma disciplina");

                            se.ListarAlunos();
                            System.out.println("Insira o id do Aluno: ");
                            int idAluno =  leia.nextInt();

                            System.out.println("__________________________________");

                            se.ListarDisciplinas();
                            System.out.println("Insira o nome da disciplina: ");
                            int iddisca =  leia.nextInt();

                            se.CadastrarAlunoDisciplina(idAluno,iddisca);  
                            continuar();                          
                            break;
                        case 6:
                            System.out.println("|-------------- Remover um Professor de uma disciplina");
                            continuar();                          
                            break;
                        case 7:
                            System.out.println("|-------------- Vizualizar Professores\n");
                            se.ListarProfessores();
                            continuar();
                            break;
                        case 8:
                            System.out.println("|-------------- Vizualizar Alunos\n");
                            se.ListarAlunos();
                            continuar();
                            break;  

                        case 9:
                            System.out.println("Vizualizar Disciplinas\n");
                            se.ListarDisciplinas();
                            continuar();
                            break; 
                    }

                }while(opcao2 !=0);
            }


        }           

}
