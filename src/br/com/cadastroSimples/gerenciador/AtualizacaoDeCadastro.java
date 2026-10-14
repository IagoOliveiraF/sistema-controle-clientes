package br.com.cadastroSimples.gerenciador;
import br.com.cadastroSimples.Cliente;
import br.com.cadastroSimples.EntradaDeDados.QuestionadorDeUsuario;

public class AtualizacaoDeCadastro {
   private final QuestionadorDeUsuario questionar = new QuestionadorDeUsuario();


    public void retornoDaAlteracao(Cliente pessoa, String decisao){

        if(decisao.equalsIgnoreCase("Nome")){
            pessoa.setNome(questionar.QuestionarNome());
        } else if(decisao.equalsIgnoreCase("Idade")){
            pessoa.setIdade(questionar.QuestionarIdade());

        } else if(decisao.equalsIgnoreCase("email")){
            pessoa.setEmail(questionar.QuestionarEmail());
        } else if(decisao.equalsIgnoreCase("CPF")){
            pessoa.setCpf(questionar.QuestionarCpf());
        } else{
            System.out.println("Valor informado está incorreto!");
        }

    }

}
