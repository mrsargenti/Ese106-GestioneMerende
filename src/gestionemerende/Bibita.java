package gestionemerende;

public class Bibita extends Articolo {

	private double quantità;

	/**
	 * @param codice
	 * @param descrizione
	 * @param costoUnitario
	 * @param apportoCalorico
	 * @param quantità
	 */
	public Bibita(String codice, String descrizione, double costoUnitario,
			double apportoCalorico, double quantità) {
		super(codice, descrizione, costoUnitario, apportoCalorico);
		if(quantità>0)
		{
			this.quantità = quantità;
		}
		else
		{
			throw new IllegalArgumentException( " quantità deve essere maggiore di 0");
			
		}
		
		
	}

	@Override
	public String toString() {
		return "Bibita [quantità=" + quantità + "]";
	}

	public double getQuantità() {
		return quantità;
	}

	
	
	
}