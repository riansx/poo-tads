
public class Retangulo extends Forma {

    private int altura;

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
