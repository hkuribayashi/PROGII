package exercicios;

public class TestaConta {

    public static void main(String[] args) {

        Conta c1 = new Conta("João", "0001-1", 192891);
        c1.depositar(1000.0);
        c1.sacar(200.0);
        c1.depositar(3500.0);
        c1.sacar(500.0);
        c1.depositar(1378.0);

        System.out.println( c1.recuperaDadosParaImpressao() );

        Conta c2 = new Conta("Ana", "0001-1", 91829182);
        System.out.println( c2.recuperaDadosParaImpressao() );





    }
}
