package estruturasControle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um número --> ");
		int x = teclado.nextInt();
		
		if (x%2 == 0) {
			System.out.println("Numero é par");
			
		} else {
			System.out.println("Número é impar ");
		}
				
		
		
		
		

		teclado.close();
	}

}
