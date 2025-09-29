package exemplos09;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;

    Conta(Integer n, String nomeTitular) {
        this.numero = n;
        this.titular = nomeTitular;
        this.saldo = 0.0;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
        } else {
            this.saldo += valor;
        }
    }

    void sacar(double valor) {
       if (valor <= 0) {
           System.out.println("Impossivel, valor incorreto!");
       }else if(valor > this.saldo) {
           System.out.println("Impossivel, valor insuficiente!");
       }else{
           this.saldo -= valor;
           System.out.println("Saque realizado com sucesso!");
       }
    }
    
    Double qualMeuSaldo(){
        return this.saldo;
    }

    String qualNomeTitular(){
        return this.titular;
    }

    Integer qualNumeroConta(){
        return this.numero;
    }
}
