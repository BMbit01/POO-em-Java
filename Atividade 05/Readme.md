# Brenno Mendes Sousa

## Disciplina: Programação Orientada a Objetos e Java(POO)

### 📚 Atividade 05 – Polimorfismo

---

## 📄 Descrição da Atividade

Esta atividade tem como objetivo aplicar os conceitos de **polimorfismo** em Java. Foram criadas diferentes classes para representar tipos distintos de funcionários, onde cada tipo possui uma forma específica de cálculo de salário. Utiliza-se uma classe base para generalizar o comportamento, e as subclasses sobrescrevem o método para fornecer uma implementação personalizada.

---

## 📌 Conteúdo Estudado

- Polimorfismo

---

## 🛠️ Funcionamento do Código

O sistema simula o cálculo de salário para três tipos diferentes de funcionários:

### 1. `Funcionarios` (Classe Base)
- Classe genérica com o método `calcularSalario()` que retorna `0.0`.
- Serve como base para as demais classes.

### 2. `TempoIntegral` (Herda de `Funcionarios`)
- Possui um atributo `salarioTempoIntegral`.
- O método `calcularSalario()` retorna diretamente esse valor.

### 3. `MeioPeriodo` (Herda de `Funcionarios`)
- Possui atributos `salarioPorHora` e `valorHoraTrabalhada`.
- O salário é calculado multiplicando as horas trabalhadas pelo valor por hora.

### 4. `Contratados` (Herda de `Funcionarios`)
- Possui o atributo `valorServico`.
- O salário é fixo e baseado no valor do serviço prestado.

---

## 🧪 Exemplo de Saída

```bash
Salário do Funcionário de Tempo Integral: R$4500.0
Salário do Funcionário de Meio Periodo: R$3000.0
Salário do Funcionário Contratado: R$2500.0
