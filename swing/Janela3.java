package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela3 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Janela3() {
		
		ImageIcon icon = new ImageIcon("iconeapp.png");
		
		JLabel label = new JLabel();
		label.setIcon(icon);
		label.setText("BOA NOITE");
		label.setForeground(Color.white);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);

		ImageIcon image = new ImageIcon("iconeapp.png");
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		this.setLayout(null);
		
		//bluePanel.setLayout(new BorderLayout());
		//bluePanel.add(label);
		
		redPanel.setLayout(new BorderLayout());
		redPanel.add(label);
		
		this.add(redPanel);
		this.add(bluePanel);
		this.add(greenPanel);
		
		this.setVisible(true); // tornar a janela visivel
		
	}

}
