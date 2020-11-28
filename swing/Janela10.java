package swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela10 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Janela10() {
		
		JButton botao = new JButton("Clique Me");
		
		botao.addActionListener(e -> {
			
			//JOptionPane.showMessageDialog(null, "Bom fim de semana!", "Minha Mensagem", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMessageDialog(null, "Bom fim de semana!", "Minha Mensagem", JOptionPane.ERROR_MESSAGE);
			// JOptionPane.showMessageDialog(null, "Bom fim de semana!", "Minha Mensagem", JOptionPane.WARNING_MESSAGE);
			// JOptionPane.showMessageDialog(null, "Bom fim de semana!", "Minha Mensagem", JOptionPane.INFORMATION_MESSAGE);
			// JOptionPane.showMessageDialog(null, "Bom fim de semana!", "Minha Mensagem", JOptionPane.QUESTION_MESSAGE);
			
			
			// int resposta = JOptionPane.showConfirmDialog(null,  "Quer sobremesa?", "Pergunta", JOptionPane.YES_NO_CANCEL_OPTION);
			// System.out.println(resposta);
			
			// String nome = JOptionPane.showInputDialog("Digite seu nome");
			
			// System.out.println(nome);
			
			ImageIcon icon = new ImageIcon("iconeapp.png");
			String[] respostas = {"Legal", "Mais ou Menos", "Péssimo"};
			
			int resp = JOptionPane.showOptionDialog(null, "Acha cinema legal?", "Cinema", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respostas, 0);
			System.out.println(resp);
			
		});
		
		ImageIcon image = new ImageIcon("iconeapp.png");
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		this.setLayout(new FlowLayout());
		this.add(botao);
		
		this.setVisible(true); // tornar a janela visivel
		
	}

}
