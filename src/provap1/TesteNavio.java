package provap1;

public class TesteNavio {

    public static void main(String[] args) {

        Navio n1 = new Navio("Fabricante");

        System.out.println("Fab.: "+ n1.getFabricante()) ;
        System.out.println("Vel.: "+n1.getVelocidadeAtual() );
        System.out.println("Total Navios: "+Navio.getContador());

    }
}
