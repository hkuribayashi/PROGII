package provap1;

public class TestaCarro {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome("Hugo");
        p.setSobrenome("Kuribayashi");
        p.setEmail("hugo@unifesspa.edu.br");

        Motor m = new Motor();
        m.setFabricante("Honda");
        m.setPotencia(100.0);

        Carro c = new Carro();
        c.setAnoFabricacao(2025);
        c.setMotor(m);
        c.setProprietario(p);

    }

}