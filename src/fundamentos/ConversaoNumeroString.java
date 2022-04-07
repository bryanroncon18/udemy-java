package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		// Numero --> String
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		Integer num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println((""+ num2).length());
		System.out.println((""+ num1).length());
		
		
		// String --> Numero
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma= numero1 + numero2;
		System.out.println("Soma e " + soma);
		System.out.println("Media e " + soma/2);
		
	}

}
