package br.com.cadastroSimples;

public class Cliente {
    // Propriedades de Pessoa
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String idade;

    // Constructor de PESSOA para obrigar o preenchimento das informações importantes

    public Cliente(String nome, String cpf, String idade, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }

    // Getters e Setters para as propriedades
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getcpf(){
        return this.cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setIdade(String idade){
        this.idade = idade;
    }

    public String getIdade(){
        return  this.idade;
    }

    @Override
    public String toString() {

      return String.format(
              "Seu nome é: %s, você tem: %s anos, seu e-mail é: %s e seu CPF é: %s",
              getNome(), getIdade(), getEmail(),getcpf()

        );


    }
}
