package estruturasControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o dia da semana ");
		String diaDaSemana = teclado.next();

		if (diaDaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (diaDaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println("2");

		} else if (diaDaSemana.equalsIgnoreCase("Ter�a")) {
			System.out.println("3");

		} else if (diaDaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println("4");

		} else if (diaDaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println("5");

		} else if (diaDaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println("6");

		} else if (diaDaSemana.equalsIgnoreCase("Sabado") 
			|| diaDaSemana.equalsIgnoreCase("S�bado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia Inv�lido!");
		}

		teclado.close();
	}

}
