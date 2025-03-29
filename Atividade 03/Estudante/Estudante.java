public class Estudante {
    //Atributos privados
    private String nome;
    private String cpf;
    private String curso;
    private int idade;

    public void cadastrar(String nome, String cpf, String curso, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        setIdade(idade);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 100) {
            this.idade = idade;
        }else {
            System.out.println("Idade Inválida!");
        }
    }

    //Exibir os dados de Cadastro
    public void exibirCadastro() {
    System.out.println("Nome: "+ nome);
    System.out.println("cpf: "+ cpf);
    System.out.println("Curso: "+ curso);
    System.out.println("Idade: "+ idade);
    }

}
