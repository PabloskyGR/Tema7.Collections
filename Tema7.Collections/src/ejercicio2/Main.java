package ejercicio2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lista = new LinkedHashSet<Integer>();

		Random rdn = new Random();

		while (lista.size() < 10) {
			lista.add(rdn.nextInt(20) + 1);
		}

		System.out.println(lista);

	}

}
