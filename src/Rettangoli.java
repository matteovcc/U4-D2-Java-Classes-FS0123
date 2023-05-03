
public class Rettangoli {
	int base;
	int altezza;
//	int area;
//	int perimetro;
	
	
	public  Rettangoli(int base,int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int Area() {
		return base * altezza;
//		System.out.println("l'area è" + " " + this.area);
	}
	public int Perimetro() {
		return  (base+altezza)*2;
//		System.out.println("il perimetro è" + " " + this.perimetro);
	}
	
}
