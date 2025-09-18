package exemplos09;

import java.util.Scanner;

public class TestadorDeGatos2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Gato x = new Gato();

        System.out.println("Digite o nome do gato: ");
        x.nome = leitor.nextLine();
        System.out.println("Digite a quantidade de comida: ");
        x.qtdComidaDisponivel = leitor.nextInt();
        System.out.println("Está com sono? (true/false): ");
        x.estaComSono = leitor.nextBoolean();

        System.out.println(x.nome);
        System.out.println(x.qtdComidaDisponivel);

        if (x.estaComSono) {
            System.out.println("O gato "+x.nome+" está com sono!");
        }else{
           System.out.println("O gato "+x.nome+" não está com sono!");
        }

    }
}