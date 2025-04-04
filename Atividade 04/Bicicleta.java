//Subclasse Bicicleta
public class Bicicleta extends Veiculo{
    //Atributos
    protected String tipoBicicleta;
    protected int aro;

    //Construtor
    public Bicicleta(String marca, String modelo, String cor, int ano, String tipoBicicleta, int aro) {
        super(marca, modelo, cor, ano);
        this.tipoBicicleta = tipoBicicleta;
        this.aro = aro;
    }

    //Métodos
    public void pedalar() {
        System.out.println("Você começou a pedalar!");
    }

    public void pararPedalar() {
        System.out.println("Você parou de pedalar!");
    }

    public void descerDaBicicleta() {
        System.out.println("Você desceu da Bicicleta!");
    }

    public void guardarBicicleta() {
        System.out.println("Você guardou a Bicicleta!");
    }

    public void tocarCampainha() {
        System.out.println(modelo + " tocou a campainha!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de Bicicleta: " +tipoBicicleta);
        System.out.println("Aro da Bicicleta: " +aro);
    }
}
