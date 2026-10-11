
import br.com.cadastroSimples.EntradaDeDados.ControladorDoMenu;
import br.com.cadastroSimples.EntradaDeDados.QuestionadorDeUsuario;


/*
* Classe principal, responsável pegar o objeto que será responsável por fazer os questionamentos ao usuário (QuestionamentoUsuario)
* e o DecisaoMenu que permite o usuário escolher o que fazer do menu, além do looping que permite as ações e encerramento do programa.
*/
class Principal{

    static void main(String[] args) {
        ControladorDoMenu decisao = new ControladorDoMenu();
        QuestionadorDeUsuario Leitor = new QuestionadorDeUsuario();

        String resposta = "";
        resposta = decisao.DecisaoMenu(Leitor.mostrarOMenu());
        while (!resposta.equalsIgnoreCase("0")){
            decisao.OpcoesMenu(resposta);
            resposta = decisao.DecisaoMenu(Leitor.mostrarOMenu());
        }




    }

};

