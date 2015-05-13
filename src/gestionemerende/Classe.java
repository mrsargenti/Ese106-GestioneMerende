package gestionemerende;

import java.util.Vector;

public class Classe {
	private String nome;
	private Vector<Ordine> ordini;

	/**
	 * @param nome
	 */
	public Classe(String nome) {
		if(nome != null){
			this.nome = nome;
		}
		else{
			throw new IllegalArgumentException( "nome non può essere null");
		    
		}
		ordini = new Vector<Ordine>();
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	public Vector<Ordine> getOrdini() {
		return ordini;
	}

	@Override
	public String toString() {
		return "Classe [nome=" + nome + ", ordini=" + ordini + "]";
	}
	
	public void addOrdine(Ordine o) throws Exception{
		
		if(o != null){
			
		    boolean disponibile = true;
			
			for(Ordine o1 : this.ordini){
				
				if(o1.getCodice().equals(o.getCodice())){
					
					
			       disponibile = false;
					
				}
			
				
			}
			
			if(disponibile == true){
				
			    ordini.addElement(o);
			    o.setClasse(this);
			}
			else{
				
				throw new IllegalArgumentException("in questa data la classe ha gia effettuato un ordine");
				
			}
			
		}
		else{
			throw new IllegalArgumentException("ordine non può essere null");
		}
		
		
	}

}
