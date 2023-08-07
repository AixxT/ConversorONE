package conversor.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import conversor.modelo.Conversor;

public class ConversorApp {
	private static String[] coins = { "Peso Argentino(ARS) → Dólar(USD)", "Peso Argentino(ARS) → Euro(€)",
			"Peso Argentino(ARS) → Libras(£)", "Peso Argentino(ARS) → Won Coreano(KRW)",
			"Dólar(USD) → Peso Argentino (ARS)", "Dólar(USD) → Euro(€)", "Dólar(USD) → Libras(£)",
			"Dólar → Won Coreano (KRW)", "Euro(€) → Peso Argentino(ARS)", "Euro(€) → Dólar(USD)",
			"Euro(€) → Libras(£)", "Euro(€) → Won Coreano(KRW)", "Libras(£) → Peso Argentino(ARS)",
			"Libras(£) → Dólar(USD)", "Libras(£) → Euro(€)", "Libras(£) → Won Coreano(KRW)",
			"Won Coreano(KRW) → Peso Argentino(ARS)", "Won Coreano(KRW) → Dólar(USD)", "Won Coreano(KRW) → Euro(€)",
			"Won Coreano(KRW) → Libras(£)" };

	private static String[] temperatures = { "Centígrados → Fahrenheit", "Centígrados → Celsius",
			"Fahrenheit → Centígrados", "Fahrenheit → Celsius", "Celsius → Centígrados", "Celsius → Fahrenheit" };

	private static String[] measure = { "Metros → Kilómetros", "Metros → Centímetros", "Metros → Milímetros",
			"Kilómetros → Metros", "Kilómetros → Centímetros", "Kilómetros → Milímetros",
			"Centímetros → Kilómetros", "Centímetros → Metros", "Centímetros → Milímetros",
			"Milímetros → Kilómetros", "Milímetros → Metros", "Milímetros → Centímetros" };
	
	private static String[] weight = {"Kilogramos → Gramos", "Kilogramos → Miligramos",
			"Gramos → Kilogramos", "Gramos → Miligramos", "Miligramos → Kilogramos", "Miligramos → Gramos"};
	

	private static ImageIcon coin = new ImageIcon(
			"C:/Users/aixxt/eclipse-workspace/ChallengeConversor/Resources/coin.png");

