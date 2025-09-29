package exemplos09;

public class ContaAntiga {

    Integer numero;
    String titular;
    Double saldo;

    ContaAntiga(String t, Integer n, Double s){
        System.out.println("Criando uma nova conta de outro jeito..");
        this.numero = n;
        this.titular = t;
        this.saldo = s;
    }
}
