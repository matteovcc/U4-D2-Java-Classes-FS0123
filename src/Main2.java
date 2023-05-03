
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] calls = {"chiamata1","chiamata2","chiamata3","chiamata4","chiamata5"};
		Sim sim = new Sim(35196,0.0, calls);
		
		stampaDati(sim,calls);
	}
	public static void stampaDati(Sim sim, String[]calls) {
		System.out.println("Numero " + sim.number);
		System.out.println("Credito " + sim.credit);
		System.out.println("Ultime 5 chiamate:" );
		for (int i = 0; i < calls.length; i++) {
		    System.out.println(calls[i]);
		}
		
	
		}
//		System.out.println("Lista delle chiamate " + sim.calls);
		
	}

