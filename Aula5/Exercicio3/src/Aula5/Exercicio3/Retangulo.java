package Aula5.Exercicio3;

public class Retangulo {
	private float comprimento;
	private float largura;
	private float area ;
	private float perimetro;
	
	public Retangulo (float comprimento,float largura) 
	{
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public void calcularArea() 
	{
		area = comprimento * largura;
	
	}
	
	public void calcularPerimetro() 
	{
		perimetro = (comprimento+largura)*2;
	}
	
	public String imprimir()
	{
		String retorno = ("Comprimento: " + comprimento + " Largura: " + largura + " Area: " + area + " Perimetro: " + perimetro);
		return retorno;
		
	}
	
	public void setDados() 
	{
		
	}
	
	public void calcularTudo()
	{
		this.calcularArea();
		this.calcularPerimetro();
	}

}
