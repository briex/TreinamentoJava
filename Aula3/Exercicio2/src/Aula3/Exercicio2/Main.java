package Aula3.Exercicio2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int qtd,i=1;
		System.out.println("Quantidade de numeros a serem lidos: ");
		Scanner imput = new Scanner(System.in);
		qtd = imput.nextInt();
		Calculo calculo = new Calculo();
		while (i <= qtd)
		{
			System.out.println("Digite o próximo numero: ");
			calculo.CalculaMaior(imput.nextInt());
			i++;
		}
		
		System.out.println("O maior numero digitado foi: " + calculo.maior);
		System.out.println("O menor numero digitado foi: " + calculo.menor);
		System.out.print("A média dos numeros digitados é: " + calculo.CalculaMedia(calculo.soma, calculo.qtd));
		
		
	}

}
