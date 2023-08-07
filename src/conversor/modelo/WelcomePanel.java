package conversor.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel{
	
	private static JButton coinButton;
	private static JButton temperatureButton;
	private static JButton measureButton;
	private static JButton weightButton;
	
	public WelcomePanel() {
		
		JPanel msg = new JPanel();
		JPanel buttons = new JPanel();
		
		ImageIcon coin = new ImageIcon("C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/coin.png");
		ImageIcon temperature = new ImageIcon("C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/temperature.png");
		ImageIcon measure = new ImageIcon("C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/measure.png");
		ImageIcon weight = new ImageIcon("C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/weight.png");
		
		this.setBackground(new Color(0xFFD4AD));
		this.setLayout(new GridLayout(2,1));
		buttons.setLayout(new GridLayout(1,4,30,5));
		buttons.setBackground(null);
		
		JLabel welcomeMsg1 = new JLabel("Bienvenidx al Conversor ONE!");
		JLabel welcomeMsg2 = new JLabel("¿Con que conversión podemos ayudarte?");
		
		welcomeMsg1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		welcomeMsg1.setForeground(new Color(0x0D0E25));
		welcomeMsg2.setFont(new Font("", Font.PLAIN, 14));
		
		msg.setBackground(null);
		msg.add(welcomeMsg1);
		msg.add(welcomeMsg2);
		
		coinButton = new MyButton(coin);
		temperatureButton = new MyButton(temperature);
		measureButton = new MyButton(measure);
		weightButton = new MyButton(weight);
		
		
		buttons.add(coinButton);
		buttons.add(temperatureButton);
		buttons.add(measureButton);
		buttons.add(weightButton);
		this.add(msg);
		this.add(buttons);
	}

	public JButton getCoinButton() {
		return coinButton;
	}

	public JButton getTemperatureButton() {
		return temperatureButton;
	}

	public JButton getMeasureButton() {
		return measureButton;
	}

	public JButton getWeightButton() {
		return weightButton;
	}

}
