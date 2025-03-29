public class EstoqueProduto {
    private String descricao;
    private int quantidade;
    private double valor;

    public void cadastrar(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescriocao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor += valor;
    }

    public void removerQuantidade(int quantidade) {
        if(quantidade < this.quantidade) {
            this.quantidade -= quantidade;
        }else {
            System.out.println("Erro! A quantidade de produtos que você quer remover é maior que a quantidade de produtos em estoque");
        }
    }

    public void exibirEstoque() {
        System.out.println("Nome: " +descricao);
        System.out.println("Quantidade: " +quantidade);
        System.out.println("Valor: R$" +valor);
    }

}
