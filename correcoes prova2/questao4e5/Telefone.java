package questao4e5;

public class Telefone {
    private int ddi, ddd, numero;

    public Telefone(int ddi, int ddd, int numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String toString(){
        return "+" + ddi + "(" + ddd + ")" + numero;
    }
}
