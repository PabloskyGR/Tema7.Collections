package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> lista = new ArrayList<String>();

		String nombre = "";

		while (lista.size() < 5) {
			System.out.println("Dime un nombre: ");
			nombre = sc.nextLine().toLowerCase();
			if (lista.contains(nombre)) {
				System.out.println("Ese nombre ya esta en la lista");
			} else {
				lista.add(nombre);
			}
		}

		System.out.println(lista);

		Collections.reverse(lista);

		System.out.println(lista);

		sc.close();
	}

}
