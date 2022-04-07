package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		
		System.out.println(3>4);
		System.out.println(3>=3);
		System.out.println(3 < 7);
		System.out.println(30<=7);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		boolean desconto= bomComportamento== true && nota >=7;
		
		System.out.println("Tem desconto " + desconto);
				
		
		 
	}

}
