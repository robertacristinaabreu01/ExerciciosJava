import java.util.Scanner;

public class exerDobro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		Double num = scanner.nextDouble();
		
		Double dobro = num * num;
		
		System.out.println("O dobro de " + num + " ser� "+ dobro);
	}

}
