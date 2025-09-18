package exemplos09;

public class Triangulo {

    Ponto p1;
    Ponto p2;
    Ponto p3;

    Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    Double calculaPerimentro(){
        return this.p1.calcularDistancia(this.p2) +
                this.p2.calcularDistancia(this.p3)+
                  this.p3.calcularDistancia(this.p1);
    }
}
