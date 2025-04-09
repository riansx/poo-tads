package exserien;
import java.util.Scanner;

public class ExSerieN {
    
    public static float serieN(int n){
        int num = 1;
        float soma = 0;
        for(int i = 1; i <= n; i++){
            soma += (float) num/i;
        }
        return soma;
    }
    
    public static void main(String[] args) {
        
        /* Gerar e imprimir a série 1 +
1/2 + 1/3 + 1/4 + ... + 1/N, onde N é um número fornecido pelo usuário.
Além de imprimir mostrar o resutaldo do calculo da séris no final. */
        
        Scanner scanner = new Scanner(System.in);
        
        int n;
       
        
        System.out.println("Digite quantas vezes voce deseja calcular a serie: ");
        n = scanner.nextInt();
        
        System.out.printf("%.2f", serieN(n));
        
       
    }
    
}
