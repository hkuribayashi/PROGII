package exemplos10;

public class TestaConta2 {

    public static void main(String[] args) {

        Cliente2 c = new Cliente2("Hugo","12/10/1984", "jxx");
        System.out.println(c.contas.size());
        Conta2 c2 = new Conta2(1111, c);

        c.contas.add(c2);
        System.out.println(c.contas.size());





    }
}
