package Exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		ContatoPF contatopf = new ContatoPF( "Jessica", "5598878988", "02233455655");
		agenda.addContatos(contatopf);
		ContatoPJ contatopj = new ContatoPJ("Diego", "5599887888", "12343333000154");
		agenda.addContatos(contatopj);
		
		System.out.println(agenda.imprimeContatos()); 
		agenda.removeContatos("Diego");
		System.out.println(agenda.imprimeContatos()); 
		
		

	}

}
