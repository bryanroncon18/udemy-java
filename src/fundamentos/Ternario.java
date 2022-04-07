package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoRecuperacao = media >= 5 ? "Rec" : "Rep ";
 		String resultado = media >=7.0 ? "Aprovado" : resultadoRecuperacao; //? if : else
 		System.out.println("O aluno esta: " +resultado);
 		
 		System.out.println("Hello World!!!!");
	}

}
