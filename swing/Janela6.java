package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela6 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Janela6() {
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
				
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.pink);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		// ----------------
		
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		
		panel6.setBackground(Color.darkGray);
		panel7.setBackground(Color.magenta);
			
		panel6.setPreferredSize(new Dimension(100,100));
		panel7.setPreferredSize(new Dimension(100,100));
		
		
		panel5.setLayout(new BorderLayout());
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.EAST);
		
		ImageIcon image = new ImageIcon("iconeapp.png");
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		//this.setLayout(new BorderLayout(10, 10));
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.WEST);
		this.add(panel3, BorderLayout.EAST);
		this.add(panel4, BorderLayout.SOUTH);
		this.add(panel5, BorderLayout.CENTER);
		
		this.setVisible(true); // tornar a janela visivel
		
	}

}
