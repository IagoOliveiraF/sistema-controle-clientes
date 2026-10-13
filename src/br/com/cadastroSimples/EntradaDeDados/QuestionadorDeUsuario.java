package br.com.cadastroSimples.EntradaDeDados;


public class QuestionadorDeUsuario {
    LeitorDeDados leitor = new LeitorDeDados();

    ///// Questionamento para iniciar, atualizar (usar o metodo do ID), Listar e finalizar o cadastro.
      public String mostrarOMenu(){
          System.out.println("""
                ========================
                   SISTEMA DE CLIENTES
                ========================
                
                1 - Cadastrar cliente
                2 - Listar clientes
                3 - Buscar cliente
                4 - Atualizar cliente
                5 - Remover cliente
                0 - Sair
                """);

            return leitor.pegarDadosTexto();
       }

    public String QuestionarCadastro(){
        System.out.println("Gostaria de iniciar o Cadastro?");
        return leitor.pegarDadosTexto();
    }

    public String QuestionarAlteracao(){
        System.out.println("Gostaria de alterar o seu Cadastro?");
        return leitor.pegarDadosTexto();
    }

    public int QuestionarVerCadastro(){
        System.out.println("Gostaria de ver seu cadastro?"+
                "\npara isso é necessário ter o ID em mãos.");
        return leitor.pegarInteiro();
    }

    public String QuestionarVerListaDeUsuario(){
        System.out.println("Gostaria de ver a lista de usuarios cadastrados?");
        return leitor.pegarDadosTexto();
    }


    ///// Questionamentos para cadastro. /////
    public String QuestionarNome(){
        System.out.println("Qual o seu nome:");
        return leitor.pegarDadosTexto();
    }

    public int QuestionarIdade(){
        System.out.println("Qual a sua idade:");
        return leitor.pegarInteiro();
    }


    public String QuestionarCpf(){
        System.out.println("Qual os digitos do seu CPF:");
        return leitor.pegarDadosTexto();
    }

    public String QuestionarEmail(){
        System.out.println("Qual o seu e-mail pessoal:");
        return leitor.pegarDadosTexto();
    }


};


