//Subclasse Caminhão
public class Caminhao extends Veiculo{
    //Atributos
    protected double cargaMaximaKg;
    protected int qtdEixos;
    protected double cargaAtual;

    //Construtor
    public Caminhao(String marca, String modelo, String cor, int ano, double cargaMaxima, int qtdEixos, double cargaAtual) {
        super(marca, modelo, cor, ano);
        this.cargaMaximaKg = cargaMaxima;
        this.qtdEixos = qtdEixos;
        this.cargaAtual = 0;
    }

    //Métodos
    public void colocarCarga(double pesoCarga) {
        if (cargaAtual + pesoCarga <= cargaMaximaKg) {
            cargaAtual += pesoCarga;
            System.out.println("Carga adicionada com sucesso. Carga atual: " + cargaAtual + " Kg.");
        } else {
            System.out.println("A carga excede o limite de capacidade!");
        }
    }

    public void descarregarCarga(double pesoDescarga) {
        if (pesoDescarga <= cargaAtual) {
            cargaAtual -= pesoDescarga;
            System.out.println("Descarga de " + pesoDescarga + " kg realizada com sucesso. Carga atual: " + cargaAtual + " Kg.");
        } else {
            System.out.println("Peso da descarga é maior que a carga atual!");
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Carga Máxima Suportada em Kg: " +cargaMaximaKg);
        System.out.println("Quantidade de Eixos: " +qtdEixos);
        System.out.println("Carga Atual em Kg: " +cargaAtual);
    }
}
