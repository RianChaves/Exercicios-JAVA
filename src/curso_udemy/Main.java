package curso_udemy;


import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		String cidade;
		int idade;
		String telefone;
		
		
		
	     System.out.println("Nome: ");
	     nome = sc.next();
	     
	     System.out.println("Sua cidade: ");
	     cidade = sc.next();
	      
	     System.out.println("telefone: ");
	     telefone = sc.next();
	     
	     System.out.println("sua idade: ");
	     idade = sc.nextInt();
	     
	     if (idade >= 18) {
	         System.out.println("Você pode se inscrever");
	      }
	     else {
	    	 System.out.println("Você não pode se inscrever");
	     }
	     		
		
		
		
		
				
		
		sc.close();       
		
		
		
		
		
		
	}
}