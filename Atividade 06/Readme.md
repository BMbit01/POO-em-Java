# Brenno Mendes Sousa

## Disciplina: Programação Orientada a Objetos em Java(POO)

### 📚 Atividade 066 – Abstração

# 💳 Sistema de Pagamentos em Java

Este projeto em Java simula um sistema de pagamentos com múltiplas formas de pagamento: Cartão, Dinheiro e PIX. Ele demonstra os conceitos de **programação orientada a objetos**, **interfaces** e **polimorfismo**.

## 📄 Descrição dos Arquivos

- **Usuario.java**  
  Representa o usuário que realiza os pagamentos, com atributos como nome, número da conta, agência e saldo.

- **Pagamento.java**  
  Interface que define os métodos `pagar` e `estornar`, obrigatórios para todas as formas de pagamento.

- **PagamentoCartao.java**  
  Implementa a interface `Pagamento` para simular pagamentos via cartão.

- **PagamentoDinheiro.java**  
  Implementa a interface `Pagamento` para simular pagamentos em dinheiro.

- **PagamentoPix.java**  
  Implementa a interface `Pagamento` para simular pagamentos via PIX.

- **Main.java**  
  Classe principal que cria um objeto `Usuario` e realiza diferentes tipos de pagamentos e estornos.


## 🧪 Exemplo de Saída

```bash
Processando pagamento via cartão para Brenno
Processando pagamento via PIX para Brenno
Estornando valor em dinheiro para Brenno
Saldo final: R$750.0

