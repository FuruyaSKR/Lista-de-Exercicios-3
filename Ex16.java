import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos números? ");
		int conj = entrada.nextInt();
		
		int menor = 100;
		int maior = 0;
		int soma = 0;
		
		for(int i = 0; i < conj; i++) {
			System.out.print("Digite um número: ");
			int num = entrada.nextInt();
			soma = num +soma;
			if (num < menor) {
				menor = num;
			}else if(num > maior) {
				maior = num;	
			}
		}
	System.out.println("menor: "+menor);
	System.out.println("maior: "+maior);
	System.out.println("Soma de todos os valores: "+soma);
	}

}
