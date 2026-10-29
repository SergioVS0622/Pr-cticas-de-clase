package tareaoperaciones;
import java.util.Scanner;
public class Operaciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opciones = 0;
		int n1 = 0;
		int n2 = 0;
		do {
			System.out.println("MENU");
			System.out.println("Elija una opcion:");
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Salir");
			opciones = teclado.nextInt();
			switch (opciones) {
				case 1:
					System.out.println("Introduce el primer numero: ");
					n1 = teclado.nextInt();
					System.out.println("Introduce el segundo numero: ");
					n2 = teclado.nextInt();
					System.out.println("La suma es: "+ (n1+n2));
					break;
				case 2:
					System.out.println("Introduce el primer numero: ");
					n1 = teclado.nextInt();
					System.out.println("Introduce el segundo numero: ");
					n2 = teclado.nextInt();
					System.out.println("La resta es: "+ (n1-n2));
					break;
				case 3:
					System.out.println("Introduce el primer numero: ");
					n1 = teclado.nextInt();
					System.out.println("Introduce el segundo numero: ");
					n2 = teclado.nextInt();
					System.out.println("La resta es: "+ (n1*n2));
				case 4:
					System.out.println("Fin de la aplicación");
					break;
				default:
					System.out.println("Error! Tiene que ser un numero del 1-4, vuelva a intentarlo");
					break;
			}
		}while (opciones !=4);
		teclado.close();

	}

}
