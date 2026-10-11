package br.com.cadastroSimples.EntradaDeDados;
import br.com.cadastroSimples.gerenciador.CadastroDeCliente;
import br.com.cadastroSimples.gerenciador.GerenciadorDeClientess;
import br.com.cadastroSimples.Cliente;

import java.util.List;

public class ControladorDoMenu {
    private String resposta;
    private QuestionadorDeUsuario questionar = new QuestionadorDeUsuario();
    GerenciadorDeClientess gerenciador = new GerenciadorDeClientess();


    public String DecisaoMenu(String resposta){
      return this.resposta = resposta;
    };

    public String OpcoesMenu(String resposta){
        this.resposta = resposta;
            if(this.resposta.equals("1")){
                    CadastroDeCliente Pessoa = new CadastroDeCliente();
                    gerenciador.IncluirPessoa(Pessoa.CriandoPessoa());

            } else if(this.resposta.equals("2")){
                System.out.println("Lista de usuários:");
                List<Cliente> listaDePessoas = gerenciador.puxarLista();
                for (Cliente pessoa: listaDePessoas){
                    System.out.println(pessoa);
                };


            } else if(this.resposta.equals("3")){

                System.out.println("numero digitado 3");
            } else if(this.resposta.equals("4")){

                System.out.println("numero digitado 4");

            } else if(this.resposta.equals("5")){

                System.out.println("numero digitado 5");

            }

        return resposta;
    }


}
