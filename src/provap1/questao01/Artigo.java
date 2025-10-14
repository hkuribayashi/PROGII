package provap1.questao01;

public class Artigo {

    Integer numero;
    String titulo;
    String descricao;
    Discente autor;

    Artigo(Integer m, String t, String d, Discente a)
    {
        this.numero = m;
        this.titulo = t;
        this.descricao = d;
        this.autor = a;
    }
}
