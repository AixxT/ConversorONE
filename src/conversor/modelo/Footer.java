package conversor.modelo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Footer extends JPanel {
	
	public Footer() {
		ImageIcon linkedInIcon = new ImageIcon(
				"C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/linkedIn.png");

		this.setBackground(new Color(0x0D0E25));
		this.setPreferredSize(new Dimension(0, 30));

		JLabel creator = new JLabel("Aixa Turlan");
		creator.setIcon(linkedInIcon);
		creator.setForeground(new Color(0xFFD4AD));
		creator.setVerticalTextPosition(JLabel.CENTER);
		creator.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		creator.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {

					Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/aixa-turlan/"));

				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		this.add(creator);
	}
}
