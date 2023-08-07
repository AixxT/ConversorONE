package conversor.modelo;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Conversor extends JFrame {

	private static WelcomePanel welcome;

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
		welcome = new WelcomePanel();

		mainPanel.add(welcome);
		mainPanel.add(header, BorderLayout.NORTH);
		mainPanel.add(footer, BorderLayout.SOUTH);

		mainPanel.setVisible(true);
	}

	public static WelcomePanel getWelcome() {
		return welcome;
	}

	public static String conversion(double amount, String unidades) {

		return null;
	}

	public static boolean validarInput(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x > 0) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
