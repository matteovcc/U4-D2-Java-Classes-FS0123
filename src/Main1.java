import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base;
		int altezza;
		
		
		Scanner in = new Scanner(System.in);
		Rettangoli r1 = new Rettangoli();
		System.out.println("Inserisci la base");
		base = in.nextInt();
		System.out.println("Inserisci l'altezza");
		altezza = in.nextInt();
		r1.Lati(base, altezza);
		
	}
	public static void getSomma(int a, int b, String c) {
		String ident;
		if (c == "perim") {
			ident = "del perimetro";
		} else {
			ident = "dell'area";
		}
		System.out.println("La somma " + ident + " è di: " + (a + b));
	}
}
