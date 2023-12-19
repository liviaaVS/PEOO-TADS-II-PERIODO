public class Professor {

    private String nome;
    private Disciplina disciplina;
    private int id;

    public Professor(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.disciplina = null;
    }

    public String getNomeProf(){
        return this.nome;
    }
     public int getIdProf(){
        return this.id;
    }
    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
}
