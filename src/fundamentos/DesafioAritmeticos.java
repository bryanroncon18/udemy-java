package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		
		
		//lado esquerdo
		var oper1= Math.pow(6*(3+2), 2);
		var oper2= 3*2;
		var esquerda= oper1/oper2;
		
		
		//lado direito
		var oper3= (1-5)*(2-7);
		var oper4 = oper3/2;
		var direita= Math.pow(oper4, 2);
		
		//numerador
		var cima= Math.pow((esquerda-direita),3);
		
		//total
		var total= cima/ Math.pow(10, 3);
		
		System.out.println(total);
				
				
	
	
	
	
	
	}
		

	


}


