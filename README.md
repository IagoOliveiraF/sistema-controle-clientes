# Sistema de Controle de Clientes

Projeto desenvolvido em Java com o objetivo de praticar os fundamentos da programação orientada a objetos e construir, de forma incremental, um sistema de cadastro e gerenciamento de clientes.

A primeira versão (`v0.1`) implementa o cadastro de clientes, o armazenamento dos registros em memória e a listagem dos clientes cadastrados por meio de um menu interativo no console.

## Objetivos do projeto

- Praticar os fundamentos da linguagem Java.
- Aplicar conceitos de programação orientada a objetos.
- Separar as responsabilidades das classes.
- Trabalhar com coleções para armazenar objetos.
- Desenvolver funcionalidades de forma incremental, utilizando Git para versionamento do código.
- Construir uma base para futuras funcionalidades de gerenciamento de clientes.

## Funcionalidades — v0.1

- **Cadastro de clientes:** coleta nome, idade, CPF e e-mail para criar um novo registro.
- **Listagem de clientes:** exibe os clientes cadastrados durante a execução do programa.
- **Menu interativo:** permite selecionar as operações disponíveis pelo console.
- **Execução contínua:** mantém o menu em funcionamento até que o usuário escolha a opção de saída.

### Menu do sistema

| Opção | Funcionalidade | Status |
|---|---|---|
| 1 | Cadastrar cliente | Implementada |
| 2 | Listar clientes | Implementada |
| 3 | Buscar cliente | Planejada |
| 4 | Atualizar cliente | Planejada |
| 5 | Remover cliente | Planejada |
| 0 | Sair do sistema | Implementada |

## Tecnologias e conceitos utilizados

- **Java:** linguagem utilizada no desenvolvimento.
- **Programação orientada a objetos (POO):** organização do sistema em classes e objetos.
- **Encapsulamento:** utilização de atributos privados e métodos de acesso na classe de cliente.
- **Collections Framework:** utilização de `List` e `ArrayList` para armazenar os clientes.
- **Laços de repetição:** utilização de `while` para manter o menu ativo e `for-each` para percorrer a lista de clientes.


## Organização das classes

A estrutura abaixo representa a organização proposta para a versão inicial.

```text
src/
└── br/com/cadastrosimples/
    ├── Principal.java
    ├── cliente/
    │   └── Cliente.java
    ├── gerenciador/
    │   ├── CadastroDeCliente.java
    │   └── GerenciadorDeClientes.java
    ├── entrada/
    │   ├── LeitorDeDados.java
    │   └── QuestionadorDeUsuario.java
    └── menu/
        └── ControladorDeMenu.java
```

### Responsabilidade de cada classe

#### `Principal`

Ponto de entrada da aplicação. Inicializa os objetos necessários, solicita a primeira opção do menu e mantém o programa em execução até que o usuário escolha sair.

#### `Cliente`

Representa um cliente do sistema e mantém seus dados, como nome, idade, CPF e e-mail. Disponibiliza métodos de acesso aos atributos e uma representação textual por meio de `toString()`.

#### `CadastroDeCliente`

Responsável por solicitar os dados necessários para criar um cliente e retornar o objeto criado.

#### `GerenciadorDeClientes`

Mantém a coleção de clientes cadastrados durante a execução do programa. Na versão inicial, permite adicionar clientes à lista e recuperar os registros para listagem.

#### `LeitorDeDados`

Responsável pela leitura de informações digitadas no console, incluindo entradas textuais e numéricas.

#### `QuestionadorDeUsuario`

Centraliza as perguntas apresentadas ao usuário, como as solicitações de nome, idade, CPF e e-mail, além das mensagens relacionadas ao menu e às operações.

#### `ControladorDeMenu`

Interpreta a opção selecionada e encaminha a execução para a funcionalidade correspondente.

## Como o sistema funciona

1. A classe `Principal` inicia o sistema.
2. O usuário recebe as opções disponíveis no menu.
3. O `ControladorDeMenu` interpreta a opção selecionada.
4. No cadastro, a classe `CadastroDeCliente` coleta os dados e cria um objeto `Cliente`.
5. O `GerenciadorDeClientes` adiciona esse objeto à coleção.
6. Na listagem, o gerenciador fornece a coleção, que é percorrida para exibir cada cliente no console.
7. O processo se repete até que o usuário escolha a opção de saída.

## Armazenamento dos dados

Nesta versão, os clientes são armazenados em memória por meio de uma lista.

Isso significa que os registros ficam disponíveis enquanto a aplicação está em execução.

### Próximas etapas

- **v0.2:** busca de clientes por identificador.
- **v0.3:** atualização dos dados de um cliente.
- **v0.4:** remoção de clientes.
- ...
## Propósito educacional

Tenho como objetivo com esse projeto, a evolução natural e gradual sobre os conceitos base do desenvolvimento Back-End em Java, aperfeiçoando a criação e evoluindo em complexidade.