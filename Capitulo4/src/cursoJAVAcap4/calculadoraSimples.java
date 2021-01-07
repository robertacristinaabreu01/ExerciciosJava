package cursoJAVAcap4;

import java.util.Scanner;

public class calculadoraSimples {
	public static void main(String[] args) {

			Integer adicao = 1;
			Integer subtracao = 2;
			Integer multiplicacao = 3;
			Integer divisao = 4;
			Integer resultado;

			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite o primeiro numero: ");
			Integer numero1 = scanner.nextInt();

			System.out.print("Digite o segundo numero: ");
			Integer numero2 = scanner.nextInt();

			System.out.print("Digite o numero da operacao : ");
			Integer operacao = scanner.nextInt();

			if (operacao.equals(adicao)) {
				resultado = numero1 + numero2;
				System.out.print("O resultado da Operção em Adição: " + resultado);
			}

			if (operacao.equals(subtracao)) {
				resultado = numero1 - numero2;
				System.out.print("O resultado da Operção em Subtração : " + resultado);
			}

			if (operacao.equals(multiplicacao)) {
				resultado = numero1 * numero2;
				System.out.print("O resultado da Operção em Mutiplicação: " + resultado);
			}

			if (operacao.equals(divisao)) {
				resultado = numero1 / numero2;
				System.out.print("O resultado da Operção em Divisão : " + resultado);
			}
			
			
			scanner.close();

		}

}
