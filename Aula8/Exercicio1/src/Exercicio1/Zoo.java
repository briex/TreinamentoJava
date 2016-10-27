package Exercicio1;

import java.util.ArrayList;

public class Zoo {
	 private ArrayList<Jaula> jaulas = new ArrayList<>();
	 
	 public void addJaula (Jaula jaula)
	 {
		 jaulas.add(jaula);
	 }
	 public String impressao()
	 {
		String retorno= ""; 
		 for (Jaula jaulas : jaulas) 
		 {
	            if (jaulas.animal instanceof Peixe) 
	            { 
	            	retorno += "\n" + jaulas.animal.mover();
	            }
	            if (jaulas.animal instanceof Mamifero) 
	            { 
	            	retorno += "\n" + jaulas.animal.mover();
	            }
	            retorno += " " + jaulas.animal.som; 

	     }
		 return retorno;
	 }

}
