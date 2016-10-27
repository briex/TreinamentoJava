package Exercicio1;

public class TesteAnimais {
	
	public void imprimeAnimais()
	{
		Peixe peixe = new Peixe("Tubarão", "Cinzento", 300, 1.5f, "Mar", "Barbatana e cauda");
		Mamifero mamifero = new Mamifero("Macaco", "Preta", "Vegetais", "Matagal", 80, 1.0f, 4);
		System.out.println(peixe.dados());
		System.out.println("____________________________________________");
		System.out.println(mamifero.dados());
	}

}
