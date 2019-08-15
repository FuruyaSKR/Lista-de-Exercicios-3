import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos pães você deseja? ");
		int prod = entrada.nextInt();
		while(prod > 50) {
			System.out.println("Acabou os pães :c\nPor Favor pegue menos que 50 pães");
			System.out.print("Quantos pães? ");
			prod = entrada.nextInt();	
		}	
			
		float total = (float) 0.18; 
		
		System.out.println("\nPreço do pão: R$ 0.18\n\nPanificadora Pão de Ontem - Tabela de preços\n");
		for(int i = 0; i < prod; i++) {
			System.out.printf((i + 1)+" - R$ %.2f %n",(total));
			total = (float) (total + 0.18);

	}

}
}