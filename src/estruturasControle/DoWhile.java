package estruturasControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String texto= "";
		
		do {
			System.out.println("Fale as palavras mágicas ");
			System.out.println("Quer sair?? ");
			
			texto = teclado.nextLine();
		}while (!texto.equalsIgnoreCase("por favor"));
	
		
		System.out.println("Tchau");
		
		
		teclado.close();

	}

}
