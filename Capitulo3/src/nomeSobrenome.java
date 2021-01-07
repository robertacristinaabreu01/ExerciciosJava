import java.util.Scanner;

public class nomeSobrenome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o segundo nome: ");
		String sobrenome = scanner.nextLine();
		
		
		System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
		
		scanner.close();

	}

}
