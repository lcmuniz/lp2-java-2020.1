package swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela7 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Janela7() {
		
		JButton botao1 = new JButton("Botão 1");
		JButton botao2 = new JButton("Botão 2");
		JButton botao3 = new JButton("Botão 3");
		JButton botao4 = new JButton("Botão 4");
		JButton botao5 = new JButton("Botão 5");
		JButton botao6 = new JButton("Botão 6");
		JButton botao7 = new JButton("Botão 7");
		JButton botao8 = new JButton("Botão 8");
		JButton botao9 = new JButton("Botão 9");

		
		ImageIcon image = new ImageIcon("iconeapp.png");
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		
		this.add(botao1);
		this.add(botao2);
		this.add(botao3);
		this.add(botao4);
		this.add(botao5);
		this.add(botao6);
		this.add(botao7);
		this.add(botao8);
		this.add(botao9);

		this.setVisible(true); // tornar a janela visivel
		
	}

}
