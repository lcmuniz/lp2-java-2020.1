package swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SegundaJanela {

	
	public SegundaJanela() {
		
		JLabel label = new JLabel("Boa noite");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JFrame frame = new JFrame();
		frame.setTitle("Segunda Janela");
		frame.setSize(500,500);
		frame.add(label);
		
		frame.setVisible(true);
		
	}

}
