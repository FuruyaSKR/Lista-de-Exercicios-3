import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos produtos são? ");
		int prod = entrada.nextInt();
		while(prod > 50) {
			System.out.println("Número de produtos acima do limite\nFavor pegar menos que 50 produtos");
			System.out.print("Quantos produtos? ");
			prod = entrada.nextInt();	
		}	
			
		float total = (float) 1.99; 
		
		System.out.println("\nLojas Quase Dois - Tabela de preços\n");
		for(int i = 0; i < prod; i++) {
			System.out.printf((i + 1)+" - R$ %.2f %n",(total));
			total = (float) (total + 1.99);

	}

}
}