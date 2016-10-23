package Aula3.Exercicio2;

public class Calculo {
	
	public int maior;
	public int menor;
	public int qtd;
	public int soma;
	
	public void CalculaMaior (int num)
	{
		if (num>this.maior)
		{
			this.maior = num;
		}
		if (num<=this.maior)
		{
			this.menor = num;
		}
		this.qtd++;
		this.Acumula(num);
	}
	
	private void Acumula(int num)
	{
		this.soma = this.soma + num;
	}
	
	public double CalculaMedia (int dividendo, int divisor)	
	{
		double media = dividendo/divisor;
		return media;
	}
}
