package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			lista.add(i);
		}

		System.out.println(lista);

		Collections.shuffle(lista);

		System.out.println(lista);

	}

}
