package exheranca;

public class ContaEspecial extends Conta {

    private double limiteCredito;

    public ContaEspecial(String nomeCorrentista, String conta, double valorLimite) {
        super(nomeCorrentista, conta);
        this.limiteCredito = valorLimite;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double valor) {
        this.limiteCredito = valor;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() + limiteCredito >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo e limite de crédito insuficientes.");
            return false;
        }
    }
}