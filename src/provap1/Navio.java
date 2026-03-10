package provap1;

public class Navio {

    private String fabricante;
    private double velocidadeAtual;
    private static int contador = 0;

    public Navio(String novoFabricante){
        this.fabricante = novoFabricante;
        this.velocidadeAtual = 0.0;
        Navio.contador++;
    }

    public Navio(String novoFabricante, double velocidade){
        this.fabricante = novoFabricante;
        this.velocidadeAtual = velocidade;
        Navio.contador++;
    }

    public void aumentarVelocidade(){
        this.velocidadeAtual++;
    }

    public void reduzirVelocidade(){
        this.velocidadeAtual--;
    }

    public static int getContador(){
        return Navio.contador;
    }

    String getFabricante(){
        return this.fabricante;
    }

    double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
}
