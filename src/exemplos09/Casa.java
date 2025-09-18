package exemplos09;

public class Casa {
   String cor;
   Porta porta1;
   Porta porta2;
   Porta porta3;
   Pessoa proprietario;

   void pintarCasa(String novaCorCasa){
       cor = novaCorCasa;
   }

   void pintarCasa(String novaCorCasa, String novaCorPorta){
       cor = novaCorCasa;
       porta1.pintarPorta(novaCorPorta);
       porta2.pintarPorta(novaCorPorta);
       porta3.pintarPorta(novaCorPorta);
   }

   Integer calcularQtdPortasAbertas(){
       Integer contadorPortasAbertas = 0;
       if (porta1.aberta)
           contadorPortasAbertas++;
       if (porta2.aberta)
           contadorPortasAbertas++;
       if (porta3.aberta)
           contadorPortasAbertas++;
       return contadorPortasAbertas;
   }

   void alterarProprietario(Pessoa novoProprietario){
       proprietario = novoProprietario;
   }


}
