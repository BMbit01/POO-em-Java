public class Main {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.cadastrar("Brenno Mendes Sousa", "52345237", "Sistemas de Informação", 19);
        System.out.println("------------------------");
        System.out.println("Aluno 1 - Dados:");
        aluno1.exibirCadastro();
        System.out.println("------------------------");

        Estudante aluno2 = new Estudante();
        aluno2.cadastrar("Kaio", "4324423423", "Sistemas de Informação", 20);
        System.out.println("Aluno 2 - Dados:");
        aluno2.exibirCadastro();
    }
}
