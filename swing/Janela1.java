package swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela1 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Janela1() {
		
		ImageIcon image = new ImageIcon("iconeapp.png");
		
		this.setSize(500, 500);  // tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar a aplicação ao clicar no X
		this.setTitle("Minha Aplicação"); // titulo da janela
		this.setIconImage(image.getImage()); // icone da janela
		
		this.setVisible(true); // tornar a janela visivel
		
	}

}