	public static void main(String[] args) {

		Conversor.generateGui();

		// coinButton actionListener
		Conversor.getWelcome().getCoinButton().addActionListener(new ActionListener() {

			private String conversionUnities;
			private double amount;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					conversionUnities = (String) JOptionPane.showInputDialog(null, "Elija la dupla correspondiente:",
							"Divisas", JOptionPane.PLAIN_MESSAGE, coin, coins, Array.get(coins, 0));

				} catch (NullPointerException npe) {
					conversionUnities = null;
				}

				if (conversionUnities != null) {

					while (amount == 0) {

						try {
							String amountInput = (JOptionPane.showInputDialog(null, "", "Divisas",
									JOptionPane.PLAIN_MESSAGE, null, null, "Ingrese aquí el monto a convertir"))
									.toString();
							if (Conversor.validarInput(amountInput)) {
								amount = Double.parseDouble(amountInput);
								JOptionPane.showMessageDialog(null,
										"El resultado de su conversión es: "
												+ Conversor.conversion(amount, conversionUnities),
										conversionUnities, JOptionPane.DEFAULT_OPTION);
								break;
							} else {
								JOptionPane.showMessageDialog(null, "Asegurese de ingresar un monto válido a convertir",
										"Monto inválido", JOptionPane.ERROR_MESSAGE);
								amountInput = null;
							}
						} catch (NullPointerException npe) {
							amount = 1;
						}

					}
					amount = 0;
				}

			}

		});

		// temperatureButton actionListener
		Conversor.getWelcome().getTemperatureButton().addActionListener(new ActionListener() {

			private String conversionUnities;
			private double amount;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					conversionUnities = (String) JOptionPane.showInputDialog(null, "Elija la dupla correspondiente:",
							"Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatures, Array.get(temperatures, 0));

				} catch (NullPointerException npe) {
					conversionUnities = null;
				}

				if (conversionUnities != null) {

					while (amount == 0) {

						try {
							String amountInput = (JOptionPane.showInputDialog(null, "", "Temperatura",
									JOptionPane.PLAIN_MESSAGE, null, null, "Ingrese aquí el monto a convertir"))
									.toString();
							if (Conversor.validarInput(amountInput)) {
								amount = Double.parseDouble(amountInput);
								JOptionPane.showMessageDialog(null,
										"El resultado de su conversión es: "
												+ Conversor.conversion(amount, conversionUnities),
										conversionUnities, JOptionPane.DEFAULT_OPTION);
								break;
							} else {
								JOptionPane.showMessageDialog(null, "Asegurese de ingresar un monto válido a convertir",
										"Monto inválido", JOptionPane.ERROR_MESSAGE);
								amountInput = null;
							}
						} catch (NullPointerException npe) {
							amount = 1;
						}

					}
					amount = 0;
				}

			}

		});

		// measureButton actionListener
		Conversor.getWelcome().getMeasureButton().addActionListener(new ActionListener() {

			private String conversionUnities;
			private double amount;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					conversionUnities = (String) JOptionPane.showInputDialog(null, "Elija la dupla correspondiente:",
							"Distancia", JOptionPane.PLAIN_MESSAGE, null, measure, Array.get(measure, 0));

				} catch (NullPointerException npe) {
					conversionUnities = null;
				}

				if (conversionUnities != null) {

					while (amount == 0) {

						try {
							String amountInput = (JOptionPane.showInputDialog(null, "", "Distancia",
									JOptionPane.PLAIN_MESSAGE, null, null, "Ingrese aquí el monto a convertir"))
									.toString();
							if (Conversor.validarInput(amountInput)) {
								amount = Double.parseDouble(amountInput);
								JOptionPane.showMessageDialog(null,
										"El resultado de su conversión es: "
												+ Conversor.conversion(amount, conversionUnities),
										conversionUnities, JOptionPane.DEFAULT_OPTION);
								break;
							} else {
								JOptionPane.showMessageDialog(null, "Asegurese de ingresar un monto válido a convertir",
										"Monto inválido", JOptionPane.ERROR_MESSAGE);
								amountInput = null;
							}
						} catch (NullPointerException npe) {
							amount = 1;
						}

					}
					amount = 0;
				}

			}

		});

		// temperatureButton actionListener
		Conversor.getWelcome().getWeightButton().addActionListener(new ActionListener() {

			private String conversionUnities;
			private double amount;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					conversionUnities = (String) JOptionPane.showInputDialog(null, "Elija la dupla correspondiente:",
							"Peso", JOptionPane.PLAIN_MESSAGE, null, weight, Array.get(weight, 0));

				} catch (NullPointerException npe) {
					conversionUnities = null;
				}

				if (conversionUnities != null) {

					while (amount == 0) {

						try {
							String amountInput = (JOptionPane.showInputDialog(null, "", "Peso",
									JOptionPane.PLAIN_MESSAGE, null, null, "Ingrese aquí el monto a convertir"))
									.toString();
							if (Conversor.validarInput(amountInput)) {
								amount = Double.parseDouble(amountInput);
								JOptionPane.showMessageDialog(null,
										"El resultado de su conversión es: "
												+ Conversor.conversion(amount, conversionUnities),
										conversionUnities, JOptionPane.DEFAULT_OPTION);
								break;
							} else {
								JOptionPane.showMessageDialog(null, "Asegurese de ingresar un monto válido a convertir",
										"Monto inválido", JOptionPane.ERROR_MESSAGE);
								amountInput = null;
							}
						} catch (NullPointerException npe) {
							amount = 1;
						}

					}
					amount = 0;
				}

			}

		});

	}

}
