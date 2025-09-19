package exemplos09;

public class TestaPais {

    public static void main(String[] args) {
        Pais p1 = new Pais("BRA", "Brasil", 8000, 100.0);
        Pais p2 = new Pais("CHI", "Chile", 8000, 100.0);
        Pais p3 = new Pais("ARG", "Argentina", 8000, 100.0);
        
        p1.vizinhos.add(p3);
        p3.vizinhos.add(p2);
        

        
    }
}
