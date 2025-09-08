public class Gato {
    String nome;
    Integer qtdComidaDisponivel;
    Boolean estaComSono;
    Boolean estaCansado;

    void dormir() {
        estaComSono = false;
        estaCansado = false;
    }

    void correr(){
        estaCansado = true;
    }

    void comer(){
        if (qtdComidaDisponivel > 0) {
            qtdComidaDisponivel--;
        }
    }
}
