package estruturasControle;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Digite a nota: ");
		double nota = keyboard.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inv�lida!");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
		} else if (nota >= 6.1) {
			System.out.println("Conceito B");

		} else if (nota >= 4.1) {
			System.out.println("Conceito C");
		} else if (nota >= 2.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito F");
		}

		if (nota > 6.0) {
			System.out.println("Parab�ns! Voc� passou! ");
		} else {
			System.out.println("Nos vemos na recupera��o rs");
		}

		keyboard.close();

	}

}