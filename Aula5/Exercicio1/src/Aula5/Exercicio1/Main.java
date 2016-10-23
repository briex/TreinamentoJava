package Aula5.Exercicio1;

public class Main {
	
	public static void main(String[] args)
	{
	String nome = "Jessica";
	String endereco = "General Daltro Filho";
	String telefone = "55 2222-5354";
				
	Pessoa pessoa = new Pessoa(nome,endereco,telefone);
	System.out.println(pessoa.impressao());
	
	}

}
