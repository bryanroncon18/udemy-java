package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//informacao dos funcionarios
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 3276;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numericos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 289739271.01;
		
		//tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		// dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status? " + status);
		
				
				
		

	}

}
