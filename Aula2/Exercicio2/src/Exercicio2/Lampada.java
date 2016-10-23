package Exercicio2;

public class Lampada {
	private boolean ligada;

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void liga(){
		this.setLigada(true);
	}
	
	public void desliga(){
		this.setLigada(false);
	}
	
	public String observa(){
		
		return (this.isLigada()) ? "ligada" : "desligada";
		
	}
	

}
