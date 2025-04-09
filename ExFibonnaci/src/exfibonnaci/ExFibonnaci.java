
package exfibonnaci;
import java.util.Scanner;

public class ExFibonnaci {
    
    public static int fib(int n){
        if (n == 1 || n == 2)
            return 1;
        else 
            return fib(n - 2) + fib(n - 1);
}
    
    public static void main(String[] args) {

        /* Gerar a série de Fibonacci que é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13, 21, ... 
A quantidade de número da série o usuário informará. */
        
        Scanner scanner = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite quantos numeros da serie de Fibonnaci voce deseja ver: ");
        n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.printf("%d ", fib(i));
        }
    }
    
}
