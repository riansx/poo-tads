import java.awt.Container;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LeitorSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Mundo Java");
		JTextArea textArea = new JTextArea();
	    JScrollPane scrollPane = new JScrollPane(textArea);    
	    Container container = frame.getContentPane();
		container.add(scrollPane);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		File arquivo = new File("MeuTexto.txt");
		String s = LeitorBuffer.ler(arquivo);
		textArea.append ( s );
	}
}
