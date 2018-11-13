import java.util.Scanner;

public class Ejercicio1 {
	
	/*Programa que lea una cadena por teclado 
	 * y muestre por pantalla el numero de
	 * veces que aparece repetida cada vocal.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un texto:");
		String texto = teclado.nextLine().toLowerCase();
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'á') {
				contadorA++;
			} 
			else if (c == 'e' || c == 'é') {
				contadorE++;
			} 
			else if (c == 'i' || c == 'í') {
				contadorI++;
			} 
			else if (c == 'o' || c == 'ó') {
				contadorO++;
			} 
			else if (c == 'u' || c == 'ú' || c == 'ü') {
				contadorU++;
			}
			
//			switch(texto.charAt(i)) {
//				case 'a':
//				case 'á':
//					contadorA++;
//					break;
//				case 'e':
//				case 'é':
//					contadorE++;
//					break;
//				case 'i':
//				case 'í':
//					contadorI++;
//					break;
//				case 'o':
//				case 'ó':
//					contadorO++;
//					break;
//				case 'u':
//				case 'ú':
//				case 'ü':
//					contadorU++;
//					break;
//			}

		}
		System.out.println("Cantidad de vocales a: " + contadorA);
		System.out.println("Cantidad de vocales e: " + contadorE);
		System.out.println("Cantidad de vocales i: " + contadorI);
		System.out.println("Cantidad de vocales o: " + contadorO);
		System.out.println("Cantidad de vocales u: " + contadorU);
	}
}
