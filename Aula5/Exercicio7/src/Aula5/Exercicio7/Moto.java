package Aula5.Exercicio7;


public class Moto {
	private String marca;
	private String modelo;
	private String cor;
	private int marcha; 
	private int menorMarcha;
	private int maiorMarcha;
	
	public Moto (String marca, String modelo, String cor, int menorMarcha, int maiorMarcha){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = 0;
		this.menorMarcha = menorMarcha;
		this.maiorMarcha = maiorMarcha;
	}
	
	public String imprimir()
	{
		return ("Marca: " + marca + " Modelo: " + modelo + " Cor: " + cor + " Marcha: " + marcha);
	}

	public void marchaAcima ()
	{
		if (marcha < maiorMarcha )
		{
			this.marchaAcima(1);
		}
	}
	
	public void marchaAbaixo ()
	{
		if (marcha > menorMarcha)
		{
			this.marchaAbaixo(1);
		}
	}
	
	public void marchaAcima (int marcha)
	{
		if (marcha <= maiorMarcha && marcha + this.marcha <= maiorMarcha)
		{
			this.marcha = this.marcha + marcha;
		}
	}
	
	public void marchaAbaixo (int m)
	{
		if (marcha >= menorMarcha && marcha - m >= menorMarcha)
		{
			this.marcha = this.marcha - m;
		}
		
	}
	
}
