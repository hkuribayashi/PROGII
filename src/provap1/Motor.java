package provap1;

public class Motor {

    private String fabricante;
    private Double potencia;

    void setFabricante(String novoFabricante){
        this.fabricante = novoFabricante;
    }

    void setPotencia(Double novaPotencia){
        this.potencia = novaPotencia;
    }

    String getFabricante(){
        return this.fabricante;
    }

    Double getPotencia(){
        return this.potencia;
    }
}
