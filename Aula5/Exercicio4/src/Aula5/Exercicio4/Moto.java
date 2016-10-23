package Aula5.Exercicio4;

public class Moto {
	private String marca;
	private String modelo;
	private String cor;
	private int marcha; 
	
	public Moto (String marca, String modelo, String cor, int marcha){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
	}
	
	public String imprimir()
	{
		String retorno;
		return retorno = ("Marca: " + marca + " Modelo: " + modelo + " Cor: " + cor + " Marcha: " + marcha);
	}

}
