package Herança;

public class Triangulo extends Forma{
    
    
    private int altura;
    
    public Triangulo (String nm){
        super (nm);
    }
        
    public void setAltura (int al){
        altura = al;
    }
    
    public float area(){
        return (float) (getLado()*altura) / 2;
    }
}
