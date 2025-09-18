package exemplos09;

public class Ponto {

    Double x;

    Double y;

    // Ponto p1 = new Ponto(); p1.x é zero, assim como p1.y é zero.
    Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    //Ponto p2 =new Ponto(20.0, 14.9)
    // p2.x é 20.0 e p2.y é 14.9
    Ponto(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    // distancia = SQRT( (x1-x2)^2 + (y1-y2)^2 )
    Double calcularDistancia(Ponto outroPonto){
        Double distancia = Math.pow(this.x - outroPonto.x, 2) +
                                Math.pow(this.y - outroPonto.y, 2);
        return Math.sqrt(distancia);
    }

}
