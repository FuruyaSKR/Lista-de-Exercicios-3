import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("1 - Executar o programa \n2 - Sair");
		int val = entrada.nextInt();
		
		while (val == 1) {
				
		System.out.println("Quanto é a população do pais A?");
		float pais_a = entrada.nextFloat();
		System.out.println("Quanto é a Taxa de crescimento inicial do Pais A?");
		float taxa_a = entrada.nextFloat();
		System.out.println("Quanto é a população do pais B?");
		float pais_b = entrada.nextFloat();
		System.out.println("Quanto é a Taxa de crescimento inicia do Pais B?");
		float taxa_b = entrada.nextFloat();
		
		int ano = 0; 
		
		while(pais_a <= pais_b) {
			pais_a = (float) (pais_a + (pais_a * (taxa_a / 100)));
			pais_b = (float) (pais_b + (pais_b * (taxa_b / 100)));
			ano++;	
		}
		
		System.out.println("População Pais A: " +pais_a);	
		System.out.println("População Pais B: " +pais_b);
		System.out.println("Foi necessario de " +ano+" Anos para que o Pais A ultrapassasse o Pais B");
		
		System.out.println();
		System.out.println("1 - Executar o programa novamente \n2 - Sair");
		val = entrada.nextInt();
		}
}
}