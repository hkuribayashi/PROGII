package exemplos10;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("João", 2000.0);
        System.out.println( f.getBonificacao() );

        Gerente g = new Gerente("Julia", 2000.0, "123456");
        System.out.println( g.getBonificacao() );

        Funcionario f1 = new Gerente("Gabriel", 3000.0, "123456");
        System.out.println( f1.getBonificacao() );

        Gerente g2 = new Diretor("Kkk", 3000.0, "123456");
        Funcionario f2 = new Diretor("Teste", 2000.0, "2233");
    }
}
