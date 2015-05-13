package gestionemerende;

public class Bibita extends Articolo {

	private double quantit�;

	/**
	 * @param codice
	 * @param descrizione
	 * @param costoUnitario
	 * @param apportoCalorico
	 * @param quantit�
	 */
	public Bibita(String codice, String descrizione, double costoUnitario,
			double apportoCalorico, double quantit�) {
		super(codice, descrizione, costoUnitario, apportoCalorico);
		if(quantit�>0)
		{
			this.quantit� = quantit�;
		}
		else
		{
			throw new IllegalArgumentException( " quantit� deve essere maggiore di 0");
			
		}
		
		
	}

	@Override
	public String toString() {
		return "Bibita [quantit�=" + quantit� + "]";
	}

	public double getQuantit�() {
		return quantit�;
	}

	
	
	
}