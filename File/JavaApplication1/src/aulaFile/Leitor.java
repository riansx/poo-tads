import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	public static String ler(File arquivo) {
		StringBuffer sb = new StringBuffer();
		try {
			FileReader reader = new FileReader(arquivo);
			int c;
			do {
				c = reader.read();
				if (c!=-1) {
					sb.append( (char)c );
				}
			} while (c != -1);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
