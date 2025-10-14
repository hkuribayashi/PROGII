package exemplos10;

public class Conta2 {
    private Integer numero;
    private Cliente2 titular;
    private Double saldo;

    public Conta2(Integer n, Cliente2 t) {
        this.numero = n;
        this.titular = t;
        this.saldo = 0.0;
    }

    Double getSaldo(){
        return this.saldo;
    }

    void setTitular(Cliente2 novoTitular){
        this.titular = novoTitular;
    }

    Cliente2 getTitular(){
        return this.titular;
    }

    void setNumero(Integer novoNumero){
        this.numero = novoNumero;
    }

    Integer getNumero(){
        return this.numero;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
        } else {
            this.saldo += valor;
        }
    }

    void sacarVersao2(Double valorSaque){
        if (valorSaque <= 0) {
            throw new RuntimeException("Valor de saque invalido");
        }else if (valorSaque > this.saldo) {
            throw new RuntimeException("Valor de saque excedido");
        }else {
            this.saldo -= valorSaque;
        }
    }

    Boolean sacar(Double valor) {
        if (valor <= 0) {
            System.out.println("Impossivel, valor incorreto!");
            return false;
        }else if(valor > this.saldo) {
            System.out.println("Impossivel, valor insuficiente!");
            return false;
        }else{
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }
    }

    void fazerPix(Conta contaDestino, Double valor){
        if(this.sacar(valor))
            contaDestino.depositar(valor);
    }


}
