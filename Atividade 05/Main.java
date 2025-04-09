public class Main {
    public static void main(String[] args) {

        TempoIntegral funcionario_tempointegral = new TempoIntegral(4500);
        System.out.println("Salário do Funcionário de Tempo Integral: R$"+funcionario_tempointegral.calcularSalario());

        MeioPeriodo funcionario_MeioPeriodo = new MeioPeriodo(50, 60);
        System.out.println("Salário do Funcionário de Meio Periodo: R$"+funcionario_MeioPeriodo.calcularSalario());

        Contratados funcionario_contratado = new Contratados(2500);
        System.out.println("Salário do Funcionário Contratado: R$"+funcionario_contratado.calcularSalario());
    }
}
