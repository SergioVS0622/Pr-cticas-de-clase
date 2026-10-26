package EjemploCine;

public class Entrada {
	String asiento = "Fila 4, Butaca 12";
	double precio = 8.50;

	
	public void resumen() {
		System.out.println("Ticket:");
		Pelicula a = new Pelicula();
		a.titulo();
		System.out.println("Asiento:" + asiento);
		System.out.println(" 6Precio:" + precio);
	}
	
	
		
		
	}

