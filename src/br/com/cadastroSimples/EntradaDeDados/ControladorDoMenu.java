package br.com.cadastroSimples.EntradaDeDados;
import br.com.cadastroSimples.gerenciador.AtualizacaoDeCadastro;
import br.com.cadastroSimples.gerenciador.CadastroDeCliente;
import br.com.cadastroSimples.gerenciador.GerenciadorDeClientes;
import br.com.cadastroSimples.Cliente;

import java.util.List;

public class ControladorDoMenu {
    private String resposta;
    QuestionadorDeUsuario questionar = new QuestionadorDeUsuario();
    GerenciadorDeClientes gerenciador = new GerenciadorDeClientes();


    public String decisaoMenu(String resposta){
      return resposta;
    }

    public String opcoesMenu(String resposta){
        this.resposta = resposta;
            if(this.resposta.equals("1")){
                    CadastroDeCliente pessoa = new CadastroDeCliente();
                    gerenciador.incluirPessoa(pessoa.CriandoPessoa());

            } else if(this.resposta.equals("2")){
                System.out.println("Lista de usuários:");
                List<Cliente> listaDePessoas = gerenciador.listarClientes();
                for (Cliente pessoa: listaDePessoas){
                    System.out.println(pessoa);
                }


            } else if(this.resposta.equals("3")){
                int id = questionar.QuestionarVerCadastro();
                Cliente pessoa = gerenciador.buscarPorId(id);

                if(pessoa != null){
                    System.out.println(pessoa);
                } else{
                    System.out.println("Usuário não encontrado.");
                }
            }
            else if(this.resposta.equals("4")){

                int id = questionar.QuestionarVerCadastro();
                Cliente pessoa = gerenciador.buscarPorId(id);
                AtualizacaoDeCadastro atualizar = new AtualizacaoDeCadastro();

                if(pessoa != null){
                    System.out.println(pessoa);
                    atualizar.retornoDaAlteracao(pessoa, questionar.QuestionarAlteracao());
                    System.out.println(pessoa);

                } else{
                    System.out.println("Usuário não encontrado.");
                }


            }
            else if(this.resposta.equals("5")){
                int id = questionar.QuestionarVerCadastro();
                String confirmacao = "";
                Cliente pessoa = gerenciador.buscarPorId(id);
                if (pessoa != null){
                    System.out.println("Dados do usuario:");
                    System.out.println(pessoa);
                    confirmacao = questionar.QuestionarExclusao();

                    if (confirmacao.equalsIgnoreCase("sim")){
                      boolean removido = gerenciador.removerDaLista(id);
                      if (removido){
                          System.out.println("Exclusão realizada. Tente buscar na lista para confirmar a exclusão.");

                      } else{
                          System.out.println("Não foi possível excluir o usuário.");
                      }
                    } else{
                        System.out.println("Cancelando a exclusão.");
                    }
                }else {
                    System.out.println("Usuário não encontrado.");
                }

            }

        return resposta;
    }


}
