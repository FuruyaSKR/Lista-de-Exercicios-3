import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int seq = entrada.nextInt();
		
		int i = 0;
		
		int ant = 1;
		
		System.out.print(ant+", ");
		while (i < 10) {
			System.out.print(ant+", ");
			ant = seq + ant;
			seq = ant - seq;
			i++;
		}
	
	}

}
