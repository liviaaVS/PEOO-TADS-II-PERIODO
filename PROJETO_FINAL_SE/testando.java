

public class testando {
    public static void main(String[] args) {
        SistemaEscolar se = new SistemaEscolar();

        Disciplina disc1 = new Disciplina("Algoritmos");
        se.CadastrarDisciplina(disc1);
        Disciplina disc2 = new Disciplina("PEOO");
        se.CadastrarDisciplina(disc2);
        Disciplina disc3 = new Disciplina("Arquitetura de PC");
        se.CadastrarDisciplina(disc3);

        Aluno aluno1 = new Aluno("Livia", 40029);
        se.CadastrarAluno(aluno1);
        Aluno aluno2 = new Aluno("Ryan", 45885);
        se.CadastrarAluno(aluno2);
        Aluno aluno3 = new Aluno("Outra pessoa", 7896);
        se.CadastrarAluno(aluno3);
        se.CadastrarAluno(aluno1); //tentar cadastrar aluno  ja cadastrado
        se.CadastrarAlunoDisciplina(45885, 1);
        se.AtribuirNotaAluno(2, 1, 6, 7);
        se.GerarBoletim(45885);
    }
}
