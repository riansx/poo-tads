public class Triangulo extends Forma{
    
    
    private int altura;
        
    public void setAltura (int al){
        altura = al;
    }
    
    public float area(){
        return (float) (getLado()*altura) / 2;
    }
}
