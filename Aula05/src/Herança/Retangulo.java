package Herança;


public class Retangulo extends Forma {

    private int altura;
    
    public Retangulo(String nm){
        super(nm);
    }

    public void setAltura(int alt) {
        altura = alt;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public float area(){
        return (float) getLado() * altura;
    }

}
