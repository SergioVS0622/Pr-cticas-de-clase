package PruebaParametros;

public class Modificar {

	public void cambiar(String[] curso, int p) {
		curso[p]= "CSS";
	}
	public void mostrar(String[] curso) {
		for (int x = 0;x<curso.length;x++) {
			System.out.println("valor " + curso[x]);
		}
	}
}
