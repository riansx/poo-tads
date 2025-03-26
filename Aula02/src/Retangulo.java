import java.lang.Math;

public class Retangulo {
    double largura, altura;
    
    //Construtor
    Retangulo(double l, double a){
        inicia(l, a);
    }
    void inicia(double lar, double alt){
        largura = lar;
        altura = alt;
    }
    
    double area(){
        return largura*altura;
    }
    
    double diagonal(double largura, double altura){
        double diagonal = (largura * largura) + (altura * altura);
        diagonal*=diagonal;
        return diagonal;
    }
    
    /* double diagonal(){
        return Math.sqrt();
        Math.pow(altura,2) + Math.pow(largura,2);
    }
    */
    double retornarAltura(){
        return altura;
    }
    
    double retornarLargura(){
        return largura;
    }
}
