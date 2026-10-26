package pruebateclado;
import java.util.Scanner;
public class EntradaAlfaNum3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[3];
		String[] apellidos = new String[3];
		String[] ciudad = new String[3];
		NombresAlfNum3 a = new NombresAlfNum3();
		a.altas(nombres, teclado,"nombres");
		a.altas(apellidos, teclado, "apellidos");
		a.altas(ciudad, teclado,"ciudad");
		NombresAlfNum3 b = new NombresAlfNum3();
		b.mostrar(nombres, apellidos, ciudad);
		}
}