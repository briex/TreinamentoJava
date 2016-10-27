package Exercicio2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente();
		corrente.depositar(200f);
		System.out.println(corrente.getSaldo());
		corrente.atualizar();
		System.out.println(corrente.getSaldo());
	}

}
