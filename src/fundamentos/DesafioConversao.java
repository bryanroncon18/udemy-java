package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.println("Digite o salario do mes 1 ");
		String salario1 = keyboard.nextLine().replace(",", "."); //replace faz c q o . ou a ,
		                                                         // possa ser utilizado
		System.out.println("Digite o salario do mes 2 ");
		String salario2 = keyboard.nextLine().replace(",", ".");
		
		System.out.println("Digite o salario do mes 3 ");
		String salario3 = keyboard.nextLine().replace(",", ".");
		
		double mes1= Double.parseDouble(salario1);
		double mes2= Double.parseDouble(salario2);
		double mes3= Double.parseDouble(salario3);
		
		double soma = mes1+mes2+mes3;
		
		
		
		System.out.println("A media salarial dos ultimos 3 meses e " + soma/3);
		
		keyboard.close();
		
		
		
		

	}

}
