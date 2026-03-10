package exemplo03;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private String agencia;
    private String numero;
    private Double saldo;
    private List<String> chavesPix;
    private Cliente titular;

    public Conta(String numConta, Cliente t){
        this.agencia = "0001";
        this.numero = numConta;
        this.saldo = 0.0;
        this.chavesPix = new ArrayList<String>();
        this.titular = t;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void sacar(Double valorSaque){
        if (valorSaque <= this.saldo && valorSaque > 0)
            this.saldo = this.saldo - valorSaque;
    }

    public void depositar(Double valorDeposito){
        if (valorDeposito > 0)
            this.saldo = this.saldo + valorDeposito;
    }

    public void criarNovaChavePix(String novaChave){
        this.chavesPix.add(novaChave);
    }

    public void transferir(Conta outraConta, Double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            outraConta.saldo = outraConta.saldo + valor;
        }

    }
}
