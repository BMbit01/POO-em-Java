// Classe PAI
public class Veiculo {
    //Atributos
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int ano;
    protected boolean estadoVeiculo; //False: Desligado - True: Ligado
    protected double velocidadeAtual;

    //Construtor
    public Veiculo(String marca, String modelo, String cor, int ano) {;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.estadoVeiculo = false; //Inicia desligado
        this.velocidadeAtual = 0; //Inicia parado
    }

    //Métodos
    public void ligar() {
        estadoVeiculo = true;
        System.out.println(modelo + " está ligado!");
    }

    public void desligar() {
        estadoVeiculo = false;
        System.out.println(modelo + " está desligado!");
    }

    public void acelerar(double acelerar) {
        velocidadeAtual += acelerar;
        System.out.println(modelo + " acelerou para " + velocidadeAtual + "Km/h");
    }

    public void desacelerar(double desacelerar) {
        velocidadeAtual -= desacelerar;
        System.out.println(modelo + " desacelerou para " + velocidadeAtual + "Km/h");
    }

    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual = 0;
            System.out.println(modelo + " parou.");
        }else {
            System.out.println(modelo + "já está parado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Cor: " +cor);
        System.out.println("Ano do Modelo: " +ano);
        
    }

}
