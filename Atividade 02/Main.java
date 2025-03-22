import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite o seu Salário Bruto: R$");
        double GrossSalary = scanner.nextDouble();

        System.out.print("Digite o valor do imposto que será pago: R$");
        double Tax = scanner.nextDouble();

        Employee funcionario = new Employee(name, GrossSalary, Tax);
        funcionario.exibir_InfoGeral();

        System.out.print("\nDigite a porcentagem de aumento salarial: ");
        double percentage = scanner.nextDouble();
        funcionario.IncreaseSalary(percentage);
        funcionario.exibir_aposAumento();

        scanner.close();

    }
}
