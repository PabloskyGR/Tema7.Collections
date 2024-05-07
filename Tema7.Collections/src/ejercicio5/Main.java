package ejercicio5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> lista = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);

		boolean salir = false;

		String nombre = "";

		String valor = "";

		String nombreBuscar = "";

		String nombreEliminar = "";

		int opc;

		do {

			menu();
			System.out.println("Introduce una opción:");
			opc = sc.nextInt();

			switch (opc) {
			case 1: {
				System.out.println("Añade una serie:");
				nombre = sc.next();
				sc.nextLine();
				System.out.println("Añade un valor:");
				valor = sc.next();
				sc.nextLine();
				lista.put(nombre, valor);
				System.out.println("Añadido correctamente");
				break;
			}
			case 2: {
				System.out.println("Dime el nombre a buscar");
				nombreBuscar = sc.next();
				sc.nextLine();
				if (lista.containsKey(nombre)) {
					System.out.println(nombreBuscar + ":" + lista.get(nombreBuscar));
				} else {
					System.out.println("No existe");
				}
				break;
			}
			case 3: {
				System.out.println("Dime el nombre a eliminar");
				nombreEliminar = sc.next();
				sc.nextLine();
				if (lista.containsKey(nombreEliminar)) {
					lista.remove(nombreEliminar);
					System.out.println("Se ha elimimado correctamente");
				} else {
					System.out.println("No existe");
				}
				break;

			}
			case 4: {
				System.out.println("Saliendo...");
				salir = true;
				break;
			}
			default: {
				System.out.println("Opción no válida");
				break;
			}
			}

		} while (salir != true);

		sc.close();

	}

	public static void menu() {
		System.out.println("Menú:");
		System.out.println("1. Agregar");
		System.out.println("2. Buscar");
		System.out.println("3. Eliminar");
		System.out.println("4. Salir");
	}

}
