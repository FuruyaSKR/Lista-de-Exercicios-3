import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos p�es voc� deseja? ");
		int prod = entrada.nextInt();
		while(prod > 50) {
			System.out.println("Acabou os p�es :c\nPor Favor pegue menos que 50 p�es");
			System.out.print("Quantos p�es? ");
			prod = entrada.nextInt();	
		}	
			
		float total = (float) 0.18; 
		
		System.out.println("\nPre�o do p�o: R$ 0.18\n\nPanificadora P�o de Ontem - Tabela de pre�os\n");
		for(int i = 0; i < prod; i++) {
			System.out.printf((i + 1)+" - R$ %.2f %n",(total));
			total = (float) (total + 0.18);

	}

}
}