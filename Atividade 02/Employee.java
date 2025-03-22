public class Employee {
    
    private String name;
    private double GrossSalary;
    private double Tax;

    public Employee(String name, double GrossSalary, double Tax) {
        this.name = name;
        this.GrossSalary = GrossSalary;
        this.Tax = Tax;
    }

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage) {
        double aumento = (percentage / 100) * GrossSalary;
        this.GrossSalary += aumento;
    }

    public void exibir_InfoGeral() {
        System.out.print("--------------------------\n");
        System.out.println("Nome: " + name);
        System.out.println("Salário Bruto: R$" + GrossSalary);
        System.out.println("Imposto: " + Tax);
        System.out.print("--------------------------\n");
        System.out.printf("Funcionário: %s, R$%.2f", name, NetSalary());
    }

    public void exibir_aposAumento() {
        System.out.print("--------------------------\n");
        System.out.printf("Após aumento salarial: %s, R$%.2f", name, NetSalary());

    }
}
