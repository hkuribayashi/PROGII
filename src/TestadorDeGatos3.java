public class TestadorDeGatos3 {

    public static void main(String[] args) {
        Gato x = new Gato();
        x.nome = "Sushi";
        x.qtdComidaDisponivel = 5;
        x.estaComSono = true;
        x.estaCansado = true;

        Gato y = new Gato();
        y.nome = "Cachaça";
        y.qtdComidaDisponivel = 3;
        y.estaComSono = true;

        x.dormir();
        x.comer();
        x.comer();
        x.comer();

        System.out.println(x.nome);
        System.out.println(x.estaComSono);
        System.out.println(x.qtdComidaDisponivel);

        System.out.println();
        System.out.println(y.nome);
        System.out.println(y.estaComSono);
        System.out.println(y.qtdComidaDisponivel);
    }
}
