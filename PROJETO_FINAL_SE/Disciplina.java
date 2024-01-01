import java.util.*;


public class Disciplina {

    private String nomeDisciplina;
    private ArrayList<Aluno> ListaAlunos;
    private Professor Prof;

    /* ALUNOS POSSUEM NOTAS POR DISCIPLINA, UMA BOA OPÇÃO É CRIAR UM MAPEAMENTO ENTRE ALUNO E NOTA EM DISCIPLINAS */
    
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.ListaAlunos = new ArrayList<Aluno>();
        this.Prof = null;


    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public Professor getProfessor(){
        return this.Prof;
    }

    public String getNomeProfessor() {
        try {
            return this.Prof.getNomeProf();
        } catch (NullPointerException e) {
            return "Ainda nao possui um professor responsável.";
        }
    }
    public ArrayList<Aluno> getListaAlunos() {
        if (this.ListaAlunos.size() != 0) {
            return this.ListaAlunos;
        } else {
            Aluno a = new Aluno("Esta disciplina ainda nao possui alunos.", 0);
            ArrayList<Aluno> l = new ArrayList<Aluno>();
            l.add(a);
            return l;
        }
    }

    public Disciplina(String nomeDisciplina, Professor prof) {
        this.nomeDisciplina = nomeDisciplina;
        this.ListaAlunos = new ArrayList<>();

    }

    public boolean inserirProfessor(Professor prof){
        if(this.Prof == null){
            this.Prof = prof;
            return true;
        }
        return false;
    }

    public boolean removerProfessor(){
        this.Prof = null;
        return true;
    }


    public boolean inserirAluno(Aluno aluno){
        ListaAlunos.add(aluno);
        return true;
    }

    public boolean removerAluno(Aluno aluno){
        ListaAlunos.remove(aluno);
        return true;
    }
}
