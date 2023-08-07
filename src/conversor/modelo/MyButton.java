package conversor.modelo;

import java.awt.Cursor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MyButton extends JButton {
	
	public MyButton(ImageIcon icon) {
		
		this.setIcon(icon);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setContentAreaFilled(false);
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
	}
	
}
