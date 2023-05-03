
public class Rettangoli {
	int base;
	int altezza;
	int area;
	int perimetro;
	
	
	public void Lati(int base,int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public void Area() {
		this.area = base * altezza;
		System.out.println("l'area è" + " " + this.area);
	}
	public void Perimetro() {
		this.perimetro= (base+altezza)*2;
		System.out.println("il perimetro è" + " " + this.perimetro);
	}
	
}
