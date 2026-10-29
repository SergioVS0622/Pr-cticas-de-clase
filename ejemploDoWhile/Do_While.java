package ejemploDoWhile;
import java.util.Scanner;
public class Do_While {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("\n");
			System.out.println("MENU");
			System.out.println("1-introducir número");
			System.out.println("2-salir");
			System.out.println("opcion(1-2)");
			opcion = teclado.nextInt();
			if (opcion == 1) {
				System.out.println("introduce numero: ");
				int numero = teclado.nextInt();
				System.out.println("\n");
				System.out.println("El numero es " + numero);
			}else {
				System.out.println("\n");
				System.out.println("final aplicacion");
			}
			}while (opcion != 2);
		teclado.close();
		
	}

}
