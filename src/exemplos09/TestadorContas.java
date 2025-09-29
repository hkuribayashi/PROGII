package exemplos09;

public class TestadorContas {

    public static void main(String[] args) {

        Conta c = new Conta(1111, "Hugo");

        c.depositar(777.0);
        c.sacar(666.0);
        c.depositar(123.25);

        System.out.println(c.qualNomeTitular());
        System.out.println(c.qualNumeroConta());
        System.out.println(c.qualMeuSaldo());

    }
}
