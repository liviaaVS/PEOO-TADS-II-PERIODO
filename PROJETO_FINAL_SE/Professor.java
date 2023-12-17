public class Professor {

    private String nome;
    private Disciplina disciplina;
    private int id;

    public Professor(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNomeProf(){
        return this.nome;
    }
     public int getIdProf(){
        return this.id;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
}
