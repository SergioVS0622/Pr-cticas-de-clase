package tareaoperaciones;
import java.util.Scanner;
public class CambioTemperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int temperatura = 18;
		int temperaturaMax = 22;
		System.out.println("Calefacción automática");
		System.out.println("Temperatura actual: " + temperatura);
		System.out.println("Programado a: " + temperaturaMax);
		System.out.println("");
		System.out.println("¿Encender termostato?");
		System.out.println("1-Si");
		System.out.println("2-No");
		int boton = teclado.nextInt();
		switch (boton) {
		case 1:
			System.out.println("");
			System.out.println("Calefacción encendida");
			while (temperatura < temperaturaMax) {
				temperatura = temperatura + 1;
				System.out.println("");
				System.out.println("Subiendo temperatura: "+ temperatura);
			}
				System.out.println("");
				System.out.println("Termostato apagado");	
			break;
		case 2:
			System.out.println("Calefacción apagada");
			teclado.close();
			break;
		default:
			System.out.println("Error! Escoja un numero del 1-2");
			break;
		}
		
	}

}
