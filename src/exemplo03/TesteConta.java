package exemplo03;

import java.time.LocalDate;

public class TesteConta {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        Cliente c1 = new Cliente("Hugo Pereira Kuribayashi",
                                  data,
                                "hugo@unifesspa.edu.br",
                                "91991019191");

        Conta cc1 = new Conta("15671", c1);
        cc1.criarNovaChavePix("h1-0-1921-029210291-29-00q");
        cc1.criarNovaChavePix("8273912873");
        cc1.depositar(200.0);

        Conta cc2 = new Conta("15672", c1);
        cc2.criarNovaChavePix("hugo@gmail.com");
        cc2.depositar(150.0);

        //Antes da Transferencia
        System.out.println("Saldo de CC1: "+cc1.getSaldo());
        System.out.println("Saldo de CC2: "+cc2.getSaldo());

        cc1.transferir(cc2, 20.0);

        System.out.println("Saldo de CC1: "+cc1.getSaldo());
        System.out.println("Saldo de CC2: "+cc2.getSaldo());
    }

}
