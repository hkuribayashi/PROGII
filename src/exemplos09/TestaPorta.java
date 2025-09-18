package exemplos09;

public class TestaPorta {
    public static void main(String[] args) {
        Porta p1 = new Porta();
        p1.cor = "Azul";
        p1.aberta = false;
        p1.dimensaoX = 1.2;
        p1.dimensaoY = 2.5;
        p1.dimensaoZ = 0.3;

        p1.abrirPorta();
        p1.fecharPorta();
        p1.pintarPorta("verde");

        System.out.println(p1.cor);
        System.out.println(p1.aberta);
    }
}
