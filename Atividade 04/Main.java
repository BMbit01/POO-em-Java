public class Main {
    public static void main(String[] args) {
        
        //Subclasse Carro
        Carro carro = new Carro("Fiat", "Uno", "Vermelho", 2008, "Manual", "Traseira", "5234IU", 4, 2);
        System.out.println("------------------------------");
        System.out.println("INFORMAÇÕES DO CARRO:");
        carro.exibirInfo();
        System.out.println("\nATIVIDADES:");
        carro.alocarPassageiros(2);
        carro.ligar();
        carro.ligarArcondicionado();
        carro.acelerar(50);
        carro.desacelerar(20);
        carro.frear();
        carro.desligarArcondicionado();
        carro.desligar();

        //Subclasse Caminhão
        Caminhao caminhao = new Caminhao("Volvo", "FH 540", "Branco", 2022, 50000, 4, 0);
        System.out.println("------------------------------");
        System.out.println("INFORMAÇÕES DO CAMINHÃO:");
        caminhao.exibirInfo();
        System.out.println("\nATIVIDADES:");
        caminhao.colocarCarga(20000);;
        caminhao.ligar();
        caminhao.acelerar(100);
        caminhao.desacelerar(30);
        caminhao.frear();
        caminhao.descarregarCarga(10000);
        caminhao.desligar();

        //Subclasse Bicicleta
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite Carbon", "Vermelha", 2025, "Moutain Bike", 29);
        System.out.println("------------------------------");
        System.out.println("INFORMAÇÕES DA BICICLETA:");
        bicicleta.exibirInfo();
        System.out.println("\nATIVIDADES:");
        bicicleta.tocarCampainha();
        bicicleta.pedalar();
        bicicleta.acelerar(25);
        bicicleta.tocarCampainha();
        bicicleta.desacelerar(5);
        bicicleta.pararPedalar();
        bicicleta.descerDaBicicleta();
        bicicleta.guardarBicicleta();
    }
}
