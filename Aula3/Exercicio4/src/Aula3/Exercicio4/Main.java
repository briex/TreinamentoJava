package Aula3.Exercicio4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Chernobyl cher = new Chernobyl();
		System.out.println("Digite a massa do matarial: ");
		System.out.println("A massa do materia degradou-se para: " + cher.DegradaMaterial(input.nextDouble()) + " gramas");
		System.out.println("A massa inicial era: " + cher.getMassaInicial() + " gramas");
		System.out.println("O tempo de degradação foi de: " + cher.calculaTempo());
		input.close();

	}

}
