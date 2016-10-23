package Aula5.Exercicio6;

public class Main {
	public static void main (String[] args)
	{
		Moto moto = new Moto("Kawasaky", "Ninja", "Verde");
		moto.marchaAcima();
		moto.marchaAcima();
		moto.marchaAbaixo();
		System.out.println(moto.imprimir());
	}

}

