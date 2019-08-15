import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 =entrada.nextInt();
		
		System.out.print("Digite um número maior que o primeiro: ");
		int num2 = entrada.nextInt();
		
		int imp = num1;
		int soma = 0;
		
		while (imp < (num2 - 1)) {
		imp++;
		System.out.print(imp+" ");
		soma = soma + imp;
		}
		
		System.out.println(" ");
		System.out.println(soma);
	}
}