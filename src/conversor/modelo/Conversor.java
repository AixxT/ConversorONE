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

	public static Double conversion(double amount, String button, String unidades) {

		switch (button) {
		case "Coins": {
			switch (unidades) {
			case "Peso Argentino(ARS) → Dólar(USD)": {
				double conversionValue = 0.0035 ;
				return amount * conversionValue;
			}
			case "Peso Argentino(ARS) → Euro(€)" : {
				double conversionValue = 0.0032 ;
				return amount * conversionValue;
			}
			case "Peso Argentino(ARS) → Libras(£)" : {
				double conversionValue = 0.0028;
				return amount * conversionValue;
			}
			case "Peso Argentino(ARS) → Won Coreano(KRW)" : {
				double conversionValue = 4.61;
				return amount * conversionValue;
			}
			case "Dólar(USD) → Peso Argentino (ARS)": {
				double conversionValue = 283.16;
				return amount * conversionValue;
			}
			case "Dólar(USD) → Euro(€)" : {
				double conversionValue = 0.91;
				return amount * conversionValue;
			}
			case "Dólar(USD) → Libras(£)": {
				double conversionValue = 0.78 ;
				return amount * conversionValue;
			}
			case "Dólar → Won Coreano (KRW)": {
				double conversionValue = 1306.41 ;
				return amount * conversionValue;
			}
			case "Euro(€) → Peso Argentino(ARS)": {
				double conversionValue = 311.63;
				return amount * conversionValue;
			}
			case "Euro(€) → Dólar(USD)": {
				double conversionValue = 1.10;
				return amount * conversionValue;
			}
			case "Euro(€) → Libras(£)": {
				double conversionValue = 0.86;
				return amount * conversionValue;
			}
			case "Euro(€) → Won Coreano(KRW)" : {
				double conversionValue = 1437.68;
				return amount * conversionValue;
			}
			case "Libras(£) → Peso Argentino(ARS)": {
				double conversionValue = 361.96;
				return amount * conversionValue;
			}
			case "Libras(£) → Dólar(USD)" : {
				double conversionValue = 1.28;
				return amount * conversionValue;
			}
			case "Libras(£) → Euro(€)" : {
				double conversionValue = 1.16;
				return amount * conversionValue;
			}
			case "Libras(£) → Won Coreano(KRW)": {
				double conversionValue = 1669.58 ;
				return amount * conversionValue;
			}
			case "Won Coreano(KRW) → Peso Argentino(ARS)": {
				double conversionValue = 0.22;
				return amount * conversionValue;
			}
			case "Won Coreano(KRW) → Dólar(USD)": {
				double conversionValue = 0.00077 ;
				return amount * conversionValue;
			}
			case "Won Coreano(KRW) → Euro(€)": {
				double conversionValue = 0.0007;
				return amount * conversionValue;
			}
			case "Won Coreano(KRW) → Libras(£)": {
				double conversionValue = 0.000006;
				return amount * conversionValue;
			}
			}
			
		}
		case "Temperature": {
			switch (unidades) {
			case "Centígrados → Fahrenheit": {
				double conversionValue = (9 / 5);
				return (amount * conversionValue) + 32;
			}
			case "Centígrados → Kelvin" : {
				double conversionValue = 273.15 ;
				return amount + conversionValue;
			}
			case "Fahrenheit → Centígrados": {
				double conversionValue = 5 / 9;
				return (amount - 32) * conversionValue;
			}
			case "Fahrenheit → Kelvin" : {
				double conversionValue = 5 / 9;
				return ((amount - 32) * conversionValue) + 273.15;
			}
			case "Kelvin → Centígrados" : {
				double conversionValue = 273.15 ;
				return amount - conversionValue;
			}
			case "Kelvin → Fahrenheit" : {
				double conversionValue = 273.15;
				return ((amount - conversionValue) * (9 / 5)) + 32;	
			}
			
			}
		}
		case "Distance": {
			switch (unidades) {
			case "Metros → Kilómetros" : {
				double conversionValue = 0.001 ;
				return amount * conversionValue;
			}
			case "Metros → Centímetros" : {
				double conversionValue = 100 ;
				return amount * conversionValue;
			}
			case "Metros → Milímetros": {
				double conversionValue = 1000 ;
				return amount * conversionValue;
			}
			case "Kilómetros → Metros": {
				double conversionValue = 1000;
				return amount * conversionValue;
			}
			case "Kilómetros → Centímetros": {
				double conversionValue = 100000;
				return amount * conversionValue;
			}
			case "Kilómetros → Milímetros": {
				double conversionValue = 1000000 ;
				return amount * conversionValue;
			}
			case "Centímetros → Kilómetros" : {
				double conversionValue = 0.00001;
				return amount * conversionValue;
			}
			case "Centímetros → Metros" : {
				double conversionValue = 0.01;
				return amount * conversionValue;
			}
			case "Centímetros → Milímetros" : {
				double conversionValue = 1000;
				return amount * conversionValue;
			}
			case "Milímetros → Kilómetros" : {
				double conversionValue = 0.000001;
				return amount * conversionValue;
			}
			case "Milímetros → Metros" : {
				double conversionValue = 0.001;
				return amount * conversionValue;
			}
			case "Milímetros → Centímetros" : {
				double conversionValue = 0.1 ;
				return amount * conversionValue;
			}
			
			}
		}
		case "Weight": {

			switch (unidades) {
			case "Kilogramos → Gramos" : {
				double conversionValue = 1000;
				return amount * conversionValue;
			}
			case "Kilogramos → Miligramos" : {
				double conversionValue = 1000000;
				return amount * conversionValue;
			}
			case "Gramos → Kilogramos" : {
				double conversionValue = 0.001;
				return amount * conversionValue;
			}
			case "Gramos → Miligramos" : {
				double conversionValue = 1000;
				return amount * conversionValue;
			}
			case "Miligramos → Kilogramos" : {
				double conversionValue = 0.000001;
				return amount * conversionValue;
			}
			case "Miligramos → Gramos" : {
				double conversionValue = 0.001;
				return amount * conversionValue;
			}
			

			}
		}

		}

		return null;
	}

}
