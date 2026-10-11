package br.com.cadastroSimples.gerenciador;

import br.com.cadastroSimples.EntradaDeDados.QuestionadorDeUsuario;
import br.com.cadastroSimples.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroDeCliente {


    List<Cliente> pessoas = new ArrayList<>();


    QuestionadorDeUsuario questionar = new QuestionadorDeUsuario();

    public CadastroDeCliente(){

    };

    public Cliente CriandoPessoa(){
        //Depois fazer uma lógica para randomizar um ID e não faze lo repiti-lo.
       String nome = questionar.QuestionarNome();
       String cpf = questionar.QuestionarCpf();
       String email = questionar.QuestionarEmail();
       String idade = String.valueOf(questionar.QuestionarIdade());
       Cliente pessoa = new Cliente(nome, cpf, email, idade);
       return pessoa;


    }


    public void setPessoas(Cliente pessoa) {
        this.pessoas = Collections.singletonList(pessoa);
    }

    public List getPessoas(){
        return this.pessoas;
    }
}
