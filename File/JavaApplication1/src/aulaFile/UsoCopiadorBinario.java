import java.io.File;

public class UsoCopiadorBinario {
	public static void main(String[] args) {
		File entrada = new File("figura.jpg");
		File saida = new File("ImagemCopiada.jpg");
		System.out.println("Iniciando a c�pia");
		CopiadorBinario.copia(entrada, saida);
		System.out.println("C�pia concluida");
	}
}
