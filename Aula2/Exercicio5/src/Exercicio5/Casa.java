package Exercicio5;
import java.util.ArrayList;

public class Casa {
	public String cor;
	public int abertas, fechadas;
	
	private ArrayList<Porta> porta;
	
	public Casa()
	{
		porta = new ArrayList<Porta>();
	}
	
	public void Addportas(Porta porta) 
	{	
		this.porta.add(porta);
	}
	
		
	void pinta(String s)
	{
		this.cor = s;
	}	
	
	public int quantasPortasEstaoAbertas()
	{
		
		for(Porta porta : porta)
		{
			if(porta.estaAberta())
			{
			abertas++;
			}
		}
		return abertas;
		
	}


}
