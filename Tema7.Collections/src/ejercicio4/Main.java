package ejercicio4;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashSet<String> lista = new HashSet<String>();

		String nombre = "";

		while (lista.size() < 5) {
			System.out.println("Dime un nombre: ");
			nombre = sc.nextLine().toLowerCase();
			lista.add(nombre);
		}

		

	}

}
