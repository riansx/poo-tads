
import java.io.*;

public class CaixaSer {

    public static void main(String[] args) {
        Caixa caixa1 = new Caixa();
        caixa1.setAltura(10);
        caixa1.setLargura(20);
        caixa1.setProfundidade(30);
        try {
            FileOutputStream fs = new FileOutputStream("caixa.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(caixa1);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
