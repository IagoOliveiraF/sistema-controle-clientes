package br.com.cadastroSimples.gerenciador;

import br.com.cadastroSimples.Cliente;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeClientes {
    private int id = 1;
   private final List<Cliente> pessoas = new ArrayList<>();


    public boolean incluirPessoa(Cliente pessoa){
        pessoa.setId(this.id);

        boolean adicionou = this.pessoas.add(pessoa);

        if(adicionou){
            id++;
        }
        return adicionou;
    }

public Cliente buscarPorId(int id) {

    for (Cliente pessoa : pessoas) {

        if (pessoa.getId() == id) {
            return pessoa;
        }
    }
    return null;
}

    public List<Cliente> listarClientes(){
        return List.copyOf(this.pessoas);
    }

}
