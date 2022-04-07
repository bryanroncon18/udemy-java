package fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		
		double a = 1; //conversao implicita
		System.out.println(a);
		
		float b = (float) 1.0; //cast, conversao explicita
		System.out.println(b);
		
		int c = 175; 
		byte d = (byte) c; //cast
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; //cast
		System.out.println(f);

	}

}
