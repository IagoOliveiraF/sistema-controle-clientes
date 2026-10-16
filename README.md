# Sistema de Controle de Clientes

Projeto desenvolvido em Java com foco no aprendizado de Programação Orientada a Objetos (POO), organização de responsabilidades, coleções e controle de versão com Git e GitHub.

A aplicação funciona pelo terminal e permite cadastrar clientes, listar os cadastros, buscar clientes pelo ID, atualizar seus dados e remover cadastros. Os dados são mantidos em memória durante a execução do programa.

## Funcionalidades

- Cadastro de clientes.
- Geração automática de IDs sequenciais.
- Listagem dos clientes cadastrados.
- Busca de cliente pelo ID.
- Atualização de nome, idade, e-mail ou CPF a partir do ID.
- Remoção de cliente por ID, mediante confirmação do usuário.
- Tratamento de ID não encontrado durante a busca, atualização e remoção.
- Possibilidade de cancelar a remoção antes de confirmar a operação.
- Menu interativo no terminal.

## Menu da aplicação

| Opção | Funcionalidade | Situação |
|---|---|---|
| `1` | Cadastrar cliente | Implementada |
| `2` | Listar clientes | Implementada |
| `3` | Buscar cliente por ID | Implementada |
| `4` | Atualizar cliente por ID | Implementada na v0.3 |
| `5` | Remover cliente por ID | Implementada na v0.4 |
| `0` | Sair | Implementada |

## Estrutura do projeto

A estrutura abaixo representa os principais arquivos da aplicação:

```text
src/
├── Principal.java
└── br/com/cadastroSimples/
    ├── Cliente.java
    ├── EntradaDeDados/
    │   ├── ControladorDoMenu.java
    │   └── QuestionadorDeUsuario.java
    └── gerenciador/
        ├── AtualizacaoDeCadastro.java
        ├── CadastroDeCliente.java
        └── GerenciadorDeClientes.java
```

## Responsabilidade das classes

- **`Principal`**: inicia a aplicação e mantém o ciclo principal do menu.
- **`Cliente`**: representa um cliente e mantém seus dados, disponibilizando getters e setters.
- **`QuestionadorDeUsuario`**: apresenta perguntas e coleta as respostas digitadas pelo usuário.
- **`ControladorDoMenu`**: interpreta a opção selecionada e coordena a funcionalidade correspondente, incluindo a confirmação da remoção e as mensagens apresentadas ao usuário.
- **`CadastroDeCliente`**: coleta os dados necessários e cria um cliente.
- **`GerenciadorDeClientes`**: mantém a lista de clientes, atribui IDs sequenciais e oferece operações de inclusão, listagem, busca e remoção.
- **`AtualizacaoDeCadastro`**: recebe o cliente encontrado e o campo escolhido, solicita o novo valor e atualiza o atributo correspondente por meio dos setters de `Cliente`.

## Como funciona a atualização

1. O usuário escolhe a opção `4`.
2. Informa o ID do cliente.
3. O sistema procura o cliente no `GerenciadorDeClientes`.
4. Se o cliente existir, o usuário escolhe o campo que deseja alterar: `Nome`, `Idade`, `Email` ou `CPF`.
5. O sistema solicita o novo valor e atualiza o objeto encontrado.
6. O cadastro atualizado é exibido no terminal.

Se o ID não existir, a aplicação informa que o usuário não foi encontrado. Se o campo informado não corresponder às opções previstas, a atualização não é realizada.

## Como funciona a remoção

1. O usuário escolhe a opção `5` e informa o ID do cliente.
2. O sistema procura o cadastro pelo ID.
3. Se o cliente existir, seus dados são apresentados para conferência e o sistema solicita confirmação.
4. Se o usuário confirmar, o `ControladorDoMenu` chama o método `removerDaLista(id)` do `GerenciadorDeClientes`.
5. O método retorna `true` quando o cliente é removido e `false` quando não é encontrado. O controlador usa esse retorno para apresentar a mensagem correspondente.
6. Se o usuário cancelar, a remoção não é realizada.

Quando o ID informado não corresponde a nenhum cliente, o sistema informa que o usuário não foi encontrado.

## Conceitos praticados

- Java e sintaxe da linguagem.
- Classes, objetos, atributos e métodos.
- Encapsulamento com atributos privados e getters/setters.
- Coleções com `List` e `ArrayList`.
- Geração de identificadores sequenciais.
- Busca linear por ID.
- Referências a objetos.
- Retorno de métodos com `boolean` para indicar sucesso ou falha.
- Separação de responsabilidades entre classes.
- Estruturas condicionais e laços de repetição.
- Versionamento com Git e GitHub.

## Armazenamento dos dados

Os clientes são mantidos em memória. Portanto, os dados cadastrados e o contador de IDs são reiniciados quando a aplicação é encerrada. A persistência em arquivo ou banco de dados poderá ser considerada em uma evolução futura.

## Histórico de versões

- **v0.1** — Cadastro e listagem de clientes.
- **v0.2** — Geração automática de IDs sequenciais e busca de cliente por ID.
- **v0.3** — Atualização de nome, idade, e-mail ou CPF de um cliente localizado pelo ID.
- **v0.4** — Remoção de cliente por ID, com confirmação do usuário, cancelamento da operação e tratamento de ID não encontrado.

## Objetivo do projeto

Este projeto tem finalidade educacional. A proposta é evoluir a aplicação em pequenas versões, praticando conceitos de desenvolvimento de software, avaliando decisões de implementação e registrando a evolução com Git e GitHub.
