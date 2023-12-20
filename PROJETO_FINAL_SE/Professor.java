public class Professor {

    private String nome;
    private Disciplina disciplina;
    private int id;

    public Professor(String nome){
        this.nome = nome;
        this.disciplina = null;
    }



    public String getNomeProf(){
        return this.nome;
    }
    public void setid(int id){
        this.id = id;
    }


     public int getIdProf(){
        return this.id;
    }
    public Disciplina getDisciplina() {
            return this.disciplina;

    }
    public String getDisciplinaNome() {
        try {
            return this.disciplina.getNomeDisciplina();
        } catch (Exception e) {
          return "Ainda nao é responsável por uma disciplina.";
        }

    }


    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
}
