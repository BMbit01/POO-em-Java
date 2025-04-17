public class PagamentoPix implements Pagamento {

    @Override
    public void pagar(Usuario usuario, double valor) {
        System.out.println("Processando pagamento via PIX para " + usuario.getNome());
        usuario.setSaldo(usuario.getSaldo() - valor);
    }

    @Override
    public void estornar(Usuario usuario, double valor) {
        System.out.println("Estornando valor via PIX para " + usuario.getNome());
        usuario.setSaldo(usuario.getSaldo() + valor);
    }
}
