package PruebaParametros;

public class Parametros {

	public static void main(String[] args) {
		String[] curso = {"Java", "HTML"};
		int p = 0;
		Modificar obj = new Modificar();
		obj.cambiar(curso, p);
		obj.mostrar(curso);
		
		
	}

}
