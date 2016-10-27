package Exercicio2;

public class ContaPoupanca extends Conta 
{

	public ContaPoupanca() 
	{
		super();
	}
	@Override
	public void atualizar()
	{
		
		setSaldo(getSaldo() + (getSaldo() * 0.75f));
	}
}
