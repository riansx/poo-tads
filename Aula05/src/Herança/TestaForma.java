package Herança;

public class TestaForma {

    public static void main(String[] args) {
            
        Triangulo triangulo = new Triangulo("Triangulo");
        triangulo.setLado(5);
        triangulo.setAltura(5);
        
        System.out.println("Area do Triangulo = "+triangulo.area());
        
        Retangulo retangulo = new Retangulo("Retangulo");
        retangulo.setLado(5);
        retangulo.setAltura(5);
        
        System.out.println("Area do Retangulo = "+retangulo.area());
        
        Circulo circulo = new Circulo("Circulo");
        circulo.setLado(5);
        
        
        System.out.println("Area do Circulo = "+circulo.area());
        
    }
    
}
