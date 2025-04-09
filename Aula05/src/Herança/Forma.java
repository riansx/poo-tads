package Herança;

public class Forma {
    
    private String nome;
    private int lado;
    
    public Forma(String nm){
        nome = nm;
    }
    
    public void setNome(String nome2){
        nome = nome2;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setLado(int vlr){
        lado = vlr;
    }
    
    public int getLado(){
        return lado;
    }    
}
