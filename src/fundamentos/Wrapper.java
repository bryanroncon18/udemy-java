package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//byte
		
		//Integer.parseInt(keyboard.next());
		Integer i= 10000; //int
		Byte b = 100;
		Short s= 1000;
		Long l= 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		
		
		Boolean bo= Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		keyboard.close();
		
		
			
		

	}

}
