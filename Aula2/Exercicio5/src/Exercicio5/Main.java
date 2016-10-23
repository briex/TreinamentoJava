package Exercicio5;


//crie uma porta, abra e feche a mesma, pinte‐a de diversas cores, 
//altere suas dimensões e use o método estaAberta para verificar se ela está aberta.

public class Main {
	public static void main(String[] args)
	{
		// - Porta
		Porta door = new Porta();
		door.fecha();	
		System.out.println("A porta agora está aberta? " + door.estaAberta());
		door.abre();
		System.out.println("A porta agora está aberta? " + door.estaAberta());
		door.pinta("Azul");
		System.out.println("Agora a porta é: " + door.getCor());
		door.pinta("Vermelha");
		System.out.println("Agora a porta é: " + door.getCor());
		door.pinta("Preta");
		System.out.println("Agora a porta é: " + door.getCor());
		door.setDimensaoX(60);
		door.setDimensaoY(2.10);
		door.setDimensaoZ(0.5);
		System.out.println("As novas dimensoes da porta são: " + door.dimensaoX + " X " + door.dimensaoY + " X " + door.dimensaoZ);
		
		// - Casa
		
		
		
		Porta porta1 = new Porta();
        porta1.abre();
        Porta porta2 = new Porta();
        porta1.abre();
        Porta porta3 = new Porta();
        porta1.abre();
        
        Casa casa = new Casa();
        casa.pinta("Azul");
        casa.Addportas(porta1);
        casa.Addportas(porta2);
        casa.Addportas(porta3);
        
        System.out.println("Quantas portas abertas? " + casa.quantasPortasEstaoAbertas() );

		
		
	}
	
	
	
	}


