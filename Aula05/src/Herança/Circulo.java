package Herança;

public class Circulo extends Forma {
    
    public Circulo(String nm){
        super(nm);
    }
    
    
    public double area(){
        return Math.PI * Math.pow(getLado(),2);
    }
}
