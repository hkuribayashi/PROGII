package exemplos10;

public class Cliente {
    
    private String nome;

    private String dataNascimento;

    private String email;

    public Cliente(String n, String dt, String e){
        this.nome = n;
        this.dataNascimento = dt;
        this.email = e;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(String novaDataNascimento){
        this.dataNascimento = novaDataNascimento;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }
}