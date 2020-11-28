package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela9 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	
	
	Janela9() {
		
		JLabel mensagem = new JLabel();
		mensagem.setFont(new Font("Arial", Font.BOLD, 20));

		JTextField nome = new JTextField();
		nome.setPreferredSize(new Dimension(300,30));
		nome.setFont(new Font("Arial", Font.BOLD, 20));

		JButton enviar = new JButton("Enviar");
		enviar.addActionListener(e -> {
			mensagem.setText("Olá, " + nome.getText() + "!");
		});
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());

		panel1.add(nome);
		panel1.add(enviar);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(mensagem);

		ImageIcon image = new ImageIcon("iconeapp.png");
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		this.setLayout(new GridLayout(3,3, 10, 10));
		
		this.add(panel1);
		this.add(panel2);
		this.setVisible(true);


	}
	
	
}
