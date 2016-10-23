package Aula5.Exercicio6;


public class Moto {
	private String marca;
	private String modelo;
	private String cor;
	private int marcha; 
	
	public Moto (String marca, String modelo, String cor){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = 0;
	}
	
	public String imprimir()
	{
		return ("Marca: " + marca + " Modelo: " + modelo + " Cor: " + cor + " Marcha: " + marcha);
	}

	public void marchaAcima ()
	{
		if (marcha < 6)
		{
			this.marcha++;
		}
	}
	
	public void marchaAbaixo ()
	{
		if (marcha!=0)
		{
			this.marcha--;
		}
	}
	
}
