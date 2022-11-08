package inicial;

import java.util.Scanner;

public class Envios {

	public static void main(String[] args) {

		int zona;
		float peso;// con coma pero no tan grande;
		float costo = 0;// con coma tipo long;
		
		int zona1Costo= 11;
		int zona2Costo= 10;
		int zona3Costo= 12;
		int zona4Costo= 24;
		int zona5Costo= 27;

		System.out.println("Ingrese el numero de la zona que desea: \n1= America del Norte\n2= America Central\n3= America del Sur\n4= Europa\n5= Asia");
		Scanner scanner = new Scanner (System.in);
		zona = scanner.nextInt();
		
		System.out.println("Por favor introduzca el peso del paquete en kilogramos: ");
		peso = scanner.nextFloat();
		scanner.close();
		if (peso > 5) {
			System.out.println("Su paquete no puede ser enviado, es muy pesado");
		} else {
			switch (zona) {
			case 1:
				costo = peso * zona1Costo;
				break;
			case 2:
				costo = peso * zona2Costo;
				break;
			case 3:
				costo = peso * zona3Costo;
				break;
			case 4:
				costo = peso * zona4Costo;
				break;
			case 5:
				costo = peso * zona5Costo;
				break;
			default:
				System.out.println("El valor de la zona ingresada es incorrecto");
				break;
			}
			System.out.println(costo);
			System.out.println("El costo del envio es: " + (Math.round(costo * 100) / 100.00));// Math.floor(costo)
		}
	}


}
