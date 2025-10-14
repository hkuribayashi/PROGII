package exemplos10;

import java.util.Scanner;

public class TestaConta {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Criando a primeira conta");

        System.out.println("Informe o número da conta:");
        Integer numero = leitor.nextInt();
        System.out.println("Informe o nome do titular da conta:");
        String nome = leitor.next();
        System.out.println("Informe a data de nascimento do titular da conta:");
        String data = leitor.next();
        System.out.println("Informe o email do titular da conta:");
        String email = leitor.next();

        Cliente c1 = new Cliente(nome, data, email);
        Conta conta1 = new Conta(numero, c1);

        System.out.println("Criando a segunda conta");
        System.out.println("Informe o numero da conta:");
        numero = leitor.nextInt();
        System.out.println("Informe o nome do titular da conta:");
        nome = leitor.next();
        System.out.println("Informe a data de nascimento do titular:");
        data = leitor.next();
        System.out.println("Informe o email do titular da conta:");
        email = leitor.next();

        Cliente c2 = new Cliente(nome, data, email);
        Conta conta2 = new Conta(numero, c2);

        System.out.println("Informe o valor de depósito na Conta 1:");
        Double valorDeposito = leitor.nextDouble();
        conta1.depositar(valorDeposito);

        System.out.println("Informe o valor de depósito na Conta 2:");
        valorDeposito = leitor.nextDouble();
        conta2.depositar(valorDeposito);

        System.out.println("Valor de Pix da Conta 1 para a Conta 2");
        Double valorPix = leitor.nextDouble();
        conta1.fazerPix(conta2, valorPix);

        System.out.println("Conta 1");
        System.out.println("Titular: " + conta1.getTitular().getNome());
        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.println("Conta 2: ");
        System.out.println("Titular: " + c2.getNome());
        System.out.println("Saldo: " + conta2.getSaldo());

    }
}