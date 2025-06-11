import java.io.File;

public class CopiadorBuffer {
	public static void main(String[] args) {
		File entrada = new File("MeuTexto.txt");
		File saida = new File("MeuTexto2.txt");
		String s = LeitorBuffer.ler(entrada);
		EscritorBuffer.escreve(saida, s);
	}
}
