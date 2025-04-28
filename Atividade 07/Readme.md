# Gerenciador de Contatos

## Disciplina: Programação Orientada a Objetos em Java (POO)

### 📚 Atividade – Agrupamento de Objetos

Este projeto em Java simula um **gerenciador de contatos**, utilizando **Mapas** (`HashMap`) para armazenar informações como nome, telefone e e-mail dos contatos.  
O objetivo é praticar conceitos de **programação orientada a objetos**, **armazenamento em coleção** e **acesso eficiente a objetos agrupados**.

## 📄 Descrição dos Arquivos

- **Contato.java**  
  Classe que representa um contato, com atributos: `nome`, `telefone` e `email`.  
  Contém também o método `toString()` para exibir os dados de forma formatada.

- **Principal.java**  
  Classe principal que permite:
  - Adicionar contatos
  - Listar todos os contatos
  - Buscar um contato pelo nome
  - Remover um contato existente
  - Sair do programa

## 🧪 Exemplo de Saída

```bash
--- Menu ---
1. Adicionar Contato
2. Listar Contatos
3. Buscar Contato por Nome
4. Remover Contato
0. Sair
Escolha uma opção: 1
Nome: João
Telefone: 99999-1111
Email: joao@email.com
Contato adicionado com sucesso!

--- Lista de Contatos ---
Nome: João, Telefone: 99999-1111, Email: joao@email.com

Escolha uma opção: 3
Digite o nome para buscar: João
Contato encontrado:
Nome: João, Telefone: 99999-1111, Email: joao@email.com

Escolha uma opção: 4
Digite o nome do contato para remover: João
Contato removido com sucesso!
