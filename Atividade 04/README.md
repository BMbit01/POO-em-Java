# Brenno Mendes Sousa

## 📚 Disciplina: Programação Orientada a Objetos em Java (POO)

### 🧠 Assunto Estudado:
- **Herança**

---

## 🚗 Projeto: Sistema de Veículos

Este projeto foi desenvolvido como parte dos estudos da disciplina de **Programação Orientada a Objetos em java (POO)**, com o objetivo de aplicar os conceitos de **herança** utilizando a linguagem Java.

---

## 🔍 Sobre o Código

O sistema simula o comportamento de diferentes tipos de veículos utilizando uma estrutura orientada a objetos. A classe `Veiculo` é a **superclasse (classe pai)**, e dela derivam as subclasses: `Carro`, `Caminhao` e `Bicicleta`.

### 🧩 Estrutura de Classes:

#### `Veiculo.java`
Classe base com atributos comuns a todos os veículos como `marca`, `modelo`, `cor`, `ano`, `estadoVeiculo` e `velocidadeAtual`. Também possui métodos como:
- `ligar()` e `desligar()`
- `acelerar()` e `desacelerar()`
- `frear()`
- `exibirInfo()`

#### `Carro.java`
Subclasse que herda de `Veiculo` e adiciona:
- Atributos específicos como `cambio`, `tracao`, `placa`, `capacidadePassageiros`
- Métodos como `ligarArcondicionado()`, `alocarPassageiros()` e sobrescreve `exibirInfo()`

#### `Caminhao.java`
Subclasse que representa um caminhão com:
- Atributos como `cargaMaximaKg`, `qtdEixos`, `cargaAtual`
- Métodos para `colocarCarga()` e `descarregarCarga()`, além de sobrescrever `exibirInfo()`

#### `Bicicleta.java`
Subclasse que representa uma bicicleta, com:
- Atributos como `tipoBicicleta` e `aro`
- Métodos como `pedalar()`, `pararPedalar()`, `tocarCampainha()` e `guardarBicicleta()`

#### `Main.java`
Classe principal que instancia objetos de cada tipo de veículo, demonstra o uso de seus métodos e exibe suas informações por meio de chamadas a `exibirInfo()` e outras ações específicas.
