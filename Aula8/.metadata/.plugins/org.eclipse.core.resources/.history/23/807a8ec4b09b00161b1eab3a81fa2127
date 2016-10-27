package Exercicio1;

public class Mamifero extends Animal {
	String alimento;
	int patas;
	
	Mamifero (String nome, String cor, String alimento, String ambiente, int comprimento, float velocidade, int patas)
	{
		super(nome, cor,comprimento, ambiente, velocidade);
		this.alimento = alimento;
		this.patas = patas;
	}
	
	public void alteraAlimento(String alimento)
	{
		this.alimento = alimento;
	}
	public String alimento()
	{
		return this.alimento; // retorna o alimento de um determinado uso
	}
	
	public void alteraPatas(int patas)
	{
		this.patas = patas;
	}
	
	@Override
	public String dados()
	{
		return super.dados() + "\n Patas: " + this.patas + "\n Alimento: " + this.alimento;
	}
	



}
