package Aula3.Exercicio3;

public class Calculadora {
	private int primeiraFaixa;
	private int segundaFaixa;
	private int terceiraFaixa;
	private int totVlVenda;
	private int totVlCompra;
	
	public int getPrimeiraFaixa() 
	{
		return primeiraFaixa;
	}
	
	public void setPrimeiraFaixa(int primeiraFaixa)
	{
		this.primeiraFaixa = primeiraFaixa;
	}
	
	public int getSegundaFaixa()
	{
		return segundaFaixa;
	}
	
	public void setSegundaFaixa(int segundaFaixa) 
	{
		this.segundaFaixa = segundaFaixa;
	}
	
	public int getTerceiraFaixa() 
	{
		return terceiraFaixa;
	}
	
	public void setTerceiraFaixa(int terceiraFaixa)
	{
		this.terceiraFaixa = terceiraFaixa;
	}
	
	public int getTotVlVenda() 
	{
		return totVlVenda;
	}
	
	public void setTotVlVenda(int totVlVenda) 
	{
		this.totVlVenda = totVlVenda;
	}
	
	public int getTotVlCompra() {
		return totVlCompra;
	}
	
	public void setTotVlCompra(int totVlCompra) {
		this.totVlCompra = totVlCompra;
	}
	
	public float CalculoPorcentagem (int tot, int parc)
	{
		float porcentagem;
		porcentagem = (parc*100)/tot;
		return porcentagem;
	}
	
	public float CalculaLucro (int vlCompra, int vlVenda)
	{
		float percLucro;
		int lucro = vlVenda-vlCompra;
		percLucro = this.CalculoPorcentagem(vlCompra, lucro);
		return percLucro;
	}
	
	public void CalculaContaLucro(int vlCompra, int vlVenda)
	{
		float percLucro;
		percLucro = this.CalculaLucro(vlCompra, vlVenda);
		
		if (percLucro<=10.0f)
		{
			primeiraFaixa++;
		}
		if (percLucro>10.0f && percLucro<= 20.0f)
		{
			segundaFaixa++;
		}
		if (percLucro>20.0f)
		{
			terceiraFaixa++;
		}
		totVlCompra = totVlCompra + vlCompra;
		totVlVenda = totVlVenda + vlVenda;
	}
	

}
