package provap1.questao02;

public class Circulo {

    Double raio;
    Ponto centro;

    Circulo(Double raio, Ponto centro){
        this.raio = raio;
        this.centro = centro;
    }

    Circulo(Double raio){
        this.raio = raio;
        this.centro = new Ponto(0.0, 0.0);
    }

    void inflar(Double valor){
        this.raio = this.raio + valor;
    }

    void diminuir(Double valor){
        this.raio = this.raio - valor;
    }

    void mover(Ponto novoCentro){
        this.centro = novoCentro;
    }

    Double getCircunferencia(){
        return this.raio * 2.0 * Math.PI;
    }
}
