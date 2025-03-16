import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu peso em Kg: ");
    float peso = scanner.nextFloat();
    System.out.print("Digite sua altura: ");
    float altura = scanner.nextFloat();

    float IMC = peso / (altura * altura);

    if (IMC < 18.5) {
        System.out.print("Abaixo do Peso");
    } else if (IMC < 25) {
        System.out.print("Peso Normal");
    } else if (IMC < 30) {
        System.out.print("Sobrepeso");
    } else if (IMC < 35) {
        System.out.print("Obesidade Grau I");
    } else if (IMC < 40) {
        System.out.print("Obesidade Grau II");
    } else {
        System.out.print("Obesidade Grau III");
    }
    scanner.close();
}
}
