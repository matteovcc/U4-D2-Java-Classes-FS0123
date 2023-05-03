
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim sim = new Sim(35196,0.2);
		stampaDati(sim);
	}
	public static void stampaDati(Sim sim) {
		System.out.println("Numero " + sim.number);
		System.out.println("Credito " + sim.credit);
//		System.out.println("Lista delle chiamate " + sim.calls);
		
	}
}
