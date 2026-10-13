package br.com.cadastroSimples.gerenciador;

import br.com.cadastroSimples.EntradaDeDados.QuestionadorDeUsuario;
import br.com.cadastroSimples.Cliente;

public class CadastroDeCliente {


    QuestionadorDeUsuario questionar = new QuestionadorDeUsuario();

    public CadastroDeCliente(){

    }

    public Cliente CriandoPessoa(){
        //Depois fazer uma lógica para randomizar um ID e não faze lo repiti-lo.
       String nome = questionar.QuestionarNome();
       String idade = String.valueOf(questionar.QuestionarIdade());
       String email = questionar.QuestionarEmail();
       String cpf = questionar.QuestionarCpf();


       Cliente pessoa = new Cliente(nome,idade,email,cpf);
       return pessoa;


    }

}
