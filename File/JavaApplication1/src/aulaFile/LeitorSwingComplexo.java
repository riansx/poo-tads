import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LeitorSwingComplexo {
	private static JTextArea textArea;
	private static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("Mundo Java");
		JPanel p = new JPanel(new BorderLayout());
		textArea = new JTextArea();
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    p.add(scrollPane, BorderLayout.CENTER);
	    JButton button = new JButton("Abrir Arquivo");
	    button.addActionListener(new AcaoLeitura());
	    p.add(button, BorderLayout.SOUTH);
	    Container container = frame.getContentPane();
	    container.add(p);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	static class AcaoLeitura implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fileChooser = new JFileChooser(".");
			fileChooser.showOpenDialog(frame);
			File arquivo = fileChooser.getSelectedFile();
			if (arquivo!=null) {
				textArea.setText("");
				String s = LeitorBuffer.ler(arquivo);
				textArea.append ( s );
			}
		}
	}
}
