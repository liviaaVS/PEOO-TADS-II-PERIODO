public class Notas {

    private String disciplina;
    private String nomeAluno;
    private int nota1;
    private int nota2;
    private int notaFinal;

    public Notas(String disciplina, String nomeAluno) {
        this.disciplina = disciplina;
        this.nomeAluno = nomeAluno;
        this.nota1 = 0;
        this.nota2 = 0;
        this.notaFinal = 0;
    }



    public int getMediaSimples(){
        return ((this.nota1 * 2) + (this.nota2 * 3)) / 5;
    }

    public int getMediaFinal(){
        return (getMediaSimples() +  getNotaFinal()) / 2;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getNota1() {
        return nota1;
    }
    public void setNota1(int nota1){
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public boolean aprovadoFinal() {
        return getMediaFinal() >= 60;
    }
    
    public boolean aprovado() {
        return  getMediaSimples() >= 60;
    }
    
     public int getNotaFinal(){
        if(!aprovado()){
            return this.notaFinal;
        }
        else{
            return 0;
        }
    }
    
    public boolean setNotaFinal(int notaFinal){
        if(!aprovado()){
            this.notaFinal = notaFinal;
            return true;
        }
        else{
            return false;
        }
    }
    
}