public class TestaCasa {
    public static void main(String[] args) {
        Casa c1 = new Casa();

        c1.porta1 = new Porta();
        c1.porta2 = new Porta();
        c1.porta3 = new Porta();

        c1.porta1.cor = "Azul";
        c1.porta1.dimensaoX = 1.2;
        c1.porta1.dimensaoY = 2.5;
        c1.porta1.dimensaoZ = 0.3;
        c1.porta1.aberta = false;

        c1.porta2.cor = "Azul";
        c1.porta2.dimensaoX = 1.2;
        c1.porta2.dimensaoY = 2.5;
        c1.porta2.dimensaoZ = 0.3;
        c1.porta2.aberta = false;

        c1.porta3.cor = "Azul";
        c1.porta3.dimensaoX = 1.2;
        c1.porta3.dimensaoY = 2.5;
        c1.porta3.dimensaoZ = 0.3;
        c1.porta3.aberta = false;

        c1.pintarCasa("Branca", "Azul");
        System.out.println( c1.calcularQtdPortasAbertas() );

        Pessoa p1 = new Pessoa();
        p1.nome = "Hugo";
        p1.idade = 39;

        c1.alterarProprietario(p1);

        new Pessoa();

    }
}
