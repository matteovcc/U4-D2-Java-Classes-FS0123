
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(0, "Matteo","Vacca","mttvcc@","02/02/02");
		
		Articolo articolo = new Articolo(123,"Playstation 5",476,10);
		
		Carrello carrello = new Carrello("cliente N* 0","Playstation 5",477);
		
		System.out.println("Il cliente " + " " + cliente.codiceCliente + " " + cliente.nome + " " + cliente.cognome);
		System.out.println("Cliente dal " + cliente.data);
		System.out.println("Ha acquistato " + articolo.descrizione + " " +  "id:" + articolo.codice + "prezzo" + articolo.prezzo);
		System.out.println("Ripilogo Carrello: -Totale Carrello: " + carrello.costoArticoli + "Articoli: " + carrello.elenco);
		System.out.println("Acquistato da" + " " + carrello.cliente);
	}
	
//	public static void stampaOrdine(Cliente cliente,Articolo articolo,Carrello carrello) {
//		System.out.println("Il cliente" + cliente.nome + " " + cliente.cognome);
//	}
	

}
