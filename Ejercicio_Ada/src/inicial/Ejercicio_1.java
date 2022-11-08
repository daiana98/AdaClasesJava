package inicial;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		System.out.println("Hello world");

		System.out.println("Ingrese su nombre: ");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.next();// genero un objeto con la palabra "new";//clase escaner que va a escanear del
										// teclado lo que yo escriba
		scanner.close();
		System.out.println("Bienvenida: " + nombre);
	}

}
