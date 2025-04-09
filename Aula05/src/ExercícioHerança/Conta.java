package ExercícioHerança;

public class Conta {
    
    private String correntista;
    private String noConta;
    protected double saldo;
    
    
    
    public String getCorrentista(){
        return correntista;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getNoConta(){
        return noConta;
    }
    
    public void deposito(double valor){
        saldo += valor;    
    }
    
    public boolean saque(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        else
            return false;
    }
    
    
    
}
