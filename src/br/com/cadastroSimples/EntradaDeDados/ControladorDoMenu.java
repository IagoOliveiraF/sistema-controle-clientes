package br.com.cadastroSimples.EntradaDeDados;
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

            }
            else if(this.resposta.equals("5")){

            }

        return resposta;
    }


}
