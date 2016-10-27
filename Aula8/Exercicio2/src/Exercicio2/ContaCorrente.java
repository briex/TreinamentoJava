package Exercicio2;

public class ContaCorrente extends Conta {

	public ContaCorrente() 
	{
		super();
	}
	
	@Override
	public void atualizar()
	{	
		setSaldo(getSaldo() + (getSaldo()*0.04f) );
	}
	@Override
	public void depositar(float valor)
	{
		super.depositar(valor - valor*0.10f);
	}
	

}
