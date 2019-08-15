import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas? ");
		int pessoas = entrada.nextInt();
		
		int vetor[] = new int [pessoas];
		
		int soma = 0; 
		
		for(int i = 0; i < pessoas; i++) {
			System.out.print("Qual a idade: ");
			vetor[i] = entrada.nextInt();
			soma = soma + vetor[i];
		}
		int media = soma / pessoas;
		
		if(media < 25) {
			System.out.println("\nMedia de idade varia entre 0 e 25 anos");
		} else if((media > 25) && (media < 60)){
			System.out.println("\nMedia de idade varia entre 25 e 60 anos");
		}else if(media > 60) {
			System.out.println("\nMedia de idade é maior que 60 anos");
		}
	}
}
