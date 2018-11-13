import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Programa que lea una cadena por teclado
	 * y la muestre invertida.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un texto:");
		String texto = teclado.nextLine();
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			System.out.print(texto.charAt(i));
		}
	}

}
