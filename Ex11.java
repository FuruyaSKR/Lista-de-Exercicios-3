import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);	
			
	int[] vetor = new int [10]; 
	int soma = 0;
	int par = 0;
	int impar = 0;
	
	for (int x = 0; x < 10; x++) {
		System.out.print("\nDigite um n�mero inteiro: ");
		vetor[x] = entrada.nextInt();
		soma = soma + vetor[x]; 
		if (vetor[x]%2 == 0) {
			System.out.println("\nNumero par");
			par++;
		}else if(vetor[x]% 2 != 0 ) {
			System.out.println("\nN�mero impar");
		impar++;
		}
		}	
	System.out.println("\nN�meros impares: "+impar);
	System.out.println("\nN�meros Pares: "+par);
	
	}
}


