package EjemploSwitch;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("TIENDA");
		System.out.println("1-ver Catalogo");
		System.out.println("2-HORARIOS");
		System.out.println("3-Soporte Tecnico");
		System.out.println("4-Salir");
		System.out.println("opcion (1-4): ");
		int opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Catalogo: Pantalon, Camisetas");
			break;
		case 2:
			System.out.println("Horario: 9:00 a 20:00)");
			break;
		case 3:
			System.out.println("llamar 900-123-456");
			break;
		case 6:
			System.out.println("Gracias por tu visita");
			break;
		default:
			System.out.println("Error: numero (1-4)");
			break;
		}
	
		teclado.close();
}

}