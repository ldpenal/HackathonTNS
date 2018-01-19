
public class Conversor {
	
	private int contarNumeralesAlComienzo(String string) {
		int indexDeEspacio = string.indexOf(" ");
		String subString = string.substring(0, indexDeEspacio);
		
		int contador = 0;
		String hashTags[] = subString.split("");
		for (String hash : hashTags) {
			if (hash.equals("#")) contador++;
		}
		
		return contador;
	}

	private boolean comprobarBuenFormato(String string) {
		if (!string.startsWith("#"))
			return false;

		int indexDeEspacio = string.indexOf(" ");
		if (indexDeEspacio < 0)
			return false;

		String subString = string.substring(0, indexDeEspacio);

		if (subString.length() > 6)
			return false;

		int contados = contarNumeralesAlComienzo(string);

		return contados == subString.length();
	}

	public String convertir(String string) {
		if (!comprobarBuenFormato(string)) return string;
		
		int numeroDeNumerales = contarNumeralesAlComienzo(string);
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<H")
			.append(numeroDeNumerales)
			.append(">")
			.append(string.substring(numeroDeNumerales + 1))
			.append("</H")
			.append(numeroDeNumerales)
			.append(">");
			
		
		return stringBuffer.toString();
	}
}
