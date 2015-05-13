package gestionemerende;

public class Articolo {
	private String codice;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;
	/**
	 * @param codice
	 * @param descrizione
	 * @param costoUnitario
	 * @param apportoCalorico
	 */
	public Articolo(String codice, String descrizione, double costoUnitario,
			double apportoCalorico) {
		if(codice != null){
			this.codice = codice;
		}
		else{
			throw new IllegalArgumentException( "codice non può essere null");
		}
		if(descrizione != null)
		{
			this.descrizione = descrizione;
		}
		else
		{
			throw new IllegalArgumentException( "descrizione non può essere null");
		}
		if(costoUnitario > 0)
		{
			this.costoUnitario = costoUnitario;
		}
		else
		{
			throw new IllegalArgumentException( " costoUnitario deve essere maggiore di 0");
		}
		if(apportoCalorico >= 0)
		{
			this.apportoCalorico = apportoCalorico;
		}
		else
		{
			throw new IllegalArgumentException( " appoprtoCalorico non può essere minore di 0");
		}
	}
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @return the costoUnitario
	 */
	public double getCostoUnitario() {
		return costoUnitario;
	}
	/**
	 * @return the apportoCalorico
	 */
	public double getApportoCalorico() {
		return apportoCalorico;
	}
	@Override
	public String toString() {
		return "Articolo [codice=" + codice + ", descrizione=" + descrizione
				+ ", costoUnitario=" + costoUnitario + ", apportoCalorico="
				+ apportoCalorico + "]";
	}
	
	

}