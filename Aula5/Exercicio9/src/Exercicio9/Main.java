package Exercicio9;
import java.util.Scanner;

public class Main {
	public static void main (String[] args)
	{
		char c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a letra: ");
		c = scan.next().trim().charAt(0);
		Letra letra = new Letra();
		System.out.println("A letra é " + letra.TestaLetra(c));
		System.out.println(letra.TestaLetra(65));
		
	}

}
