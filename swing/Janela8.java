package swing;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela8 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	boolean fim = false;

	private String vez = "X";
	
	private JButton botao1 = new JButton("");
	private JButton botao2 = new JButton("");
	private JButton botao3 = new JButton("");
	private JButton botao4 = new JButton("");
	private JButton botao5 = new JButton("");
	private JButton botao6 = new JButton("");
	private JButton botao7 = new JButton("");
	private JButton botao8 = new JButton("");
	private JButton botao9 = new JButton("");
	
	Janela8() {
		
		Font font = new Font("Arial", Font.BOLD, 40);

		botao1.setFont(font);
		botao2.setFont(font);
		botao3.setFont(font);
		botao4.setFont(font);
		botao5.setFont(font);
		botao6.setFont(font);
		botao7.setFont(font);
		botao8.setFont(font);
		botao9.setFont(font);
		
		botao1.addActionListener(event -> clicar(botao1));
		botao2.addActionListener(event -> clicar(botao2));
		botao3.addActionListener(event -> clicar(botao3));
		botao4.addActionListener(event -> clicar(botao4));
		botao5.addActionListener(event -> clicar(botao5));
		botao6.addActionListener(event -> clicar(botao6));
		botao7.addActionListener(event -> clicar(botao7));
		botao8.addActionListener(event -> clicar(botao8));
		botao9.addActionListener(event -> clicar(botao9));

		ImageIcon image = new ImageIcon("iconeapp.png");
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		this.setLayout(new GridLayout(3,3, 10, 10));
		
		this.add(botao1);
		this.add(botao2);
		this.add(botao3);
		this.add(botao4);
		this.add(botao5);
		this.add(botao6);
		this.add(botao7);
		this.add(botao8);
		this.add(botao9);
		//this.add(new JButton("10"));
		
		this.setVisible(true); // tornar a janela visivel
		
	}
	
	private void clicar(JButton botao) {
		if (fim) {
			JOptionPane.showMessageDialog(null, "O jogo já acabou!");
			return;
		}
		
		if (!botao.getText().equals("")) return;
		botao.setText(vez);
		if (vez.equals("X")) {
			vez = "O";
		}
		else {
			vez = "X";
		}
		verificarFim();
	}
	
	private void verificarFim() {
		String vencedor = "";
		if (vez.equals("X")) {
			vencedor = "O";
		}
		else {
			vencedor = "X";
		}
		if (!botao1.getText().equals("") && 
				botao1.getText().equals(botao2.getText()) && 
				botao1.getText().equals(botao3.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}
		
		if (!botao4.getText().equals("") && 
				botao4.getText().equals(botao5.getText()) && 
				botao4.getText().equals(botao6.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}
		
		if (!botao7.getText().equals("") && 
				botao7.getText().equals(botao8.getText()) && 
				botao7.getText().equals(botao9.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}

		if (!botao1.getText().equals("") && 
				botao1.getText().equals(botao4.getText()) && 
				botao1.getText().equals(botao7.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}

		if (!botao2.getText().equals("") && 
				botao2.getText().equals(botao5.getText()) && 
				botao2.getText().equals(botao8.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}

		if (!botao3.getText().equals("") && 
				botao3.getText().equals(botao6.getText()) && 
				botao3.getText().equals(botao9.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}

		if (!botao1.getText().equals("") && 
				botao1.getText().equals(botao5.getText()) && 
				botao1.getText().equals(botao9.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}

		if (!botao3.getText().equals("") && 
				botao3.getText().equals(botao5.getText()) && 
				botao3.getText().equals(botao7.getText())) {
			fim = true;
			JOptionPane.showMessageDialog(null, "O vencedor foi: " + vencedor);
		}

	}
	
	
}
