package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Insira seu nome: " );
		String nome = keyboard.nextLine();
		
		
		System.out.print("Insira seu sobrenome: " );
		String sobrenome= keyboard.nextLine();

	
	    System.out.print("Insira sua idade: " );
		int idade= keyboard.nextInt();
		
		System.out.printf("%s %s e tenho %d anos", nome, sobrenome, idade);
		
		
		keyboard.close();
	}

}
