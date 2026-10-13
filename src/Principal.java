
import br.com.cadastroSimples.EntradaDeDados.ControladorDoMenu;
import br.com.cadastroSimples.EntradaDeDados.QuestionadorDeUsuario;


class Principal{

  public static void main(String[] args) {
        ControladorDoMenu decisao = new ControladorDoMenu();
        QuestionadorDeUsuario leitor = new QuestionadorDeUsuario();

        String resposta = "";
        resposta = decisao.decisaoMenu(leitor.mostrarOMenu());
        while (!resposta.equalsIgnoreCase("0")){
            decisao.opcoesMenu(resposta);
            resposta = decisao.decisaoMenu(leitor.mostrarOMenu());
        }




    }

};

