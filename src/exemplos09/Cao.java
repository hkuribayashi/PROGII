package exemplos09;

public class Cao {
    String nome;
    Integer qtdComidaDispoinivel;
    Boolean sono;

    Cao(){
        System.out.println("Olá Mundo!");
    }

    Cao (String n, Integer c, Boolean s){
        nome = n;
        qtdComidaDispoinivel = c;
        sono = s;
    }

    void dormir(){
        sono = false;
    }

    Integer comer(){
        qtdComidaDispoinivel--;
        return qtdComidaDispoinivel;
    }
}
