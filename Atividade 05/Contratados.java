public class Contratados extends Funcionarios{
    private double valorServico;

    public Contratados(double valorServico) {
        this.valorServico = valorServico;
    }

    @Override
    public double calcularSalario() {
        return valorServico;
    }
}
