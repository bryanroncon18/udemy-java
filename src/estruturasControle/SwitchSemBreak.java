package estruturasControle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite sua faixa");
		String faixa = teclado.next();

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heio Godan");
		case "amarela":
			System.out.println("Sei Heian Shodan");
			
		default:
			System.out.println("Não sei nada");
		}

		System.out.println("FIM!");
		teclado.close();
	}

}
