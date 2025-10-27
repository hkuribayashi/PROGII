package exemplos10;

public class Gerente extends Funcionario{

    protected String senhaAcesso;

    public Gerente(String n, Double sal, String senha){
        super(n, sal);
        this.senhaAcesso = senha;
    }

    @Override
    public Double getBonificacao(){
        //return this.salario * 0.15;
        return super.getBonificacao()+ this.salario*0.05;
    }
}
