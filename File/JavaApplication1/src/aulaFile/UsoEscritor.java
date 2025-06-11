import java.io.File;

public class UsoEscritor {
	public static void main(String[] args) {
		File arquivo = new File("Saida.txt");
		String texto = "Este texto será gravado!\r\n"+
						"Linha dois\r\n"+
						"testando mais um pouco\r\n";
		Escritor.escreve(arquivo, texto);
	}
}
