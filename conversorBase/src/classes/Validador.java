package classes;

import java.util.ArrayList;
import java.util.List;

public class Validador {

	public static boolean isBinario(String numberToValidate) {

		boolean retorno = true;

		for (int i = numberToValidate.length(); i > 0; i--) {

			char ch = numberToValidate.charAt(i - 1);

			if (ch != '1' && ch != '0') {
				retorno = false;
				break;

			}
		}
		return retorno;
	}

	public static boolean isDecimal(String numberToValidate) {

		boolean retorno = false;
		
		boolean isNotNumber = false;

		for (int i = numberToValidate.length(); i > 0; i--) {
			char ch = numberToValidate.charAt(i - 1);

			if (Character.digit(ch, 10) >= 0 && Character.digit(ch, 10) <= 9) {
				retorno = true;
				
				break;
			}else {
				isNotNumber = true;
			}
			
		}
		if(isNotNumber == true) {
			retorno = false;
		}

		return retorno;

	}

	public static boolean isHexa(String numberToValidate) {

		boolean retorno = true;

		char[] dados = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f' };

		for (int i = numberToValidate.length(); i > 0; i--) {
			char charToValidate = numberToValidate.charAt(i - 1);

			while (retorno == true) {
				boolean validEquals = false;
				for (int x = dados.length; x > 0; x--) {
					char charValid = dados[x - 1];
					System.out.println(charValid);

					if (charToValidate == charValid) {
						validEquals = true;
						break;
					}
				}
				if (validEquals == false) {
					retorno = false;
					break;
				} else {
					break;
				}
			}

		}

		return retorno;

	}
}
