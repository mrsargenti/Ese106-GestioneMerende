package gestionemerende;

public class Panino extends Articolo {
	private boolean vegetariano;
	private boolean contieneCarneSuina;
	/**
	 * @param codice
	 * @param descrizione
	 * @param costoUnitario
	 * @param apportoCalorico
	 * @param contieneCarneSuina
	 * @param vegetariano 
	 */
	public Panino(String codice, String descrizione, double costoUnitario,
			double apportoCalorico,  boolean vegetariano,
			boolean contieneCarneSuina) {
		super(codice, descrizione, costoUnitario, apportoCalorico);
		if(vegetariano==true && contieneCarneSuina==true)
		{
			throw new IllegalArgumentException( "il panino non può essere vegetariano e contenere carne");
		}
		else
		{
			this.vegetariano=vegetariano;
			this.contieneCarneSuina = contieneCarneSuina;
		}
		
	}
	/**
	 * @return the vegetariano
	 */
	public boolean isVegetariano() {
		return vegetariano;
	}
	/**
	 * @return the contieneCarneSuina
	 */
	public boolean isContieneCarneSuina() {
		return contieneCarneSuina;
	}
	@Override
	public String toString() {
		return "Panino [vegetariano=" + vegetariano + ", contieneCarneSuina="
				+ contieneCarneSuina + "]";
	}
	
	
	

}
