package Exercicio3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
	double lado;
	Quadrado quadrado = new Quadrado();
	
	Scanner imput = new Scanner(System.in);
	System.out.print("Digite as medidas do lado: ");
	lado = imput.nextDouble();
	quadrado.setLado(lado);
	System.out.println("Perímetro: "+ quadrado.perimetro());
	System.out.println("Área: " + quadrado.area());
	imput.close();
		
	}

}
