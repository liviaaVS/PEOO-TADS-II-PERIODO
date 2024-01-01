import java.util.*;
import java.util.stream.IntStream;




public class SistemaEscolar{
    Scanner scanner = new Scanner(System.in);
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

   
    public void GerarBoletim(int matricula) {
        int idAluno = findAluno(matricula);
        Aluno aluno = ListaAlunos.get(idAluno);
    
        System.out.println("+----------------------+-----------------------------------------------------------+");
        System.out.println("|      Nome Aluno:       |      ->     " + aluno.getNomeAluno() + "|  Matrícula:     ->   " +  aluno.getMatriculaAluno());
        System.out.println("+----------------------+---------------------------+----------------+--------------+");
    
        ArrayList<Notas> notas = aluno.getBotelim();
    
        for (int x = 0; x < notas.size(); x++) {
            System.out.println("+--------------------+---------------------------------------------------------+");
            System.out.println("|      Disciplina      |       ->         " + notas.get(x).getDisciplina());
            System.out.println("+--------------------+---------------------------------------------------------+");
            System.out.println("| Nota 01: " + notas.get(x).getNota1() + "   Nota 02: " + notas.get(x).getNota2());
            System.out.println("| Nota Final: " + notas.get(x).getNotaFinal());
            System.out.println("| Média Final: " + notas.get(x).getMediaFinal());
            System.out.println("| Média Simples: " + notas.get(x).getMediaSimples());
            System.out.println("+------------------------------------------------------------------------------+");
            System.out.println();

        }
    }
    
    // ###############################################################
    // ### Metodos relacionados aos alunos

    public int findAluno(int matricula){
        Aluno encontrado = ListaAlunos.stream().filter(a -> a.getMatriculaAluno() == matricula).findFirst().orElse(null);        
        return ListaAlunos.indexOf(encontrado);
    }

    public int findDisciplinaAluno(Aluno aluno, String disciplina) {
        ArrayList<Notas> disciplinas = aluno.getBotelim();

        for(int x=0; x < disciplinas.size();x++){
            if(disciplinas.get(x).getDisciplina().toUpperCase().trim().equals(disciplina.toUpperCase().trim())){
                return x;
            }
            System.out.println(disciplina.toUpperCase().trim() + " " + disciplinas.get(x).getDisciplina().toUpperCase().trim());
        }
        return -1;
    }

    public void CadastrarAlunoDisciplina (int matricula, int idDisciplina){
           
            int  encontrado = findDisciplinaAluno(ListaAlunos.get(findAluno(matricula)), ListaDisciplinas.get(idDisciplina).getNomeDisciplina());
            if(encontrado == -1){
                if(idDisciplina < ListaDisciplinas.size()){
                    ListaDisciplinas.get(idDisciplina).inserirAluno(ListaAlunos.get(findAluno(matricula))); // adiciona aluno na lista de alunos da disciplina
                    Notas discipli = new Notas(ListaDisciplinas.get(idDisciplina).getNomeDisciplina(), ListaAlunos.get(findAluno(matricula)).getNomeAluno());
                    ListaAlunos.get(findAluno(matricula)).setBoletim(discipli); // adiciona nome da disciplina noboletim do aluno
                    System.out.println("Aluno: " + ListaAlunos.get(findAluno(matricula)).getNomeAluno() 
                    + " Matriculado na disciplina: " +  discipli.getDisciplina());
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
    public List<Aluno> getListadeAlunos(){
        return this.ListaAlunos;
    }
    public void ListarAlunos() {
        System.out.println("Listagem de Alunos:\n");
    
        for (int x = 0; x < this.ListaAlunos.size(); x++) {
            Aluno aluno = ListaAlunos.get(x);
            System.out.println("Id: " + (x+1));
            System.out.println("Matrícula: " + aluno.getMatriculaAluno());
            System.out.println("Nome: " + aluno.getNomeAluno());
            
            System.out.println("- Disciplinas:");
            ArrayList<Notas> disciplinas = aluno.getBotelim();
            for (int y = 0; y < disciplinas.size(); y++) {
                System.out.println((y+1) + ". " + disciplinas.get(y).getDisciplina());
            }
    
            System.out.println(); // Linha em branco para separar os alunos
        }
    }
    
    


    public void AtribuirNotaAluno(int id_aluno, int disciplina, int nota01, int nota02) {
        Aluno aluno = ListaAlunos.get(id_aluno);
        int indexa = findAluno(aluno.getMatriculaAluno());

        if (indexa != -1 && disciplina < aluno.getBotelim().size()) {
            Notas disciplinaAtual = ListaAlunos.get(indexa).getBotelim().get(disciplina);
            disciplinaAtual.setNota1(nota01);
            disciplinaAtual.setNota2(nota02);

            System.out.println(disciplinaAtual.getNota1() + " " + disciplinaAtual.getNota2());

            if (disciplinaAtual.aprovado()) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno não aprovado");

                System.out.println("Digite nota da prova final: ");
                int notaf = scanner.nextInt();
                disciplinaAtual.setNotaFinal(notaf);

                if (disciplinaAtual.aprovadoFinal()) {
                    System.out.println("Aluno aprovado na prova final!");
                } else {
                    System.out.println("Aluno reprovado");
                }
            }
        } else {
            System.out.println("Aluno ou disciplina inválida");
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
    public void RemoverProfessorDisciplina (int idProfessor, int idDisciplina){
            Disciplina encontrado = ListaDisciplinas.stream().filter(disc -> disc.getNomeProfessor().toUpperCase().trim().equals(ListaProfessores.get(idProfessor).getNomeProf().toUpperCase().trim())).findFirst().orElse(null);

            if(encontrado != null){
                System.out.println("Professor já cadastrado na disciplina: " + 
                encontrado.getNomeDisciplina());
                ListaDisciplinas.get(idDisciplina).removerProfessor();
                ListaProfessores.get(idProfessor).removerDisciplina();

            }else{
                System.out.println("Professor não está cadastrado nessa disciplina: "); 
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
            System.out.println((x+1) + ". Disciplina: " + disc.getNomeDisciplina());
            
            System.out.println("- Professor: " + disc.getNomeProfessor());
            System.out.println("------------------- ALUNOS ------------------- ");
            ArrayList<Aluno> alunos = disc.getListaAlunos();
            for (int y = 0; y < alunos.size(); y++) {
                    System.out.println((y+1) + " - " + alunos.get(y).getNomeAluno());
            }
            System.out.println("\n");

        }

    }
    public void ListarDisciplinasAluno(int id_aluno) {
        Aluno aluno = this.ListaAlunos.get(id_aluno);
        for (int x = 0; x < aluno.getBotelim().size(); x++) {
            Notas notas = aluno.getBotelim().get(x);
            System.out.println(x + ". Disciplina: " + notas.getDisciplina());
            System.out.println("Nota 01: " +  notas.getNota1() );
            System.out.println("Nota 02: " + notas.getNota2());
            System.out.println("Nota Final: " + notas.getNotaFinal());

            if((notas.getNota1()*2 + notas.getNota2()*3)/5 >= 60){
                
                System.out.println("Media Simples: " + (notas.getNota1()*2 + notas.getNota2()*3)/5);
            
            }else{
            
                System.out.println("Media Simples: " + notas.getMediaSimples());
                System.out.println("Media Final: " +notas.getMediaFinal());

            }

        }

    }

}
