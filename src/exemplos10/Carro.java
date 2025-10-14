package exemplos10;

public class Carro {

    private String modelo;

    private static Integer totalDeCarros = 0;

    public Carro(String m){
        this.modelo = m;
        Carro.totalDeCarros = Carro.totalDeCarros + 1;
    }

    String getModelo(){
        return this.modelo;
    }

    void setModelo(String novoModelo){
        this.modelo = novoModelo;
    }

    static Integer getTotalDeCarro(){
        return Carro.totalDeCarros;
    }
}
