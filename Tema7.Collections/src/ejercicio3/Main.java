package ejercicio3;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<Character, Integer> lista = new HashMap<Character, Integer>();

		String texto = "En un agujero en el suelo, vivía un hobbit. No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		for (char letra : texto.toCharArray()) {
			if (Character.isLetter(letra)) {
				letra = Character.toLowerCase(letra);
				lista.put(letra, lista.getOrDefault(letra, 0) + 1);
			}
		}

		System.out.println(lista);

	}

}
