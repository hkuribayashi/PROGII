package exemplos09;

public class Conta {

    Integer numero;
    String titular;
    Double saldo;

    Conta(String t, Integer n, Double s){
        System.out.println("Criando uma nova conta de outro jeito..");
        this.numero = n;
        this.titular = t;
        this.saldo = s;
    }
}
