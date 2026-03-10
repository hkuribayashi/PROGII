package exemplo03;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;

    public Cliente(String n, LocalDate dN, String e, String t){
        this.nome = n;
        this.dataNascimento = dN;
        this.email = e;
        this.telefone = t;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
