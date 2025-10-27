package exemplos10;

public class PessoaFisica extends Pessoa{

    protected  String cpf;

    public PessoaFisica(String n, String ed, String em, String c){
        super(n, ed, em);
        this.cpf = c;
    }

    public void imprimirDadosPessoaFisica(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Ender: " + this.endereco);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Email: "+this.email);
    }
}
