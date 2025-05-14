import java.util.Scanner;
public class TestaCilindro {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cilindro cilindro = new Cilindro(10.5, 15.2);
        
   
        System.out.println(""+cilindro.calcAreaBase());
        System.out.println(""+cilindro.calcVolume());
        
        
        
    }
}
