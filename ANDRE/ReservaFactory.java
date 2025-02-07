package ANDRE;

public interface ReservaFactory {
    public abstract void criarQuarto();
    public abstract void criarProcessoReserva(int numQuarto);
    public abstract void criarPagamento();
}