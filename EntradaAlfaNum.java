package pruebateclado;
import java.util.Scanner;
public class EntradaAlfaNum {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[3];
		String[] apellido = new String[3];
		String[] direccion = new String[3];
		for( int x=0; x<nombres.length; x++) {
			System.out.println("Nombre:");
			nombres[x] = teclado.next();
			System.out.println("Apellido:");
			apellido[x] = teclado.next();
			System.out.println("Direccion:");
			direccion[x] = teclado.next();
			
		}
		teclado.close();
		}
}