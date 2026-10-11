package br.com.cadastroSimples.gerenciador;

import br.com.cadastroSimples.Cliente;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeClientess {

    List<Cliente> pessoas = new ArrayList<>();


    public boolean IncluirPessoa(Cliente pessoa){
        return this.pessoas.add(pessoa);
    };

    public List<Cliente> puxarLista(){
        return this.pessoas;
    }

}
