package exemplos09;

public class TestadorContas2 {

    public static void main(String[] args) {
        /*
        exemplos09.Conta c1 = new exemplos09.Conta();
        System.out.println(c1.titular);
        System.out.println(c1.numero);
        System.out.println(c1.saldo);
        */


        ContaAntiga c2 = new ContaAntiga("Hugo", 1111, 100.0);
        System.out.println(c2.titular);
        System.out.println(c2.numero);
        System.out.println(c2.saldo);
    }
}
