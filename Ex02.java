import java.util.Scanner;

public class Ex02 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome de usuario: ");
		String usuario = entrada.next();
		
		System.out.println("Senha :");
		String senha = entrada.next();
			
				while ((usuario).equalsIgnoreCase(senha)) {
					System.out.println("Coloque uma senha diferente do nome de usuario!");
					senha = entrada.nextLine();
		}
		
	}
}
