package ANDRE;

import java.util.ArrayList;

public class ReservaFactoryNatal implements ReservaFactory {
    public ArrayList<QuartoSimples> listaQuartos;

    public ReservaFactoryNatal() {
        listaQuartos = new ArrayList<QuartoSimples>();
    }

    @Override
    public void criarQuarto() {
        QuartoSimples quarto = new QuartoSimples(1, 1, 100.0, "Quarto simples de Natal, com cama de casal e banheiro privativo");
        listaQuartos.add(quarto);
        System.out.println("Quarto de Natal criado");
    }

    @Override
    public void criarProcessoReserva(int numQuarto) {
        for (int x = 0; x < listaQuartos.size(); x++) {
           if(listaQuartos.get(x).numero == numQuarto){
                if(listaQuartos.get(x).reservado){
                    System.err.println("Quarto de numero" + numQuarto + "já está reservado");
                    break;
                }
               listaQuartos.get(x).reservado = true;
               System.err.println("Quarto de numero" + numQuarto + "reservado com sucesso");
               break;
           }
        }
    }

    @Override
    public void criarPagamento() {
       
    }
}