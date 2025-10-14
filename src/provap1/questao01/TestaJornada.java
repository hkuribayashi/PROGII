package provap1.questao01;

public class TestaJornada {

    public static void main(String[] args) {

        Professor p1 = new Professor(12233, "Hugo");
        Discente d1 = new Discente(1111, "jajaj", 1, p1);
        Artigo a1 = new Artigo(34, "Titulo", "Descricao", d1);
        Apresentacao ap1 = new Apresentacao(1, "Sala1", "9h", a1);


    }
}
