package br.com.cadastroSimples;

public class Cliente {
    // Propriedades de Pessoa
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String idade;

    // Constructor de PESSOA para obrigar o preenchimento das informações importantes

    public Cliente(String nome, String idade, String email,  String cpf){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;


    }

    // Setters para as propriedades

    public void setId(int id){
       this.id = id;
    };

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getcpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }

    public String getIdade(){
        return  this.idade;
    }

    @Override
    public String toString() {

      return String.format(
              "ID do cliente: %d -- Seu nome é: %s, você tem: %s anos, seu e-mail é: %s e seu CPF é: %s",
            getId(), getNome(), getIdade(), getEmail(),getcpf()

        );


    }
}
