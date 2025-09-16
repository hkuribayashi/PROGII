public class TestadorPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.idade = 20;
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        Pessoa p2 = new Pessoa();
        p2.nome = "Jonatas";
        p2.idade = 30;

        System.out.println(p1.nome);
        System.out.println(p1.idade);

    }
}
