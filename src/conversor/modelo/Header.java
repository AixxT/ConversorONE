package conversor.modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header extends JPanel {
	
	public Header() {
		
		JLabel headerLogo = new JLabel();
		JPanel logoLeftPanel = new JPanel();
		JPanel logoRightPanel = new JPanel();
		ImageIcon logoAlura = new ImageIcon(
				"C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/aluraIcon.png");

		this.setLayout(new BorderLayout());
		this.setBackground(new Color(0xFFD4AD));
		this.setPreferredSize(new Dimension(100, 70));

		headerLogo.setIcon(logoAlura);
		headerLogo.setVerticalAlignment(JLabel.CENTER);
		headerLogo.setHorizontalAlignment(JLabel.CENTER);

		logoLeftPanel.setPreferredSize(new Dimension(168, 70));
		logoRightPanel.setPreferredSize(new Dimension(168, 70));
		logoLeftPanel.setBackground(null);
		logoLeftPanel.setLayout(null);
		logoRightPanel.setBackground(null);
		logoRightPanel.setLayout(null);

		JPanel line1 = new JPanel();
		JPanel line2 = new JPanel();

		line1.setBounds(0, 32, 168, 6);
		line1.setBackground(new Color(0x0D0E25));
		line2.setBounds(0, 32, 168, 6);
		line2.setBackground(new Color(0x0D0E25));

		logoLeftPanel.add(line1);
		logoRightPanel.add(line2);

		this.add(logoRightPanel, BorderLayout.EAST);
		this.add(logoLeftPanel, BorderLayout.WEST);
		this.add(headerLogo, BorderLayout.CENTER);
		
		
	}
}
