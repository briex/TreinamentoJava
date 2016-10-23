package Aula3.Exercicio3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int vlCompra, vlVenda,i=1;
		int qtd = 3;
		Calculadora calculo = new Calculadora();
		Scanner input = new Scanner(System.in);
		
		while (qtd>=i)
		{
			System.out.println("Digite o preço de compra do produto: ");
			vlCompra = input.nextInt();		
			System.out.println("Digite o preço de venda do produto: ");
			vlVenda = input.nextInt();
			calculo.CalculaContaLucro(vlCompra, vlVenda);
			i++;
		}
	
		
		System.out.println("Produtos com lucro < 10%: " + calculo.getPrimeiraFaixa());
		System.out.println("Produtos com lucro entre 10% e 20%; " + calculo.getSegundaFaixa());
		System.out.println("Produtos com lucro > 20%: " + calculo.getTerceiraFaixa());
				
				
		System.out.println("Preço total de compra: R$" + calculo.getTotVlCompra());
		System.out.println("Preço total de Venda: R$" + calculo.getTotVlVenda());
		System.out.println("Lucro total (%): " +calculo.CalculaLucro(calculo.getTotVlCompra(), calculo.getTotVlVenda()));
		
	}
	

}
