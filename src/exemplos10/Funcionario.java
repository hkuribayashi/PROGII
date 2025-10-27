package exemplos10;

public class Funcionario {

    protected String nome;

    protected Double salario;

    public Funcionario(String n, Double s){
        this.nome = n;
        this.salario = s;
    }

    public Double getBonificacao(){
        return this.salario * 0.1;
    }
}