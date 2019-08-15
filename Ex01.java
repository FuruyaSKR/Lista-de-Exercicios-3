import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor entre 0 e 10");
		int valor = entrada.nextInt();
		
		while (valor < 0 || valor > 10) {
			System.out.println("Valor invalido");
		System.out.println("Digite um valor valido");
		valor = entrada.nextInt();
		}
		entrada.close();
	}
	
}
