package Aula5.Exercicio7;

public class Main {
	public static void main (String[] args)
	{
		Moto moto = new Moto("Kawasaky", "Ninja", "Verde", 0, 5);
		moto.marchaAcima(2);
		//moto.marchaAcima(7);
		moto.marchaAbaixo(2);
		System.out.println(moto.imprimir());
	}
}

