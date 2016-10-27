package Exercicio1;

public class Animal {
	
	String nome;
	int comprimento;
	String cor;
	String ambiente;
	float velocidade;
	String som;

	
	Animal (String nome, String cor, int comprimento, String ambiente, float velocidade, String som)
	{
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
		this.som = som;
	}
	
	void alteraNome(String nome)
	{
		this.nome = nome;
	}
	
	void alteraComprimento(int comprimento)
	{
		this.comprimento = comprimento;
	}
	
	void alteraCor(String cor)
	{
		this.cor = cor;
	}
	
	void alteraAmbiente(String ambiente)
	{
		this.ambiente = ambiente;
	}
	
	void alteraVelocidade(float velocidade)
	{
		this.velocidade = velocidade;
	}
	public String dados( )
	{
		return (" Animal: " + nome +
				"\n Comprimento: " + comprimento + " mts" +
				"\n Cor: " + cor + 
				"\n Ambiente: " + ambiente +
				"\n Velocidade: " + velocidade);
		
	}
	public String getNomeAnimal()
	{
		return this.nome;
	}
	
	public String mover() 
	{
        return "Nome do Animal:" + getNomeAnimal() + "- Animal - Mover!";
	}


}
