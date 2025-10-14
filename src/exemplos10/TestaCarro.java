package exemplos10;

public class TestaCarro {

    public static void main(String[] args) {
        System.out.println(Carro.getTotalDeCarro());
        new Carro("Gol");
        new Carro("Compass");
        new Carro("Uno");
        new Carro("Chevet");
        new Carro("Brasilia");
        new Carro("HB20");
        System.out.println(Carro.getTotalDeCarro());

    }
}
