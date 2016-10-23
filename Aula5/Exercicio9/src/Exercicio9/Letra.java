package Exercicio9;

public class Letra {
	
	public String TestaLetra(char c) {
		  return this.ehVogal(c) ? "Vogal" : "Consoante";
		}
	
	public boolean ehVogal(char c)
	{
		return "AEIOUaeiou".indexOf(c) != -1;
	}

	public boolean ehConsoante (char c)
	{
		return !this.ehVogal(c);
	}
	
	public String TestaLetra(int codASCII) 
	{
		  return this.ehVogal((char)codASCII) ? "Vogal" : "Consoante";
	}
	
	public boolean ehVogal(int codASCII)
	{
		return "AEIOUaeiou".indexOf((char)codASCII) != -1;
	}

	public boolean ehConsoante (int codASCII)
	{
		return !this.ehVogal((char)codASCII);
	}
	
}

