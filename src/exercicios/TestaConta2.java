package exercicios;

public class TestaConta2 {

    public static void main(String[] args) {

        Conta c1 = new Conta("Danilo", "0001", 1111);
        Conta c2 = c1;
        c1.depositar(100.0);
        System.out.println(c2.saldo);


        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println(c2.recuperaDadosParaImpressao());
    }
}
