import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Exercise 1
		Rettangoli rettangolo1 = new Rettangoli(2,8);
		Rettangoli rettangolo2 = new Rettangoli(3,7);
		
		System.out.println("Rettangolo 1 Area: " + rettangolo1.Area());
		System.out.println("Rettangolo 1 Perimetro:" + rettangolo1.Perimetro());
		
		System.out.println("Rettangolo 2 Area: " + rettangolo2.Area());
		System.out.println("Rettangolo 2 Perimetro:" + rettangolo2.Perimetro());
		
		//Exercise 2 
		stampaRettangolo(rettangolo1);
		
		//Exercise 3 
		stampaDueRettangoli(rettangolo1,rettangolo2);
	}
	//Exercise 2
	public static void stampaRettangolo(Rettangoli rettangolo1) {
		System.out.println("Area:" + rettangolo1.Area());
		System.out.println("Perimetro:" + rettangolo1.Perimetro());
	}
	
	//Exercise 3
	public static void stampaDueRettangoli(Rettangoli rettangolo1,Rettangoli rettangolo2) {
		int areeSommate= rettangolo1.Area() + rettangolo2.Area();
		int perimetriSommati = rettangolo1.Perimetro() + rettangolo2.Perimetro();
		
		System.out.println("La somma delle aree è :" + " " + areeSommate);
	    System.out.println("La somma dei  perimetri: " + " " +  perimetriSommati);
	}
}
