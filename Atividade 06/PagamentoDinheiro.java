public class PagamentoDinheiro implements Pagamento {

    @Override
    public void pagar(Usuario usuario, double valor) {
        System.out.println("Pagamento em dinheiro recebido de " + usuario.getNome());
        usuario.setSaldo(usuario.getSaldo() - valor);
    }

    @Override
    public void estornar(Usuario usuario, double valor) {
        System.out.println("Estornando valor em dinheiro para " + usuario.getNome());
        usuario.setSaldo(usuario.getSaldo() + valor);
    }
}

