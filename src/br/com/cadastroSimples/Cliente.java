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
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    //Setter para o id.
    public void setId(int id){
        this.id = id;
    };

    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {

      return String.format(
              "ID do cliente: %d -- Seu nome é: %s, você tem: %s anos, seu e-mail é: %s e seu CPF é: %s",
            getId(), getNome(), getIdade(), getEmail(),getcpf()

        );


    }
}
