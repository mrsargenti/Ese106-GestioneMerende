package gestionemerende;

import java.util.Vector;

public class Istituto {
	
	private String nome;
	private Vector<Classe> classi;
	
	
	public Istituto(String nome) {
		if(nome != null){
		  this.nome = nome;
		}
		else{
			throw new IllegalArgumentException("nome non può essere null");
		}
		classi = new Vector<Classe>();
	}


	public String getNome() {
		return nome;
	}


	public Vector<Classe> getClassi() {
		return classi;
	}


	@Override
	public String toString() {
		return "Istituto [nome=" + nome + ", classi=" + classi + "]";
	}
	
	public void addClasse(Classe c){
		
		if(c != null){
			
			this.classi.addElement(c);
			
		}
		else{
			throw new IllegalArgumentException("a non può essere null");
		}
		
		
	}

}
