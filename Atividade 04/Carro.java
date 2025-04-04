//Subclasse Carro
public class Carro extends Veiculo{
    //Atributos
    private String cambio; //Manual ou Automático
    private String tracao; //Dianteira, traseira ou integral
    protected String placa;
    protected int capacidadePassageiros;
    protected int qtdPassageirosAtual;
    
    //Construtor
    public Carro(String marca, String modelo, String cor, int ano, String cambio, String tracao, String placa, int capacidadePassageiros, int qtdPassageiros) {
        super(marca, modelo, cor, ano);
        this.cambio = cambio;
        this.tracao = tracao;
        this.placa = placa;
        this.capacidadePassageiros = capacidadePassageiros;
        this.qtdPassageirosAtual = qtdPassageiros;
    }

    //Métodos
    public void ligarArcondicionado() {
        System.out.println(super.modelo + " está com o Ar Condicionado ligado!");
    }

    public void desligarArcondicionado() {
        System.out.println(super.modelo + " está com o Ar Condicionado desligado!");
    }

    public void alocarPassageiros(int alocarPassageiros) {
        if (qtdPassageirosAtual + alocarPassageiros <= capacidadePassageiros) {
            qtdPassageirosAtual += alocarPassageiros;
            System.out.println("Foram alocados mais passageiros! Quantidade Atual: " +qtdPassageirosAtual);
        } else {
            System.out.println("Erro! A quantidade de Passageiros alocados é maior que a capacidade do " + super.modelo);
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Câmbio: " +cambio);
        System.out.println("Tração: " +tracao);
        System.out.println("Placa: " +placa);
        System.out.println("Quantidade de Passageiros Suportados: " +capacidadePassageiros);
        System.out.println("Quantidade de Passageiros no Veículos: " +qtdPassageirosAtual);
    }
}
