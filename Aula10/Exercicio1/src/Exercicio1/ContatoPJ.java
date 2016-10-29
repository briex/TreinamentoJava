package Exercicio1;

public class ContatoPJ extends Contatos{
	
	private String cnpj;

	public ContatoPJ(String nome, String telefone, String cnpj) {
		super(nome, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String imprimeContato() 
	{
		return super.imprimeContato() +  "\n CNPJ: " + cnpj;
	}
	

}
