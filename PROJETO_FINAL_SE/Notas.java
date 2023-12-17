public class Notas {

    private String disciplina;
    private String nomeAluno;
    private int nota1;
    private int nota2;
    private int notaFinal;

    public Notas(String disciplina, String nomeAluno) {
        this.disciplina = disciplina;
        this.nomeAluno = nomeAluno;
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
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    private boolean aprovado(){ /* Metodo que verifica se o aluno foi aprovado */
        if (getNota1()*2 + getNota2()*3 / 5 < 6.0){
            return false;
        }
        return true;
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
   

    public int getNotaFinal(){
        if(!aprovado()){
            return this.notaFinal;
        }
        else{
            return 0;
        }
    }
    
}