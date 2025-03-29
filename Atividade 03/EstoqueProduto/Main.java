public class Main {
    public static void main(String[] args) {
        EstoqueProduto produto_1 = new EstoqueProduto();
        System.out.println("----------------------");
        produto_1.cadastrar("Shampoo", 50, 457);
        produto_1.exibirEstoque();

        EstoqueProduto produto_2 = new EstoqueProduto();
        System.out.println("----------------------");
        produto_2.cadastrar("Pasta Dental", 100, 500);
        produto_2.removerQuantidade(20);
        produto_2.setQuantidade(30);
        produto_2.setValor(500);
        produto_2.exibirEstoque();

        EstoqueProduto testeErroQuantidade_produto3 = new EstoqueProduto();
        System.out.println("----------------------");
        testeErroQuantidade_produto3.cadastrar("Sabonete", 20, 240);
        testeErroQuantidade_produto3.removerQuantidade(30);
        testeErroQuantidade_produto3.exibirEstoque();


        
        
    }
}
