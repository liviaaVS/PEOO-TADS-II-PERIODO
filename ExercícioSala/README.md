# Sistema de Gerenciamento - Atividade

## Questão 1 - Formas Geométricas

### Diagrama de Classe

```mermaid
classDiagram
  class Forma {
    +CalcularArea(): double
    +CalcularPerimetro(): double
  }

  class Circulo {
    -raio: double
    +Circulo(raio: double)
    +CalcularArea(): double
    +CalcularPerimetro(): double
  }

  class Retangulo {
    -base: double
    -altura: double
    +Retangulo(base: double, altura: double)
    +CalcularArea(): double
    +CalcularPerimetro(): double
  }

  Forma <|-- Circulo
  Forma <|-- Retangulo
```

### Exemplo de Uso

```java
Scanner leia = new Scanner(System.in);
System.out.println("Digite o raio do círculo: ");
double value = leia.nextDouble();

Circulo c1 = new Circulo(value);
c1.CalcularPerimetro();

System.out.println("Área do círculo: " + c1.CalcularArea() + "\nPerímetro do círculo: " + c1.CalcularPerimetro());

Retangulo r1 = new Retangulo(16, 4);
System.out.println("Área do retângulo: " + r1.CalcularArea() + "\nPerímetro do retângulo: " + r1.CalcularPerimetro());
```

## Questão 2 - Sistema de Gerenciamento de Funcionários

### Diagrama de Classe

```mermaid
classDiagram
  class Funcionario {
    -nome: String
    -id: int
    -salario: double
    +Funcionario(nome: String, id: int, salario: double)
    +calcularSalarioFinal(): double
  }

  class Gerente {
    -nivel: int
    +Gerente(nome: String, id: int, salario: double, nivel: int)
    +calcularBonificacao(): double
  }

  class Programador {
    -linguagem: String
    +Programador(nome: String, id: int, salario: double, linguagem: String)
    +calcularSalarioFinal(): double
  }

  Funcionario <|-- Gerente
  Funcionario <|-- Programador
```

### Exemplo de Uso

```java
Programador pro1 = new Programador("Livia", 0, 1330.00, "Java");
System.out.println("Salário final do programador: " + pro1.calcularSalarioFinal());

Gerente gere1 = new Gerente("JoycinhaXD", 1, 2200.00, "Finanças", 3);
System.out.println("Bonificação do gerente: " + gere1.calcularBonificacao());
```

## Questão 3 - Sistema de Reservas em Hotel

### Diagrama de Classe

```mermaid
classDiagram
  class Quarto {
    -numero: int
    -capacidade: int
    -precoBase: double
    +Quarto(numero: int, capacidade: int, precoBase: double)
    +calcularCustoReserva(): double
    +obterInformacoes(): String
  }

  class QuartoSimples {
    +QuartoSimples(numero: int, capacidade: int, precoBase: double)
  }

  class QuartoLuxo {
    -jacuzzi: boolean
    +QuartoLuxo(numero: int, capacidade: int, precoBase: double, jacuzzi: boolean)
    +calcularCustoReserva(): double
  }

  class SuitePresidencial {
    -salaReuniao: boolean
    +SuitePresidencial(numero: int, capacidade: int, precoBase: double, salaReuniao: boolean)
    +calcularCustoReserva(): double
  }

  Quarto <|-- QuartoSimples
  Quarto <|-- QuartoLuxo
  Quarto <|-- SuitePresidencial
```

### Exemplo de Uso

```java
QuartoSimples qs1 = new QuartoSimples(123, 30, 100.00);
System.out.println(qs1.obterInformacoes());

QuartoLuxo ql1 = new QuartoLuxo(124, 50, 200.00, false);
QuartoLuxo ql2 = new QuartoLuxo(124, 50, 200.00, true);

System.out.println("Quarto de luxo 1: " + ql1.obterInformacoes());
System.out.println("Quarto de luxo 2: " + ql2.obterInformacoes());

SuitePresidencial sp1 = new SuitePresidencial(124, 50, 500.00, false);
SuitePresidencial sp2 = new SuitePresidencial(124, 50, 500.00, true);

System.out.println("Suíte Presidencial 1: " + sp1.obterInformacoes());
System.out.println("Suíte Presidencial 2: " + sp2.obterInformacoes());
```