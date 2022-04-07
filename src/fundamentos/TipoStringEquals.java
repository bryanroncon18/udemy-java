package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		String s2 = teclado.next();
		System.out.println("2 == " .equals(s2.trim()));
		
		teclado.close();
	}

}
