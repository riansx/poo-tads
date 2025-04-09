
package extriangulo;
import java.util.Scanner;


public class ExTriangulo {
    
    public static void tipoTriangulo(float a, float b, float c){
        if(a == b && b == c)
            System.out.println("Triangulo Equilatero");
        else if(a == b || b == c || a == c)
            System.out.println("Triangulo Isosceles");
        else
            System.out.println("Triangulo Escaleno");
    }
    
    public static void verificaTriangulo(float a, float b, float c){
        if(a<b+c && b<a+c && c<b+a)
            tipoTriangulo(a, b, c);
        else
            System.out.println("Os numeros nao formam um triangulo");
            }
            
    
    public static void main(String[] args) {
        
        /* Dados três valores para os lados (A, B e C) de um triângulo verificar e informar se
estes valores formam um triângulo (A<B+C e B<A+C e C<B+A) ou não. Em
caso verdadeiro, informe se é um triângulo eqüilátero (A==B e B==C), isósceles (A==B ou B==C ou A==C) ou escaleno (todos os lados diferentes). */
        
        Scanner scanner = new Scanner(System.in);
        
        float a, b, c;
        
        System.out.println("Digite o valor de a: ");
        a = scanner.nextFloat();
        System.out.println("Digite o valor de b: ");
        b = scanner.nextFloat();
        System.out.println("Digite o valor de c: ");
        c = scanner.nextFloat();
        
        verificaTriangulo(a,b,c);
        
        
        
        
        
        
    }
    
}
