package exheranca;

public class Conta {
    
    public Conta(String nomeCorrentista, String conta){
        noConta = conta;
        correntista = nomeCorrentista;
    }

    private String correntista;
    private String noConta;
    protected double saldo;

    public String getCorrentista() {
        return correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNoConta() {
        return noConta;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public boolean saque(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
        boolean operacao = false;
        if (saldo >= valor) {
            operacao = true;
            saldo -= valor;
        }
        return operacao;
    }
    
    
}
