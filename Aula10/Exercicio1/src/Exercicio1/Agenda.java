package Exercicio1;

import java.util.ArrayList;



public class Agenda {
	ArrayList<Contatos> contatos = new ArrayList<>();
	
	public Agenda() 
	{
		
		
	}
	public void addContatos (Contatos contato)
	{
		contatos.add(contato);
	}
	public String imprimeContatos () 
	{
		String retorno = "";
		for (Contatos c : contatos)
		{
			retorno += c.imprimeContato();
		}
		return retorno;
	}
	public void removeContatos (String nome)
	{
		for (Contatos c : contatos)
		{
			if (Contatos.contains(nome))
			{
				contatos.remove(nome);
			}
		}
	}
	

}
