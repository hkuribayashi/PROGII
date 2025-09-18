package exemplos09;

public class TestaPonto {

    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(20.4, 19.2);
        Ponto p3 = new Ponto(10.4, -11.2);

        //p1.calcularDistancia(p2);

        Triangulo t1 = new Triangulo(p1, p2, p3);
        System.out.println(t1.calculaPerimentro());
    }
}
