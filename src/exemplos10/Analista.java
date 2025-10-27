package exemplos10;

public class Analista extends Funcionario{

    public Analista(String n, Double salario){
        super(n, salario);
    }

    @Override
    public Double getBonificacao(){
        return this.salario * 0.12;
    }
}
