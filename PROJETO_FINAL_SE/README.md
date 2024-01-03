# Sistema Escolar - Projeto Final de PEOO

Este é o projeto final desenvolvido na disciplina de Programação Estruturada Orientada a Objetos (PEOO), denominado Sistema Escolar. O sistema foi elaborado para gerenciar informações relacionadas a alunos, professores, disciplinas e notas em um ambiente escolar.

## Estrutura do Projeto

### Classes
# Sistema Escolar - Funcionalidades Principais

1. **Cadastrar Disciplina (Opção 1):**
   - Permite cadastrar uma nova disciplina no sistema.

2. **Cadastrar Professor (Opção 2):**
   - Facilita o cadastro de um novo professor no sistema.

3. **Cadastrar Aluno (Opção 3):**
   - Permite registrar um novo aluno no sistema.

4. **Associar Professor a Disciplina (Opção 4):**
   - Cria uma associação entre um professor e uma disciplina.

5. **Associar Aluno a Disciplina (Opção 5):**
   - Associa um aluno a uma disciplina específica.

6. **Remover Professor de Disciplina (Opção 6):**
   - Remove a associação de um professor a uma disciplina.

7. **Visualizar Professores (Opção 7):**
   - Exibe a lista de todos os professores cadastrados.

8. **Visualizar Alunos (Opção 8):**
   - Mostra a lista de todos os alunos cadastrados.

9. **Visualizar Disciplinas (Opção 9):**
   - Exibe a lista de todas as disciplinas cadastradas.

10. **Gerar Boletim (Opção 10):**
    - Gera o boletim de um aluno, mostrando as notas em todas as disciplinas.

11. **Atribuir Nota a Aluno (Opção 11):**
    - Facilita a atribuição de notas a um aluno em uma disciplina específica.

## Diagrama de Classes.


classDiagram
  class Quarto {
    -numero: int
    -capacidade: int
    -precoBase: double
    +calcularCusto(): double
    +obterInformacoes(): String
  }

  class QuartoSimples {
    +calcularCusto(): double
    +obterInformacoes(): String
  }

  class QuartoLuxo {
    +jacuzzi: boolean
    +calcularCusto(): double
    +obterInformacoes(): String
  }

  class SuitePresidencial {
    +salaReuniao: boolean
    +calcularCusto(): double
    +obterInformacoes(): String
  }

  Quarto <|-- QuartoSimples
  Quarto <|-- QuartoLuxo
  Quarto <|-- SuitePresidencial


## Utilização.

O projeto pode ser utilizado como uma base para sistemas de gerenciamento escolar, oferecendo funcionalidades essenciais para a administração de alunos, professores, disciplinas e notas.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias, correções ou novas funcionalidades.

**Agradecemos por utilizar o Sistema Escolar!**