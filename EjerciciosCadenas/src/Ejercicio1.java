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
			if (c == 'a' || c == '�') {
				contadorA++;
			} 
			else if (c == 'e' || c == '�') {
				contadorE++;
			} 
			else if (c == 'i' || c == '�') {
				contadorI++;
			} 
			else if (c == 'o' || c == '�') {
				contadorO++;
			} 
			else if (c == 'u' || c == '�' || c == '�') {
				contadorU++;
			}
			
//			switch(texto.charAt(i)) {
//				case 'a':
//				case '�':
//					contadorA++;
//					break;
//				case 'e':
//				case '�':
//					contadorE++;
//					break;
//				case 'i':
//				case '�':
//					contadorI++;
//					break;
//				case 'o':
//				case '�':
//					contadorO++;
//					break;
//				case 'u':
//				case '�':
//				case '�':
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
