package br.unifesspa;

/**
 * Classe Animal
 * @author Hugo Kuribayashi
 */
public class Animal {
    private String nome;
    private int idade;

    /**
     * Método construtor que cria um animal ao informar o nome e a idade do animal.
     * @param nome
     * @param idade
     */
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Método genérico que demonstra que o animal está se movendo.
     */
    public void mover() {
        System.out.println(nome + " está se movendo de forma genérica.");
    }

    /**
     * Método genérico que demonstra que o animal está emitindo um som.
     */
    public void emitirSom() {
        System.out.println("Som genérico de animal.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

