import java.io.File;

public class UsoLeitor {
	public static void main(String[] args) {
		File arquivo = new File("MeuTexto.txt");
		String s = Leitor.ler(arquivo);
		System.out.println(s);
	}
}
