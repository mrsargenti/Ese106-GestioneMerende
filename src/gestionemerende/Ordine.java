package gestionemerende;

import java.util.Vector;

public class Ordine {
	private String codice;
	Classe classe;
	private Vector<Articolo>articoli;
	/**
	 * @param codice
	 * @param classe
	 */
	public Ordine(String codice) {
		if(codice != null){
		   this.codice = codice;
		}
		else{
			throw new IllegalArgumentException("codice non può essere null");
		}
		
		articoli = new Vector<Articolo>();
	}
	
	
	
	public String getCodice() {
		return codice;
	}



	public Classe getClasse() {
		return classe;
	}



	public Vector<Articolo> getArticoli() {
		return articoli;
	}



	public double getCostoTotale()
	{
		double costoTotale = 0;
		
		for(Articolo a: articoli){
			
			costoTotale = costoTotale + a.getCostoUnitario();
		}
		
		return costoTotale;
	}
	
	public int getNumeroArticoli(){
		
		return articoli.size();
	}
	
	public void addArticolo(Articolo a){
		
		if(a != null){
		
		   this.articoli.addElement(a);
		}
		else{
			throw new IllegalArgumentException("a non può essere null");
		}
		
		
	}

	


	public void setClasse(Classe classe) {
		if(classe != null){
			   this.classe = classe;
			}
			else{
				throw new IllegalArgumentException("classe non può essere null");
			}
	}



	@Override
	public String toString() {
		return "Ordine [codice=" + codice + ", classe=" + classe
				+ ", articoli=" + articoli + "]";
	}
	
	
	

}
