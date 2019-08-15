import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas turmas são? ");
		int turmas = entrada.nextInt();
		
		float media = 0;
		
		int alunos; 
		
		for(int i = 0; i < turmas; i++) {
			System.out.print("Turma número "+(i + 1)+" tem quantos alunos? ");
			alunos = entrada.nextInt();
			while(alunos >= 40) { 
				System.out.println("\nO número de alunos deve ser inferior a 40");
				System.out.print("Digite novamente: ");
				alunos = entrada.nextInt();
			}
			media = media + alunos;		
			}
		media = media / turmas ;
		System.out.println("A média de alunos é: "+media+" alunos em "+turmas+" turmas.");
	}
}