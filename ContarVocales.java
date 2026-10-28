package ContarVocales;
import java.util.Scanner;
public class ContarVocales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra = teclado.nextLine();
		String palabramin = palabra.toLowerCase();
		int contador = 0;
		for(int x=0;x<palabra.length();x++) {
			//char c = palabramin.charAt(x);
			/*switch(c) {
				case 'a':
				
				case 'e':
				
				case 'i':
				
				case 'o':
				
				case 'u':
					contador = contador+1;
				break;		
			}*/
			if(palabramin.charAt(x)!='a' && palabramin.charAt(x)!='e' && palabramin.charAt(x)!='i' && palabramin.charAt(x)!='o' && palabramin.charAt(x)!='u' && palabramin.charAt(x) != ' ') {
				contador = contador+1;
		}		
	}
		//System.out.println("Las vocales son:"+contador);
		System.out.println("Las consonantes son:"+contador);
		teclado.close();
}
}