import java.util.Scanner;

public class NotAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();

		Boolean passou = nota >= 70;

		if (passou) {
			System.out.println("O aluno (a) passou!");
		} else {
			System.out.println("O aluno(a) não passou!");
		}
		scanner.close();
	}

}
