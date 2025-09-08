public class TestadorDeGatos {

    public static void main(String[] args) {
        Gato x = new Gato();
        x.nome = "Sushi";
        x.qtdComidaDisponivel = 5;
        x.estaComSono = true;

        Gato y = new Gato();
        y.nome = "Cachaça";
        y.qtdComidaDisponivel = 3;
        y.estaComSono = false;

        System.out.println(x.nome);
        System.out.println(x.estaComSono);
        System.out.println(x.qtdComidaDisponivel);

        System.out.println(y.nome);
        System.out.println(y.estaComSono);
        System.out.println(y.qtdComidaDisponivel);

    }
}
