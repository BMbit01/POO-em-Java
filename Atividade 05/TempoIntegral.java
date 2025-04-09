public class TempoIntegral extends Funcionarios{
    private double salarioTempoIntegral;

    public TempoIntegral(double salarioTempoIntegral) {
        this.salarioTempoIntegral = salarioTempoIntegral;
    }
    
    @Override
    public double calcularSalario() {
        return salarioTempoIntegral;
    }

}
