package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		double num1= keyboard.nextDouble();
		
		
		System.out.println("Informe o n�mero: ");
		double num2= keyboard.nextDouble();
		
		
		System.out.println("Informe a opera��o: ");
		String opera��o = keyboard.next();
		
		//L�gica
		double resultado = "+".equals(opera��o) ? num1 + num2 : 0;
		resultado = "-".equals(opera��o) ? num1 - num2 : resultado;
		resultado = "*".equals(opera��o) ? num1 * num2 : resultado;
		resultado = "/".equals(opera��o) ? num1 / num2 : resultado;
		resultado = "%".equals(opera��o) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f" , num1, opera��o, num2, resultado);
		
		
		
		
		
		
		
		
		
		
		
		keyboard.close();

	}

}
