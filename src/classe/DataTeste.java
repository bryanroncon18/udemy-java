package classe;

import java.sql.Date;
import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Data x= new Data();
		System.out.println("Digite o dia");
		x.dia= teclado.nextInt();
		System.out.println("Digite o mes");
		x.mes= teclado.nextInt();
		System.out.println("Digite o ano ");
		x.ano= teclado.nextInt();
		
		System.out.println(x.dia + "/" + x.mes + "/" +  x.ano);
		
		
		
		
		
		
		teclado.close();
	}

}
