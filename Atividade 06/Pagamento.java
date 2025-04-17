public interface Pagamento {
    void pagar(Usuario usuario, double valor);
    void estornar(Usuario usuario, double valor);
}
