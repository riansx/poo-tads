package aulaFile;

import java.io.File;

public class UsoDoFile {
	public static void main(String[] args) {
		File arquivo = new File("MeuTexto.txt");
		System.out.println("Nome: " + arquivo.getName());
		System.out.println("Caminho: " + arquivo.getAbsolutePath());
		
		System.out.println("Existe? " + arquivo.exists());
		System.out.println("eh um diretorio? " + arquivo.isDirectory());
		System.out.println("eh um arquivo? " + arquivo.isFile());
		System.out.println("Pode ser lido? " + arquivo.canRead());
		System.out.println("Pode ser escrito? " + arquivo.canWrite());
	}
}