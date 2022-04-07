package estruturasControle;

import java.util.Scanner;

public class DesafioBla {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		
		String valor ="";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você Diz: ");
			valor = teclado.nextLine();
				
		}
		
		System.out.println("FIM");
		
	

	   teclado.close();
	
	}

	
	
}
