import java.util.Scanner;

public class Ex14 {

	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos termos serão impressos? ");
		int num = entrada.nextInt();
		
		int c = 1;
		int b = 1;
		for(int i = 0; i < num; i++) {
			System.out.print(" S = "+c+"/"+b);
			c++;
			b = b + 2;
		}
	}
}
