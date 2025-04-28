import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Contato> contatos = new HashMap<>();

        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Buscar Contato por Nome");
            System.out.println("4. Remover Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    
                    contatos.put(nome, new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Contatos ---");
                    for (HashMap.Entry<String, Contato> entry : contatos.entrySet()) {
                        System.out.println(entry.getValue());
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Contato contatoEncontrado = contatos.get(nomeBusca);

                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado:");
                        System.out.println(contatoEncontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (contatos.remove(nomeRemover) != null) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}

