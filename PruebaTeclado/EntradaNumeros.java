package pruebateclado;
import java.util.Scanner;
public class EntradaNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nros[] = new double [3];
		double a = teclado.nextInt();
		double b = teclado.nextInt();
		double c = teclado.nextInt();
			System.out.println("Primer numero:");
			System.out.println("Segundo numero:");
			System.out.println("Tercer numero:");
			System.out.println("Mostrar numeros:" + a +"," + b +"," + c);
		
		for(int x = 0; x<nros.length; x++) {
			System.out.println("Promedio:" + (a+b+c)/nros.length);
		
	}
		teclado.close();
}
}