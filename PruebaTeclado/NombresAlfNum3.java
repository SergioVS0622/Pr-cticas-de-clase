package pruebateclado;
import java.util.Scanner;
public class NombresAlfNum3 {
	public void altas(String[] n, Scanner teclado, String titulo) {
		for (int x=0; x<n.length;x++ ) {
			System.out.println(titulo);
			n[x] = teclado.next();
		
		}
	}
	public void mostrar(String[] n, String[] a, String[] c) {
		for (int x=0; x<n.length; x++) {
			System.out.println("Nombre:" +n[x]+" Apellidos:" +a[x]+" Ciudad:" +c[x]);
		}
	}
}

