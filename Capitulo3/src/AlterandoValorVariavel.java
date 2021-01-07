import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner (System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite o tipo de pagamento: [1 = á vista ---- 2 = a prazo ] ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAvista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (pagamentoAvista) {
			//OU juros = 0.0
		}else {
			juros = 20.0;
			 
			//Double juros = 0.0;
			// if ( !pagamentoAvista){
			//juros = 10.0;
		}
		Double acrescimo =valorProduto * juros /100; 
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("valor total :  " +  valorTotal);
				
		scanner.close();
		
		
		
	}
}
