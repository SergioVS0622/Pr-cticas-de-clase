
package String;

public class EjemploString {

	public static void main(String[] args) {
		System.out.println("METODOS STRING");
		System.out.println();
		String textoOriginal = " Curso Java ";
		System.out.println("texto ORIGINAL "+textoOriginal);
		System.out.println("texto sin espacios "+textoOriginal.trim());
		System.out.println();
		int longitud = textoOriginal.length();
		System.out.println("total letras "+ longitud);
		System.out.println("total letras sin espacios "+textoOriginal.trim().length());
		String textoLimpio = textoOriginal.trim();
		System.out.println();
		char c = textoLimpio.charAt(0);
		System.out.println("primer caracter "+c);
		System.out.println();
		String subCadena = textoLimpio.substring(0,3);
		System.out.println("subcadena "+subCadena);
		String textoModif = textoLimpio.replace("Java","programacion");
		System.out.println("modificacion "+textoModif);
		String f0 = "27102026";
		String f = "27-10-2026";
		String f2 = "/";
		String f1 = "-";
		fecha(f0);
		fecha(f,f1,f2);
		
	}
		
		public static void fecha(String fecha) {
		String dia = fecha.substring(0,2);
		String mes = fecha.substring(2,4);
		String año = fecha.substring(4,8);
		System.out.println("fecha "+dia+"/"+mes+"/"+año);
		

	}
		public static void fecha(String f, String f1, String f2) {
			String fnueva = f.replace(f1,f2);
			System.out.println("Nueva fecha "+fnueva);
			
			
			
		}
}
