package cursoJAVAcap4;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double resultado, num1, num2;
		String SOMA,SUBTRACAO,MULTIPLICACAO, DIVISAO, MODULO, operacao;
		
		System.out.println("Qual opera��o? (soma, subtracao, divisao, multiplicacao ou modulo) : ");
		operacao = scanner.nextLine().toUpperCase();
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = scanner.nextDouble();
		
		System.out.println("Digite o  segundo n�mero : ");
		num2 = scanner.nextDouble();
			
		
			if (operacao.equals("SOMA")){
				System.out.print("Resultado: " + (num1 + num2));
			
			}else if (operacao.equals("SUBTRACAO")) {
				System.out.print("Resultado: " + (num1 - num2));
				
			}else if (operacao.equals("DIVISAO")){
				System.out.print("Resultado: " + (num1 / num2));
						
			}else if (operacao.equals("MULTIPLICACAO")){
				System.out.print("Resultado: " + (num1 * num2));
				
			} else if (operacao.equals("MODULO")) {
				System.out.print("Resultado: " + (num1 % num2));
			}else {
				System.out.println("Opera��o inv�lida, Tente novamente!");
			}
						
		scanner.close();
	}

	
	}


