import java.util.Scanner;

public class Ex15 {

	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos termos serão impressos? ");
		int num = entrada.nextInt();
		
		int c = 37; int b = 38; int v = 1;
		for(int i = 0; i < num; i++) {
			System.out.println(" S = "+c+"*"+b+")/"+v);
			c--;
			b = b - 2;
			v++;
		}
	}
}
