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

    public int findAluno(int matricula){
        Aluno encontrado = ListaAlunos.stream().filter(a -> a.getMatriculaAluno() == matricula).findFirst().orElse(null);        
        return ListaAlunos.indexOf(encontrado);
    }

    public int findDisciplinaAluno(Aluno aluno, String disciplina) {
        ArrayList<Notas> disciplinas = aluno.getBotelim();
        Notas encontrado = disciplinas.stream()
                .filter(a -> a.getDisciplina().toUpperCase().trim().equals(disciplina))
                .findFirst()
                .orElse(null);
    
        return disciplinas.indexOf(encontrado);
    }
    public void CadastrarAlunoDisciplina (int matricula, int idDisciplina){
           
            int  encontrado = findDisciplinaAluno(ListaAlunos.get(findAluno(matricula)), ListaDisciplinas.get(idDisciplina).getNomeDisciplina());
            if(encontrado == -1){
                if(idDisciplina < ListaDisciplinas.size()){
                    ListaDisciplinas.get(idDisciplina).inserirAluno(ListaAlunos.get(findAluno(matricula))); // adiciona aluno na lista de alunos da disciplina
                    Notas discipli = new Notas(ListaDisciplinas.get(idDisciplina).getNomeDisciplina(), ListaAlunos.get(findAluno(matricula)).getNomeAluno());
                    ListaAlunos.get(findAluno(matricula)).setBoletim(discipli); // adiciona nome da disciplina noboletim do aluno
                    System.out.println("Aluno: " + ListaAlunos.get(findAluno(matricula)).getNomeAluno() 
                    + "Matriculado na disciplina: " +  discipli.getDisciplina());
                }else{
                    System.out.println("Essa disciplina não existe");
                }
            }else{
            }
    }

    public void CadastrarAluno(Aluno aluno){
       int cadastrado = findAluno(aluno.getMatriculaAluno());
       if(cadastrado == -1){
            ListaAlunos.add(aluno);
            System.out.println("\nAluno cadastrado com sucesso!");
       }else{
            System.out.println("\nNão foi possível cadastrar aluno, pois ele já se encontra no sistema.");
       }

    }
    public boolean DeletarAluno(Aluno aluno){
        int cadastrado = findAluno(aluno.getMatriculaAluno());
       if(cadastrado != -1){
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
            System.out.println("\nMatrícula: " +  aluno.getMatriculaAluno());
            System.out.println("Nome: " +  aluno.getNomeAluno());
            System.out.println("- Disciplinas: ");
            ArrayList<Notas> disciplina = aluno.getBotelim();
            for(int y = 0; x< disciplina.size(); x++) 
            System.out.println(y + "." +  " " + disciplina.get(y).getDisciplina() + "\n");

        }

    }
    


    public void AtribuirNotaAluno(Aluno aluno, Disciplina disciplina, int nota01, int nota02){
        int indexa = findAluno(aluno.getMatriculaAluno());
        int indexd = findDisciplinaAluno(aluno, disciplina.getNomeDisciplina());

        if(indexa != -1 && indexd != -1){
        ListaAlunos.get(indexa).getBotelim().get(indexd).setNota1(nota01);
        ListaAlunos.get(indexa).getBotelim().get(indexd).setNota2(nota02);
        if(!ListaAlunos.get(indexa).getBotelim().get(indexd).aprovado()){

        System.out.println("Aluno não aprovado");

        System.out.println("Digite nota da prova final: ");
        ListaAlunos.get(indexa).getBotelim().get(indexd).setNotaFinal(leia.nextInt());

        if(ListaAlunos.get(indexa).getBotelim().get(indexd).aprovadoFinal()) System.out.println("Aluno aprovado!");
        else System.out.println("Aluno reprovado");
        }

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
            professor.setid(ListaProfessores.size()+1);
            ListaProfessores.add(professor);

            System.out.println("\nProfessor cadastrado com sucesso!");
            return true;
       }else{
            System.out.println("\nNão foi possível cadastrar professor, pois ele já se encontra no sistema.");
            return false;
       }

    }


    public void CadastrarProfessorDisciplina (int idProfessor, int idDisciplina){
            Disciplina encontrado = ListaDisciplinas.stream().filter(disc -> disc.getNomeProfessor().toUpperCase().trim().equals(ListaProfessores.get(idProfessor).getNomeProf().toUpperCase().trim())).findFirst().orElse(null);

            if(encontrado != null){
                System.out.println("Professor já cadastrado na disciplina: " + 
                encontrado.getNomeDisciplina());
            }else{
                ListaProfessores.get(idProfessor).setDisciplina(ListaDisciplinas.get(idDisciplina));
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
            System.out.println("Nome: " +  prof.getNomeProf());
            System.out.println("Disciplina: " +  prof.getDisciplinaNome() +"\n ------------------");

        }

    }


    // ###############################################################
    // ### Metodos relacionados as Disciplinas


     public int findDisciplina(String nomeDisc ){
        Disciplina encontrado = ListaDisciplinas.stream().filter(disc -> disc.getNomeDisciplina().toUpperCase().trim().equals(nomeDisc.toUpperCase().trim())).findFirst().orElse(null);        
        return ListaDisciplinas.indexOf(encontrado);
    }

     
    public void CadastrarDisciplina(Disciplina disciplina){
        int cadastrado = findDisciplina(disciplina.getNomeDisciplina());
       if(cadastrado == -1){
            ListaDisciplinas.add(disciplina);
            System.out.println("\nDisciplina cadastrada com sucesso!");
       }else{
            System.out.println("\nNão foi possível cadastrar disciplina, pois ela já se encontra no sistema.");
       }
    }

    public void DeletarDisciplina(Disciplina disciplina){
        int cadastrado = findDisciplina(disciplina.getNomeDisciplina());
        if(cadastrado != -1){
            this.ListaDisciplinas.remove(ListaDisciplinas.get(cadastrado));
            System.out.println("\nDisciplina deletada com sucesso!");
        }else{
            System.out.println("\nDisciplina não existe!");
        }
    }

    public void ListarDisciplinas() {
        for (int x = 0; x < this.ListaDisciplinas.size(); x++) {
            Disciplina disc = ListaDisciplinas.get(x);
            System.out.println(x + ". Disciplina: " + disc.getNomeDisciplina());
            
            System.out.println("- Professor: " + disc.getNomeProfessor());
            System.out.println("------------------- ALUNOS ------------------- ");
            ArrayList<Aluno> alunos = disc.getListaAlunos();
            for (int y = 0; y < alunos.size(); y++) {
                    System.out.println(y + " - " + alunos.get(y).getNomeAluno());
            }
            System.out.println("\n");

        }

    }

}
