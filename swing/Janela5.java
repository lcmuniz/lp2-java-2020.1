package swing;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela5 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private int contador = 0;

	Janela5() {
		
		ImageIcon image = new ImageIcon("iconeapp.png");
		
		JLabel mensagem = new JLabel();
		mensagem.setFont(new Font("Arial", Font.BOLD, 25));
		mensagem.setText("O botão foi clicado 0 vezes");
		mensagem.setBounds(50, 200, 400, 50);
		// mensagem.setVisible(false);
		
		JButton botao = new JButton();
		botao.setText("Me Clique");
		botao.setFocusable(false);
		botao.setBounds(50,50, 200, 100);
		botao.setIcon(image);
		botao.setHorizontalTextPosition(JButton.CENTER);
		botao.setVerticalTextPosition(JButton.BOTTOM);
		
		botao.addActionListener( event -> {
			System.out.println("Fui clicado!");
			contador = contador + 1;
			if (contador == 1) {
				mensagem.setText("O botão foi clicado " + contador + " vez");
			}
			else {
				mensagem.setText("O botão foi clicado " + contador + " vezes");
			}
			// mensagem.setVisible(true);
		});
		
		JPanel panel1 = new JPanel();
		
		
		panel1.add(botao);
		panel1.add(mensagem);
		panel1.setLayout(null);
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		
		this.add(panel1);
		
		this.setVisible(true); // tornar a janela visivel
		
	}

}
