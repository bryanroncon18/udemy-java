package fundamentos;

import java.util.Scanner;

public class ExercicioIMC {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insira seu peso em KG: ");
		double peso= keyboard.nextDouble();
		
		System.out.println("Insira sua altura: ");
		double altura= keyboard.nextDouble();
		
		double imc = peso/Math.pow(altura, 2);
		
		System.out.printf("Seu IMC é --> %.2f" , imc);
		
		keyboard.close();
		

	}

}
