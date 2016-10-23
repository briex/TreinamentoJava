package Aula3.Exercicio1;

public class Carros {
	public int totalDefeito;
	
	
	public double CalculaPorcentagem(int total, int carros)
	{
		double porcentagem;
		
		porcentagem = (carros*100/total);
		
		return porcentagem;
	}
	
	public void ConcentraDefeito(int qtd)
	{
		this.totalDefeito = this.totalDefeito + qtd;
	}
	

}
