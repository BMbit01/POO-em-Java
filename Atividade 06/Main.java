public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Brenno", 234236723, "3765-0", 1000.0);

        Pagamento pagamento;

        pagamento = new PagamentoCartao();
        pagamento.pagar(usuario, 100.0);

        pagamento = new PagamentoPix();
        pagamento.pagar(usuario, 200.0);

        pagamento = new PagamentoDinheiro();
        pagamento.estornar(usuario, 50.0);

        System.out.println("Saldo final: R$" + usuario.getSaldo());
    }
}
