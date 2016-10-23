package Exercicio4;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public int getQtdAtual() 
	{
		return qtdAtual;
	}
	
	public void setQtdAtual(int qtdAtual) 
	{
		this.qtdAtual = qtdAtual;
	}
	
	
	public int getQtdMinima() 
	{
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) 
	{
		this.qtdMinima = qtdMinima;
	}

	public void mudarNome(String nome)
	{
		this.nome = nome;
	}
	
	public void mudarQtdMinima(int qtdMinima)
	{
		
	}
	
	public void repor(int qtd)
	{
		qtd = qtd + getQtdAtual();
		setQtdAtual(qtd);
	}
	
	public boolean darBaixa(int qtd)
	{
		if (!verSaldo(qtd))
			return false;
					
		qtd = getQtdAtual() - qtd;
		setQtdAtual(qtd);
		
		return true;
	}
	
	public String mostra()
	{
		return ( "Prututo: " + nome + " Quatidade Atual: " + qtdAtual + " Quantidade mínima: " + qtdMinima);
	}
	
	public boolean precisaRepor()
	{
		return (qtdMinima >= qtdAtual);
	}
	public boolean verSaldo (int qtd)
	{
		return (qtd <= qtdAtual);
	}

	
	

	

}
