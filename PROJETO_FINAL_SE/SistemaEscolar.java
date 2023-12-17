import java.util.*;
import java.util.stream.IntStream;




public class SistemaEscolar{
    Scanner leia = new Scanner(System.in);
    private List<Aluno> ListaAlunos;
    private List<Disciplina> ListaDisciplinas;
    private List<Professor> ListaProfessores;



    public SistemaEscolar(){

        this.ListaAlunos = new ArrayList();
        this.ListaDisciplinas = new ArrayList();
        ListaProfessores = new ArrayList();

    }
   
   
    public boolean MatricularAluno(){
        return true;
    }

   
    public boolean AtribuirNota(){
        return true;
    }






    // ###############################################################
    // ### Metodos relacionados aos alunos

    public boolean findAluno(int matricula){
        Aluno encontrado = ListaAlunos.stream().filter(a -> a.getMatriculaAluno() == matricula).findFirst().orElse(null);        
        if(encontrado!= null){
            return true;
        }else{
            return false;
        }
    }

    public int findDisciplinaAluno(Aluno aluno, String disciplina) {
        ArrayList<Notas> disciplinas = aluno.getBotelim();
        Notas encontrado = disciplinas.stream()
                .filter(a -> a.getDisciplina().toUpperCase().trim().equals(disciplina))
                .findFirst()
                .orElse(null);
    
        return disciplinas.indexOf(encontrado);
    }


    public void CadastrarAluno(Aluno aluno){
       boolean cadastrado = findAluno(aluno.getMatriculaAluno());
       if(!cadastrado){
            ListaAlunos.add(aluno);
            System.out.println("\nAluno cadastrado com sucesso!");
       }else{
            System.out.println("\nNão foi possível cadastrar aluno, pois ele já se encontra no sistema.");
       }

    }
    public boolean DeletarAluno(Aluno aluno){
        boolean cadastrado = findAluno(aluno.getMatriculaAluno());
       if(cadastrado){
            ListaAlunos.add(aluno);
            System.out.println("\nAluno deletado com sucesso!");
            return true;
       }else{
            System.out.println("\nAluno não existe no sistema.");
            return false;
       }
    }

    public void ListarAlunos(){
        for(int x = 0; x< this.ListaAlunos.size(); x++){
            Aluno aluno = ListaAlunos.get(x);
            System.out.println("Matrícula: " +  aluno.getMatriculaAluno());
            System.out.println("Nome: " +  aluno.getNomeAluno());
            System.out.println("- Disciplinas: ");
            ArrayList<Notas> disciplina = aluno.getBotelim();
            for(int y = 0; x< disciplina.size(); x++) 
            System.out.println(y + "." +  " " + disciplina.get(y).getDisciplina() + "\n");
        }

    }


    // ###############################################################
    // ### Metodos relacionados aos Professores

    public int findProfessor(int idprof ){
        Professor encontrado = ListaProfessores.stream().filter(prof -> prof.getIdProf() == idprof).findFirst().orElse(null);        
        return ListaProfessores.indexOf(encontrado);
    }
   


    public boolean CadastrarProfessor(Professor professor){
       int cadastrado = findProfessor(professor.getIdProf());
       if(cadastrado == -1){
            ListaProfessores.add(professor);
            System.out.println("\nProfessor cadastrado com sucesso!");
            return true;
       }else{
            System.out.println("\nNão foi possível cadastrar professor, pois ele já se encontra no sistema.");
            return false;
       }

    }

    public boolean DeletarProfessor(int idprof){

       int cadastrado = findProfessor(idprof);
       if(cadastrado != -1){
            ListaProfessores.remove(ListaProfessores.get(cadastrado));
            System.out.println("\nProfessor deletado com sucesso!");
            return true;
       }else{
            System.out.println("\nNão foi possível deletar professor, pois ele já se encontra no sistema.");
            return false;
       }

    }

    public void ListarProfessores(){
        for(int x = 0; x< this.ListaProfessores.size(); x++){
            Professor prof = ListaProfessores.get(x);
            System.out.println("Id: " +  prof.getIdProf());
            System.out.println("Id: " +  prof.getNomeProf());
            System.out.println("Id: " +  prof.getDisciplina().getNomeDisciplina() +"\n ------------------");

        }

    }


    // ###############################################################
    // ### Metodos relacionados as Disciplinas




     
    public boolean CadastrarDisciplina(){
        return true;
    }

    public boolean DeletarDisciplina(){
        return true;
    }



}
