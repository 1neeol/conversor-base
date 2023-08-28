package classes;

import javax.swing.JOptionPane;

public class Executor {

	public static void executar() {

		String baseInicial = JOptionPane.showInputDialog(
				"Escolha qual a BASE inicial de conversão: \n 1 - Binário; \n 2 - Decimal; \n 3 - Hexadecimal");

		String baseFinal = JOptionPane.showInputDialog(
				"Escolha a BASE final de conversão: \n 1 - Binário; \n 2 - Decimal; \n 3 - Hexadecimal");

		String number = JOptionPane.showInputDialog("Informe o valor a ser convertido");

		if (baseInicial.equals("1") && baseFinal.equals("2")) {

			boolean isValid = Validador.isBinario(number);

			if (isValid == true) {

				String result = Conversor.binarioToDecimal(number);

				JOptionPane.showMessageDialog(null, "O valor decimal do binario " + number + " é:" + result);

			} else {
				JOptionPane.showMessageDialog(null, "O numero informado não é um BINÁRIO. Tente novamente");
			}
		}

		if (baseInicial.equals("1") && baseFinal.equals("3")) {
			boolean isValid = Validador.isBinario(number);

			if (isValid == true) {
				String numberDecimal = Conversor.binarioToDecimal(number);

				String result = Conversor.decimalToHexa(Integer.parseInt(numberDecimal));

				JOptionPane.showMessageDialog(null,
						"O valor em hexadecimal para o BINÁRIO " + number + " é : " + result);

			} else {
				JOptionPane.showMessageDialog(null, "O numero informado não é um BINÁRIO. Tente novamente");
			}
		}

		if (baseInicial.equals("2") && baseFinal.equals("1")) {
			boolean isValid = Validador.isDecimal(number);

			if (isValid == true) {
				String result = Conversor.decimalToBinarial(Integer.parseInt(number));

				JOptionPane.showMessageDialog(null, "O valor em binário para o DECIMAL " + number + " é : " + result);

			} else {
				JOptionPane.showMessageDialog(null, "O numero informado não é um DECIMAL. Tente novamente");
			}

		}

		if (baseInicial.equals("2") && baseFinal.equals("3")) {
			boolean isValid = Validador.isDecimal(number);

			if (isValid == true) {

				String result = Conversor.decimalToHexa(Integer.parseInt(number));

				JOptionPane.showMessageDialog(null,
						"O valor em hexadecimal para o DECIMAL " + number + " é : " + result);
			} else {
				JOptionPane.showMessageDialog(null, "O numero informado não é um DECIMAL. Tente novamente");
			}

		}

		if (baseInicial.equals("3") && baseFinal.equals("1")) {
			boolean isValid = Validador.isHexa(number);

			if (isValid == true) {

				int numberDecimal = Conversor.hexaToDecimal(number);

				String result = Conversor.decimalToBinarial(numberDecimal);

				JOptionPane.showMessageDialog(null,
						"O valor em binário para o hexadecimal " + number + " é : " + result);

			} else {
				JOptionPane.showMessageDialog(null, "O numero informado não é um HEXADECIMAL. Tente novamente");
			}

		}

		if (baseInicial.equals("3") && baseFinal.equals("2")) {
			boolean isValid = Validador.isHexa(number);

			if (isValid == true) {
				String result = String.valueOf(Conversor.hexaToDecimal(number));

				JOptionPane.showMessageDialog(null,
						"O valor em decimal para o hexadecimal " + number + " é : " + result);
			} else {
				JOptionPane.showMessageDialog(null, "O numero informado não é um HEXADECIMAL. Tente novamente");
			}
		}

	}
}
