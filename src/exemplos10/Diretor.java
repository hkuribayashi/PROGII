package exemplos10;

public class Diretor extends Gerente{

    public Diretor(String n, Double s, String se){
        super(n,s,se);
    }

    @Override
    public Double getBonificacao(){
        return this.salario * 0.2;
    }
}