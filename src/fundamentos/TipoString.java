package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ola Pessoal".charAt(2));
		String s = "Boa Tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 37.890;
		
		System.out.println("Nome:" +nome + " Sobrenome:" +sobrenome);
		
		System.out.printf("Nome: %s %s tem %d anos. E ganha R$%.3f,00", nome, sobrenome, idade, salario); 
		//%s substitui strings %d substitui nmrs inteiros
		String frase = String.format("\nNome: %s %s tem %d anos. E ganha R$%.3f,00", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
