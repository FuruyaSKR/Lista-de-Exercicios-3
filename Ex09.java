import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		int i = 0;
			
		while( i <= 10) {
		System.out.println(num+" x "+i+" = "+(num * i));
		i++;
		}
	}
}
