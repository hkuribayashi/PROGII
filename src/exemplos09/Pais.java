package exemplos09;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    String codigo;
    String nome;
    Integer populacao;
    Double dimensao;
    List<Pais> vizinhos;

    public Pais(String c, String n, Integer p, Double d) {
        this.codigo = c;
        this.nome = n;
        this.populacao = p;
        this.dimensao = d;
        this.vizinhos = new ArrayList<Pais>();
    }

    //Um metodo que permita verificar se dois objetos representam o
    //mesmo país (igualdade semântica). Dois países são iguais se tiverem
    //o mesmo código;
    Boolean compararPaises(Pais outroPais){
        if (this.codigo.equals(outroPais.codigo))
            return true;
        return false;
    }

}
