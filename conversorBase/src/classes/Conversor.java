package classes;

public class Conversor {

	public static String decimalToBinarial(int numberToConvert) {

		StringBuilder result = new StringBuilder();

		while (numberToConvert != 0) {

			int resto = numberToConvert % 2;
			result.append(resto).toString();
			int division = numberToConvert / 2;
			numberToConvert = division;
		}

		return result.reverse().toString();
	}

	public static String binarioToDecimal(String numberToConvert) {

		double decimalTotal = 0;
		int base = 2;
		int expoente = 0;

		for (int i = numberToConvert.length(); i > 0; i--) {

			char ch = numberToConvert.charAt(i - 1);

			if (ch == '1') {
				double calc = Math.pow(base, expoente);

				decimalTotal = decimalTotal + calc;

			}
			expoente++;
		}

		return String.valueOf(decimalTotal);
	}
	

	public static String decimalToHexa(int numberToConvert) {

		StringBuilder result = new StringBuilder();

		while (numberToConvert != 0) {

			int resto = numberToConvert % 16;
			switch (resto) {
			case 10:
				result.append("A");
				break;
			case 11:
				result.append("B");
				break;
			case 12:
				result.append("C");
				break;
			case 13:
				result.append("D");
				break;
			case 14:
				result.append("E");
				break;
			case 15:
				result.append("F");
				break;
			default:
				result.append(resto).toString();
			}

			int division = numberToConvert / 16;
			numberToConvert = division;
		}

		return result.reverse().toString();
	}

	public static String hexaToDecimal(String numberToConvert) {

		double decimalTotal = 0;
		int base = 16;
		int expoente = 0;

		for (int i = numberToConvert.length(); i > 0; i--) {
			double calc = Math.pow(base, expoente);
			char ch = numberToConvert.charAt(i - 1);

			switch (ch) {
			case 'A':
				decimalTotal = (calc * 10) + decimalTotal;
				break;
			case 'B':
				decimalTotal = (calc * 11) + decimalTotal;
				break;
			case 'C':
				decimalTotal = (calc * 12) + decimalTotal;
				break;
			case 'D':
				decimalTotal = (calc * 13) + decimalTotal;
				break;
			case 'E':
				decimalTotal = (calc * 14) + decimalTotal;
				break;
			case 'F':
				decimalTotal = (calc * 15) + decimalTotal;
				break;
			default:
				decimalTotal = (calc * Character.digit(ch, 10)) + decimalTotal;
			}
			expoente++;
		}

		return String.valueOf(decimalTotal);
	}
}
