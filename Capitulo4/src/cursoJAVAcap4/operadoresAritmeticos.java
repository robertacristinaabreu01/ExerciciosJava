package cursoJAVAcap4;

public class operadoresAritmeticos {
	
	public static void main(String[] args) {
		
		Integer adicao = 1 +1;
		System.out.println("Adi��o: " + adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtra��o: " + subtracao);
		
		 Integer multiplicacao = 2 * 2;
		 System.out.println("Multiplica��o: " + multiplicacao);
		 
		 Integer divisao = 4 /2;
		 System.out.println("Divis�o: " + divisao);
		 
		 Integer modulo = 7 % 4;
		 System.out.println("M�dulo: " + modulo);
		
		 Integer precedencia1 = 1 + 1 * 5;
		 System.out.println("precedencia1 : " + precedencia1);
		 
		 Integer precedencia2 = ( 1 + 1 ) * 5;
		 System.out.println("Precedencia2: " +  precedencia2);
		 
		 Integer precedencia3 = 5 * (1+1);
		 System.out.println("Precedencia3: " + precedencia3);
		 
		 Integer precedencia4 = 5 * (1+1) +2;
		 System.out.println("Precedencia4: " + precedencia4);
		 
		 Integer precedencia5 =  5 * ((1+1) + 2);
		 System.out.println("Precedencia5: " + precedencia5);
		 
		 Integer cinco =5;
		 Integer um = 1;
		 
		 Integer precedenciaComVariavies = cinco * (um + um);
		 System.out.println("Precedencia Com Variaveis: " + precedenciaComVariavies);
	}

}
