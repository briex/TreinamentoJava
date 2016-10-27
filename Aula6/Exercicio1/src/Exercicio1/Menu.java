package Exercicio1;
import java.util.Scanner;

public class Menu {

	public static void menu(){
        System.out.println("\tCaixa eletrônico - Digite o tipo de usuário");
        System.out.println("1. Cliente");
        System.out.println("2. Funcionário");
    }

    public static void cliente(){
        System.out.println("Você entrou no módulo cliente.");
        
    }
    
    public static void funcionario(){
        System.out.println("Você entrou no módulo Funcionário.");
    }

    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                cliente();
                break;
                
            case 2:
                funcionario();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
