package exemplos10;

import java.util.ArrayList;
import java.util.List;

public class Cliente2 {

    private String nome;

    private String dataNascimento;

    private String email;
    
    public ArrayList<Conta2> contas;

    public Cliente2(String n, String dt, String e){
        this.nome = n;
        this.dataNascimento = dt;
        this.email = e;
        this.contas = new ArrayList<>();
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