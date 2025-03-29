public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Uno", "Fiat", "Vermelho");
        carro1.infoCarro();
        
        System.out.println("-----------------");
        carro1.setModelo("Civic");
        carro1.setMarca("Honda");
        carro1.setCor("Branco");
        carro1.infoCarro();
    }
}
