import java.util.*;


public class Disciplina {

    private String nomeDisciplina;
    private List<Aluno> ListaAlunos;
    private Professor Prof;

    /* ALUNOS POSSUEM NOTAS POR DISCIPLINA, UMA BOA OPÇÃO É CRIAR UM MAPEAMENTO ENTRE ALUNO E NOTA EM DISCIPLINAS */
    
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.ListaAlunos = new ArrayList<>();

    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
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
