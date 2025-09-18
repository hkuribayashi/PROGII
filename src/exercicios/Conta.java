package exercicios;

import java.time.LocalDate;

public class Conta {

    String nomeTitular;
    Integer numero;
    String agencia;
    Double saldo;
    String dataAbertura;

    Conta(String nome, String agencia, Integer numeroConta){
        this.nomeTitular = nome;
        this.agencia = agencia;
        this.numero = numeroConta;
        this.saldo = 0.0;
        this.dataAbertura = LocalDate.now().toString();
    }

    Boolean sacar(Double valorSaque) {
        if (valorSaque <= this.saldo && valorSaque > 0) {
            this.saldo = this.saldo - valorSaque;
            return true;
        } else return false;
    }

    Boolean depositar(Double valorDeposito) {
        if (valorDeposito > 0){
            this.saldo = this.saldo + valorDeposito;
            return true;
        }else return false;
    }

    Double calcularRendimento(){
        return this.saldo * 0.1;
    }

    String recuperaDadosParaImpressao(){
        String dadosImpressao = "Nome: "+this.nomeTitular+" \n";
        dadosImpressao += "Agencia: "+this.agencia+" \n";
        dadosImpressao += "Numero: "+this.numero+" \n";
        dadosImpressao += "Saldo: "+this.saldo+" \n";
        dadosImpressao += "Data Abertura: "+this.dataAbertura+" \n";
        dadosImpressao += "Rendimento: "+this.calcularRendimento();
        return dadosImpressao;
    }
}