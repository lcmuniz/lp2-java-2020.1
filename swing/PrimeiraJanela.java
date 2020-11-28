package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrimeiraJanela {
	
	private static SegundaJanela segundaJanela;

	public static void main(String[] args) {

		JButton botao = new JButton("Abrir Segunda Janela");
		//botao.setHorizontalAlignment(JButton.CENTER);
		//botao.setVerticalAlignment(JButton.CENTER);
		botao.setBounds(150,100,200,50);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(botao);
		
		botao.addActionListener(e -> {
			if (segundaJanela == null) {
				segundaJanela = new SegundaJanela();
			}
		});
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Primeira Janela");
		frame.setSize(500,500);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
