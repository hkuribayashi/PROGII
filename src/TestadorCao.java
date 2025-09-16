public class TestadorCao {

    public static void main(String[] args) {

        Cao c1 = new Cao();

        Cao c2 = new Cao("Sushi", 5, true);

        //c1.comer();
        //c1.dormir();

        System.out.println(c1.nome);
        System.out.println(c1.qtdComidaDispoinivel);
        System.out.println(c1.sono);

    }
}
