package questao4e5;

public class Pessoa  {
    private String nome;
    private Telefone fone;

    public Pessoa(String nome, Telefone fone){
        this.nome = nome;
        this.fone = fone;
    }

    public Pessoa(String nome, int ddi, int ddd, int numero){
        this.nome = nome;
        fone = new Telefone(ddi, ddd, numero);
    }

    public String toString(){
        return "Nome: "+nome + "\nTelefone:" +fone.toString();
    }
}
