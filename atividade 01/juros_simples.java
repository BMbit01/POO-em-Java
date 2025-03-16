import java.util.Scanner;
public class juro_simples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor que será emprestado: ");
        float valor_emprestado = scanner.nextFloat();
        System.out.print("Digite a taxa de juros: ");
        float taxa_juros = scanner.nextFloat();
        System.out.print("Quantidade de meses: ");
        int meses = scanner.nextInt();

        float calculo_juro_simples = (valor_emprestado * taxa_juros * meses) / 100;
        float montante = valor_emprestado + calculo_juro_simples;

        System.out.printf("Juro Simples: %.2f\n", calculo_juro_simples);
        System.out.printf("Montante: %.2f", montante);

        scanner.close();
    }
    
}
