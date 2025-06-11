package aulaFile;

import java.io.File;

public class InformacaoSistema {
	public static void main(String[] args) {
		System.out.println ("Separador de Path: " + File.pathSeparator);
		System.out.println ("Separador de Diretrio: " + File.separator);
		
		File discos [] = File.listRoots();
		for (int cont=0; cont<discos.length; cont++) {
			System.out.println ("Disco " + cont + ": " + discos[cont]);
		}		
	}
}
