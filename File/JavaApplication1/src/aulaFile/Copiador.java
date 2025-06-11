import java.io.File;

public class Copiador {
	public static void main(String[] args) {
		File entrada = new File("MeuTexto.txt");
		File saida = new File("MeuTextoCopiado.txt");
		String s = Leitor.ler(entrada);
		Escritor.escreve(saida, s);
	}

}
