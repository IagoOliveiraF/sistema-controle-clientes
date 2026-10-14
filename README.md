# Sistema de Controle de Clientes

Projeto desenvolvido em Java com foco no aprendizado de Programação Orientada a Objetos (POO), organização de responsabilidades, coleções e controle de versão com Git e GitHub.

A aplicação funciona pelo terminal e permite cadastrar clientes, listar os cadastros, buscar um cliente pelo ID e atualizar seus dados. Nesta etapa, os dados são mantidos apenas em memória durante a execução do programa.

## Funcionalidades

- Cadastro de clientes.
- Geração automática de IDs sequenciais.
- Listagem dos clientes cadastrados.
- Busca de cliente pelo ID.
- Atualização de nome, idade, e-mail ou CPF a partir do ID.
- Tratamento de ID não encontrado.
- Tratamento de opção de campo inválida durante a atualização.
- Menu interativo no terminal.

## Menu da aplicação

| Opção | Funcionalidade | Situação |
|---|---|---|
| `1` | Cadastrar cliente | Implementada |
| `2` | Listar clientes | Implementada |
| `3` | Buscar cliente por ID | Implementada |
| `4` | Atualizar cliente por ID | Implementada na v0.3 |
| `5` | Remover cliente | Planejada |
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
- **`ControladorDoMenu`**: interpreta a opção selecionada e coordena a funcionalidade correspondente.
- **`CadastroDeCliente`**: coleta os dados necessários e cria um cliente.
- **`GerenciadorDeClientes`**: mantém a lista de clientes, atribui IDs sequenciais e oferece operações de inclusão, listagem e busca.
- **`AtualizacaoDeCadastro`**: recebe o cliente encontrado e o campo escolhido, solicita o novo valor e atualiza o atributo correspondente por meio dos setters de `Cliente`.

## Como funciona a atualização

1. O usuário escolhe a opção `4`.
2. Informa o ID do cliente.
3. O sistema procura o cliente no `GerenciadorDeClientes`.
4. Se o cliente existir, o usuário escolhe o campo que deseja alterar: `Nome`, `Idade`, `Email` ou `CPF`.
5. O sistema solicita o novo valor e atualiza o objeto encontrado.
6. O cadastro atualizado é exibido no terminal.

Se o ID não existir, a aplicação informa que o usuário não foi encontrado. Se o campo informado não corresponder às opções previstas, a atualização não é realizada.

## Conceitos praticados

- Java e sintaxe da linguagem.
- Classes, objetos, atributos e métodos.
- Encapsulamento com atributos privados e getters/setters.
- Coleções com `List` e `ArrayList`.
- Geração de identificadores sequenciais.
- Busca linear por ID.
- Referências a objetos.
- Separação de responsabilidades entre classes.
- Estruturas condicionais e laços de repetição.
- Versionamento com Git e GitHub.

## Armazenamento dos dados

Nesta versão, os clientes são mantidos em memória. Portanto, os dados cadastrados e o contador de IDs são reiniciados quando a aplicação é encerrada. A persistência em arquivo ou banco de dados poderá ser considerada em uma evolução futura.

## Histórico de versões

- **v0.1** — Cadastro e listagem de clientes.
- **v0.2** — Geração automática de IDs sequenciais e busca de cliente por ID.
- **v0.3** — Atualização de nome, idade, e-mail ou CPF de um cliente localizado pelo ID.
- **Próxima evolução planejada** — Remoção de cliente por ID.

## Objetivo do projeto

Este projeto tem finalidade educacional. A proposta é evoluir a aplicação em pequenas versões, praticando conceitos de desenvolvimento de software, avaliando decisões de implementação e registrando a evolução com Git e GitHub.
