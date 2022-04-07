package estruturasControle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		
		
		System.out.println("Insira sua nota");
		String conceito = "";
		int nota =teclado.nextInt() ;

		switch (nota) {
		case 10:
		case 9:			
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
			default: 
				conceito = "F udeu";
			

		}
            
		
		System.out.println("O conceito é " + conceito);
		teclado.close();
	}
}
