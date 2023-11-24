package src.QUESTAO02;

public class Disciplina {
    private int[] notas = new int[4];
    private boolean aprovado =  false;
    private double mediaP = 0.0;
    private double mediaF = 0.0;
    private int notapf = 0;
    public boolean aprovado(double media){
        this.aprovado = media>=60;
        return media>=60;
    }
    public void construtor(double nota, int posicao){
        this.notas[posicao] = (int) nota;
    }
  
    public void SetMediaF(int notapf){
        this.notapf =  notapf;
        this.mediaF = (this.mediaP + this.notapf)/2;
    }
    public void SetMediaP(){
        this.mediaP = (this.notas[0]*2 + this.notas[1]*3)/5;
    }

    public double GetMediaP(){
        return this.mediaP;
    }
    public double GetMediaF(){
        return this.mediaF;
    }
    public String toString(){
        return "Nota 1: "+ this.notas[0] + " | Nota 2: " + this.notas[1] + "\nMedia Parcial: " + this.mediaP + "\nMedia Final: " +this.mediaF + "\nAprovado: " + aprovado;
    }
}
