
import java.util.Scanner;

public class Soma2Num {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int a, b, soma;

        System.out.println("Programa para somar dois numeros\n\n");
        System.out.println("Digite os valores");
        System.out.print("a=");
        a = entrada.nextInt();
        System.out.print("b=");
        b = entrada.nextInt();
        soma = a + b;
        System.out.printf("A soma e %d\n", soma);
    }
}
