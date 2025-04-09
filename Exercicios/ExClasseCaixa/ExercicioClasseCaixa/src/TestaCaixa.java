
import java.util.Scanner;
public class TestaCaixa {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        Caixa caixa = new Caixa(0, 0, 0);
        
        int numero;

        System.out.println("Digite o valor da largura da caixa: ");
        numero = scanner.nextInt();
        caixa.setLargura(numero);
        
        System.out.println("Agora digite o valor da altura da caixa: ");
        numero = scanner.nextInt();
        caixa.setAltura(numero);
        
        System.out.println("Digite o valor da profunidade da caixa: ");
        numero = scanner.nextInt();
        caixa.setProfundidade(numero);
        
        System.out.println("Calculo do volume da caixa: "+caixa.calcVolume());
        
    
    }
}
