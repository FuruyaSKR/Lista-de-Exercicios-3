import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vão votar? ");
		int pessoas = entrada. nextInt();
		
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		
		for(int x = 0; x < pessoas; x++) {
			System.out.println("Osvaldir Correia: Vote 01");
			System.out.println("Cleiton Rasta: Vote 02");
			System.out.println("Silvio Santos: Vote 03");
			int vote = entrada.nextInt();
			
			switch(vote) {
			case 01: 
				System.out.println("Você votou em Osvaldir Correia");
				cand1++;
				break;
			case 02: 
				System.out.println("Você votou em Cleiton Rasta");
				cand2++;
				break;
			case 03: 
				System.out.println("Você votou em Silvio Santos");
				cand3++;
				break;	
			}
		
		}
		System.out.println("Contagem de votos: ");
		System.out.print("\nOsvaldir Correia: " +cand1);
		System.out.print("\nCleiton Rasta: " +cand2);
		System.out.print("\nSilvio Santos: " +cand3);
}
}