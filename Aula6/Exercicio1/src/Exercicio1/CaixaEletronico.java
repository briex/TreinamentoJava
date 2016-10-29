package Exercicio1;

import java.util.ArrayList;

public class CaixaEletronico {
	 int saldo;
	 ArrayList<Nota> nota = new ArrayList<Nota>();
	 
	 public CaixaEletronico()
	 {
		 Nota notas2 = new Nota("notas2", 2, 10);
		 Nota notas5 = new Nota("notas5", 5, 10);
		 Nota notas10 = new Nota("notas10", 10, 10);
		 Nota notas20 = new Nota("notas20", 20, 10);
		 Nota notas50 = new Nota("notas30", 50, 1);
		 
		 nota.add(notas2);
		 nota.add(notas5);
		 nota.add(notas10);
		 nota.add(notas20);
		 nota.add(notas50);
		 saldo = 0;
	 }
	 	 
	 public int calculaSaldo ()
	 { 
		 for (int i= nota.size()-1;i>=0;--i)
		 {
			saldo += (nota.get(i).qtdSaldo * nota.get(i).valor); 
		 }
		 return saldo;
	 }
	
	 public String efetuaSaque(int valor)
	 {	
		 int valorOriginal = valor;
		 String retorno="";
		 if (valor < calculaSaldo())
		 {
			 for (int i= nota.size()-1;i>=0;--i)
			 {
				 if (nota.get(i).qtdSaldo>0)
				 {
					 nota.get(i).qtdSaldo -= (valor / nota.get(i).valor);
					 nota.get(i).qtdSaque = (valor / nota.get(i).valor);
					 valor = valor % nota.get(i).valor;

					 if (nota.get(i).valor % 2 != 0 && (valor + nota.get(i).valor) % 2 == 0 )
					 { 
						 valor += this.voltaNota(nota.get(i),valor);
					 }
					 if (nota.get(i).valor>=10 && valor == 1)
					 {
						 valor += this.voltaNota(nota.get(i),valor);
					 }
					 if (nota.get(i).qtdSaldo<nota.get(i).qtdSaque)
					 {
						 valor += this.voltaNota(nota.get(i),valor);
					 }
				 }
					 retorno += ("Notas de " + nota.get(i).valor + ": " + nota.get(i).qtdSaque + "\n");
			 	}
		 }
	
		if (verificaSaque(valorOriginal))
		{
			return retorno;
		}
		else
		{
			this.devolveValores();
			return "Saque não efetuado";
		}
	 }
	 
	 public String ConsultaSaldo() 
	 {
		 String retorno = "";
		 for (int i= nota.size()-1;i>=0;--i)
		 {
			retorno += ( "Notas de R$"+nota.get(i).valor +" "+ nota.get(i).qtdSaldo + "\n"); 
		 }
		 return retorno;
	 }
	 
	 public boolean verificaSaque (int valorOriginal)
	 {
		 int valorConferencia = 0;
		
		 for (int i= nota.size()-1;i>=0;--i)
		 {
			 valorConferencia += nota.get(i).qtdSaque*nota.get(i).valor;
		 }
		 if (valorOriginal==valorConferencia)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	 }
	 
	 public void devolveValores()
	 {
		 for (int i= nota.size()-1;i>=0;--i)
		 {
			 nota.get(i).qtdSaldo += nota.get(i).qtdSaque;
		 }
	 }
	 
	 public int calculaValorSaque()
	 {
		 int valor = 0;
		 for (int i= nota.size()-1;i>=0;--i)
		 {
			 valor += nota.get(i).qtdSaque*nota.get(i).valor;
		 }
		 return valor;
	 }
	 public String testeValoresArray()
	 {
		 String retorno = "";
		 for (int i= nota.size()-1;i>=0;i--)
		 {
			retorno += "\n Saldo: " + nota.get(i).qtdSaldo + " * " +  nota.get(i).valor + " = " + nota.get(i).qtdSaldo * nota.get(i).valor; 
		 }
		 return retorno;
	 }
	 private int voltaNota(Nota nota, int valor)
	 {
		 if(nota.qtdSaque>0)
		 { 
			 nota.qtdSaque -= 1;
		 	 nota.qtdSaldo += 1;
		 }
		 return nota.valor;
		
	 }
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
	 



