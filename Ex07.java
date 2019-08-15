import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 =entrada.nextInt();
		
		System.out.print("Digite um número maior que o primeiro: ");
		int num2 = entrada.nextInt();
		
		int imp = num1;
	
		while (imp < num2) {
		System.out.print(imp+" ");
		imp++;
		
		}
	}
}
