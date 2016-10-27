package Exercicio1;

public class Nota {
	
	String nome;
	int valor;
	int qtdSaldo;
	int qtdSaque;
	
	
	public Nota(String nome, int valor, int qtdSaldo) 
	{
		this.nome = nome;
		this.valor = valor;
		this.qtdSaldo = qtdSaldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

/*	public Nota (int qtdSaque)
	{
		qtdSaldo = qtdSaldo - qtdSaque;
	}*/
	
	public int getValor() 
	{
		return valor;
	}
	
	public void setValor(int valor) 
	{
		this.valor = valor;
	}
	
	public int getQtdSaldo() 
	{
		return qtdSaldo;
	}
	
	public void setQtdSaldo(int qtdSaldo) 
	{
		this.qtdSaldo = qtdSaldo;
	}
	
	public int getQtdSaque() 
	{
		return qtdSaque;
	}
	
	public void setQtdSaque(int qtdSaque) 
	{
		this.qtdSaque = qtdSaque;
	}
	
	

}
