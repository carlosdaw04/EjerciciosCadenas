import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s1;
		String s2;
		do {
			System.out.println("Escribe la primera cadena:");
			s1 = in.nextLine().toLowerCase();
		}
		while(s1.length() == 0);
		
		do {
			System.out.println("Escribe la segunda cadena:");
			s2 = in.nextLine().toLowerCase();
		}
		while(s2.length() == 0 && s1.length() > s2.length());
		
		int i = 0;
		int c = 0;
		do {
			i = s1.indexOf(s2, i);
			if (i >= 0) {
				c++;
				i++;
			}
		}
		while(i >= 0);
		
		System.out.println("La segunda esta contenida " + c + " veces en la primera");
	}
}
