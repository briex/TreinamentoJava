package Aula5.Exercicio1;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public Pessoa (String nome, String endereco, String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String impressao()
	{
		String retorno;
		retorno = "Nome: "+ this.nome + " Endereço: " + this.endereco + " Telefone: " + this.telefone;
		return retorno;
	}

}
