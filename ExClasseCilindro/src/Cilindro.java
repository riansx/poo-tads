public class Cilindro {
    
    
    private double altura;
    private double raio;
    
    public Cilindro(double r, double alt){
        raio = r;
        altura = alt;
    }
    
    public void setAltura(double alt){
        altura = alt;
    }
    
    public void setRaio(double r){
        raio = r;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double calcAreaBase(){
        double base = Math.PI * Math.pow(raio, 2);
        return base;
    }
    
    public double calcVolume(){
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }
    
}
