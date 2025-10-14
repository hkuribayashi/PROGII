package provap1.questao01;

public class Discente {

    Integer matricula;
    String nome;
    Integer semestre;
    Professor orientador;

    Discente(Integer m, String n, Integer s, Professor p) {
        this.matricula = m;
        this.nome = n;
        this.semestre = s;
        this.orientador = p;
    }
}
