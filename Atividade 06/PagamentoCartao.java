public class PagamentoCartao implements Pagamento {
    
    @Override
    public void pagar(Usuario usuario, double valor) {
        System.out.println("Processando pagamento via cartão para " + usuario.getNome());
        usuario.setSaldo(usuario.getSaldo() - valor);
    }

    @Override
    public void estornar(Usuario usuario, double valor) {
        System.out.println("Estorando valor via cartão para " + usuario.getNome());
        usuario.setSaldo(usuario.getSaldo() + valor);
    }
}
