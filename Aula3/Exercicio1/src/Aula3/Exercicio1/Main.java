package Aula3.Exercicio1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int carrosX = 120;
		int carrosY = 40;
		int qtd;
		double porcentagem = 0.0;
		
		System.out.print("Quantidade de carros X com defeito: ");
		Scanner imput = new Scanner(System.in);
		qtd = imput.nextInt();
		Carros carros = new Carros();
		porcentagem = carros.CalculaPorcentagem(carrosX, qtd);
		carros.ConcentraDefeito(qtd);
		System.out.println(porcentagem);
		
	
		System.out.print("Quantidade de carros Y com defeito: ");
		qtd = imput.nextInt();
		porcentagem = carros.CalculaPorcentagem(carrosY, qtd);
		carros.ConcentraDefeito(qtd);
		System.out.println(porcentagem);
		
		System.out.print("Quantidade de total com defeito: ");
		System.out.println(carros.CalculaPorcentagem(carrosX+carrosY, carros.totalDefeito ));
		imput.close();
		
	}

}
