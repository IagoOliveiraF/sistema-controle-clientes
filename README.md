# Sistema de Controle de Clientes

Projeto desenvolvido em Java com o objetivo de praticar os fundamentos da programação orientada a objetos e construir, de forma incremental, um sistema de cadastro e gerenciamento de clientes.

A versão atual (`v0.2`) implementa o cadastro e a listagem de clientes, a geração automática de identificadores sequenciais e a busca de clientes por ID. Os registros são mantidos em memória durante a execução do programa.

## Objetivos do projeto

- Praticar os fundamentos da linguagem Java.
- Aplicar conceitos de programação orientada a objetos.
- Separar as responsabilidades das classes.
- Trabalhar com coleções para armazenar e gerenciar objetos.
- Desenvolver funcionalidades de forma incremental, utilizando Git para versionamento do código.
- Construir uma base para futuras funcionalidades de gerenciamento de clientes.

## Funcionalidades — v0.2

- **Cadastro de clientes:** coleta nome, idade, CPF e e-mail para criar um novo registro.
- **Identificação automática:** atribui um ID sequencial a cada cliente cadastrado.
- **Listagem de clientes:** exibe os clientes cadastrados durante a execução do programa.
- **Busca por ID:** permite localizar um cliente pelo seu identificador e informa quando nenhum registro correspondente é encontrado.
- **Menu interativo:** permite selecionar as operações disponíveis pelo console.
- **Execução contínua:** mantém o menu em funcionamento até que o usuário escolha a opção de saída.

### Menu do sistema

| Opção | Funcionalidade | Status |
|---|---|---|
| 1 | Cadastrar cliente | Implementada |
| 2 | Listar clientes | Implementada |
| 3 | Buscar cliente por ID | Implementada |
| 4 | Atualizar cliente | Planejada |
| 5 | Remover cliente | Planejada |
| 0 | Sair do sistema | Implementada |

## Tecnologias e conceitos utilizados

- **Java:** linguagem utilizada no desenvolvimento.
- **Programação orientada a objetos (POO):** organização do sistema em classes e objetos.
- **Encapsulamento:** controle de acesso aos atributos e à coleção interna de clientes.
- **Collections Framework:** utilização de `List` e `ArrayList` para armazenar os clientes.
- **Identificadores sequenciais:** geração de IDs para distinguir os clientes cadastrados.
- **Métodos de busca:** utilização de uma busca sequencial para localizar clientes pelo ID.
- **Laços de repetição:** utilização de `while` para manter o menu ativo e `for-each` para percorrer a lista de clientes.
- **Git e GitHub:** versionamento e publicação incremental do projeto.

## Organização das classes

Estrutura simplificada dos arquivos principais do projeto:

```text
src/
├── Principal.java
└── br/com/cadastroSimples/
    ├── Cliente.java
    ├── EntradaDeDados/
    │   ├── ControladorDoMenu.java
    │   └── QuestionadorDeUsuario.java
    └── gerenciador/
        ├── CadastroDeCliente.java
        └── GerenciadorDeClientes.java
```

### Responsabilidade de cada classe

#### `Principal`

Ponto de entrada da aplicação. Inicializa o controlador do menu e o objeto responsável pelas interações com o usuário, mantendo o programa em execução até que seja escolhida a opção de saída.

#### `Cliente`

Representa um cliente do sistema e mantém seus dados, como ID, nome, idade, CPF e e-mail. Disponibiliza métodos de acesso aos atributos e uma representação textual por meio de `toString()`.

#### `CadastroDeCliente`

Responsável por solicitar os dados necessários para criar um cliente e retornar o objeto criado.

#### `GerenciadorDeClientes`

Responsável por manter e gerenciar a coleção de clientes durante a execução do programa. Implementa a inclusão de clientes com IDs sequenciais, a recuperação da lista para consulta e a busca de clientes por identificador.

#### `QuestionadorDeUsuario`

Centraliza as perguntas e interações apresentadas ao usuário, incluindo as solicitações de dados pessoais e as informações necessárias para executar as operações do menu.

#### `ControladorDoMenu`

Interpreta a opção selecionada pelo usuário e direciona a execução para a funcionalidade correspondente, integrando as classes responsáveis pelo cadastro e pelo gerenciamento dos clientes.

## Como o sistema funciona

1. A classe `Principal` inicia o sistema e cria os objetos necessários.
2. O usuário recebe as opções disponíveis no menu.
3. O `ControladorDoMenu` interpreta a opção selecionada.
4. No cadastro, a classe `CadastroDeCliente` coleta os dados e cria um objeto `Cliente`.
5. O `GerenciadorDeClientes` atribui um ID sequencial ao cliente e o adiciona à coleção.
6. Na listagem, o gerenciador disponibiliza uma cópia não modificável da lista para consulta, e os clientes são exibidos no console.
7. Na busca, o usuário informa um ID e o gerenciador procura o cliente correspondente.
8. O processo se repete até que o usuário escolha a opção de saída.

## Armazenamento dos dados

Os clientes são armazenados em memória por meio de uma lista.

Isso significa que os registros ficam disponíveis enquanto a aplicação está em execução. Ao encerrar o programa, os dados são perdidos, pois ainda não existe persistência em arquivos ou banco de dados.

Os IDs são gerados sequencialmente durante a execução atual do programa. Como não existe persistência, a sequência é reiniciada quando uma nova execução começa.

## Histórico de versões e próximas etapas

- **v0.1 — Cadastro e listagem:** implementação do cadastro de clientes, armazenamento em memória e listagem pelo menu interativo.
- **v0.2 — Identificação e busca:** implementação de IDs sequenciais e busca de clientes por ID, além de melhorias no encapsulamento e na organização do código.
- **v0.3 — Atualização de clientes:** permitir a alteração dos dados de um cliente existente.
- **v0.4 — Remoção de clientes:** permitir a exclusão de um cliente pelo seu identificador.
- **Próximas versões:** evoluir o projeto com validações, testes automatizados e outras melhorias de acordo com o aprendizado.

## Propósito educacional

Este projeto tem como objetivo promover a evolução gradual dos meus conhecimentos em Java e desenvolvimento Back-End, consolidando os fundamentos da programação e avançando progressivamente para conceitos de maior complexidade.

O desenvolvimento é realizado em pequenas etapas, com foco na prática, na organização do código, na compreensão das decisões de projeto e no uso do Git para acompanhar a evolução do sistema.
