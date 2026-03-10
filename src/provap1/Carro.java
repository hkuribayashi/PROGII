package provap1;

public class Carro {

    private int anoFabricacao;
    private Motor motor;
    private Pessoa proprietario;

    public void setAnoFabricacao(int novoAnoFabricacao){
        this.anoFabricacao = novoAnoFabricacao;
    }

    public void setMotor(Motor novoMotor){
        this.motor = novoMotor;
    }

    public void setProprietario(Pessoa novoProprietario){
        this.proprietario = novoProprietario;
    }

    public int getAnoFabricacao(){
        return this.anoFabricacao;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public Pessoa getProprietario(){
        return this.proprietario;
    }

}
