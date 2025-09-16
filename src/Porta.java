public class Porta {
    //true se a porta está aberta e false caso contrário
    Boolean aberta;
    String cor;
    Double dimensaoX;
    Double dimensaoY;
    Double dimensaoZ;

    void abrirPorta() {
        aberta = true;
    }

    void fecharPorta() {
        aberta = false;
    }

    void pintarPorta(String novaCor) {
        cor = novaCor;
    }

}
