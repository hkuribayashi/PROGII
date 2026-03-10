package provap1;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String email;

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setSobrenome(String novoSobrenome){
        this.sobrenome = novoSobrenome;
    }

    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getEmail(){
        return this.email;
    }
}
