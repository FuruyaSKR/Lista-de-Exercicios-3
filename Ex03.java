import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	System.out.print("Informe seu nome: ");
	String nome = entrada.nextLine();
	while (nome.length() <= 3) {
		System.out.println("Nome muito curto!");
		System.out.print("Digite seu nome novamente: ");
		nome = entrada.nextLine();
	}
	
	System.out.print("Informe sua idade: ");
	int idade = entrada.nextInt();
	while ((idade < 0) || (idade > 150)) {
		System.out.print("Idade incorreta, digite novamente: ");
		idade = entrada.nextInt();
	}

	System.out.print("Informe seu Salario: ");
	float salario = entrada.nextFloat();
	while (salario <= 0 ) {
		System.out.println("Numero Invalido");
		System.out.print("Informe seu Salario: ");
		salario = entrada.nextFloat();
		
	}
	
	String sexo;
	
	System.out.println("Informe o sexo f/F m/M");
	sexo = entrada.next();
	while((!("f".equalsIgnoreCase(sexo))) && (!("m".equalsIgnoreCase(sexo)))) {
		System.out.print("Sexo Indefinido");
		System.out.println("Informe o sexo f/F m/M");
		sexo = entrada.next();
	}

	String estadoCivil;
	
	System.out.println("Informe seu Estado Civil 's','c','v','d'");
	estadoCivil = entrada.next();
	
	while ((!("s".equalsIgnoreCase(estadoCivil))) && (!("c".equalsIgnoreCase(estadoCivil))) && ((!("v".equalsIgnoreCase(estadoCivil))) && (!("d".equalsIgnoreCase(estadoCivil))))) {
		System.out.println("Estado Civil incorreto");	
		System.out.println("Informe seu Estado Civil 's','c','v','d'");
		estadoCivil = entrada.next();
	}
	}
}