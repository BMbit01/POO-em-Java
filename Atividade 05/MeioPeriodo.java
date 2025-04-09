public class MeioPeriodo extends Funcionarios{
    private double salarioPorHora;
    private double valorHoraTrabalhada;

    public MeioPeriodo(double salarioPorHora, double valorHoraTrabalhada) {
        this.salarioPorHora = salarioPorHora;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * valorHoraTrabalhada;
    }
}
