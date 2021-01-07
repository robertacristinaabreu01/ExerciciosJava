import java.util.Scanner;

/*
 * Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
 *  Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 
10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO
aplica desconto algum.Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, 
dependendo da quantidade) você multiplica o subtotal pelo próprio percentual e divide tudo por 100.
Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar 
será o valor total final e deverá ser apresentado no console.
 */

public class descontoProduto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite a quantidade que deseja deste produto:");
		Double quantidadeProduto = scanner.nextDouble();
		
		quantidadeProduto <= 10;
		if ( quantidadeProduto >=10) {
			quantidadeProduto = 10;
		}		
		Double acrescimo = quantidadeProduto * valorProduto/100;
		Double valorTotal = acrescimo + valorProduto;
		System.out.println("O valor total do produto será: " + valorTotal);
		}
		
	scanner.close();
	}

