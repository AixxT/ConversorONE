package conversor.modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Conversor extends JFrame {

	public static void generateGui() {

		JFrame mainPanel = new JFrame("Conversor ONE");
		ImageIcon appIcon = new ImageIcon("C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/appIcon.png");

		mainPanel.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainPanel.setSize(400, 300);
		mainPanel.setResizable(false);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setIconImage(appIcon.getImage());

		JPanel header = new Header();
		JPanel footer = new Footer();
		JPanel welcome = new WelcomePanel();
		
		mainPanel.add(welcome);
		mainPanel.add(header, BorderLayout.NORTH);
		mainPanel.add(footer, BorderLayout.SOUTH);

		mainPanel.setVisible(true);
	}

}
