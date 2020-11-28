package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Janela2 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Janela2() {
		
		Border border = BorderFactory.createLineBorder(Color.green, 5);
		
		ImageIcon image = new ImageIcon("iconeapp.png");

		JLabel texto = new JLabel();
		texto.setText("Esta é minha mensagem");
		texto.setIcon(image);
		texto.setHorizontalTextPosition(JLabel.CENTER);
		texto.setVerticalTextPosition(JLabel.TOP);
		texto.setBackground(Color.blue);
		texto.setOpaque(true);
		texto.setBorder(border);
		texto.setHorizontalAlignment(JLabel.CENTER);
		//texto.setVerticalAlignment(JLabel.BOTTOM);
		texto.setForeground(Color.white);
		texto.setFont(new Font("Arial", Font.BOLD, 20));
		texto.setBounds(50, 100, 300, 200);
		
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		this.getContentPane().setBackground(new Color(250,128,114));
		this.setLayout(null);
		
		this.add(texto);
		
		this.setVisible(true); // tornar a janela visivel
		//this.pack();
		
	}

}
