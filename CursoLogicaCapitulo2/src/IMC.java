import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso (KG): ");
		Double valorPeso = scanner.nextDouble();
		
		System.out.print(" Digite a altua(Cm): ");
		Double valorAltura = scanner.nextDouble();
		
	Double resultado = valorPeso/ (valorAltura *valorAltura);	
		
		System.out.println("Troco: " +  resultado);
		scanner.close();
	}

}
