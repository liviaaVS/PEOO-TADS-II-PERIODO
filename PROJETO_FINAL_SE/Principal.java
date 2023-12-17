import java.util.Scanner;




public class Principal {
    public void basededados(){
    SistemaEscolar se = new SistemaEscolar();

    Aluno aluno1 = new Aluno("Livia", 40029);

    }
    public static void main(String[] args) {
            SistemaEscolar se = new SistemaEscolar();
            Scanner leia = new Scanner(System.in);
            System.out.println("### <link>Sistema Escolar</link> ###");
            System.out.println("### Faça login como: ###");
            System.out.println("1. Aluno  ");
            System.out.println("2. Professor ");
            System.out.println("3. Administrador ");
            int opcao =  leia.nextInt();

            if(opcao == 1){
                
                System.out.println("SISTEMA ESCOLAR: Aluno");
                System.out.println("\n1. Digite sua matrícula: ");
               


            }
            if(opcao == 2){
                
                System.out.println("SISTEMA ESCOLAR: Professor");
                System.out.println("\n1. Digite seu id: ");
               

            }
            if(opcao == 3){
                
                System.out.println("SISTEMA ESCOLAR: ADMINISTRAÇÃO");
                System.out.println("\n1. Cadastrar Disciplina");
                System.out.println("2. Cadastrar Professor");
                System.out.println("3. Cadastrar Aluno");
                System.out.println("4. Cadastrar um Professor em uma disciplina");
                System.out.println("6. Cadastrar um Aluno de uma disciplina");
                System.out.println("7. Remover um Professor o de uma disciplina");
                System.out.println("8. Vizualizar Professores");
                System.out.println("8. Vizualizar Alunos");

            }


        }           

}
