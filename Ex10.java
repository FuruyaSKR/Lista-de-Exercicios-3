import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite um número: ");
	int num1 = entrada.nextInt();
	
	System.out.print("Digite o expoente de "+num1+": ");
	int pot1 = entrada.nextInt();
	
	int res = 1;
	int i = pot1;
	
	do {
		res = res * num1;
		i--;				
	}while ( i > 0);
	
	float result1 = res;
	
	System.out.print("Digite um número: ");
	int num2 = entrada.nextInt();
	
	System.out.println("Digite o expoente de "+num2+": ");
	int pot2 = entrada.nextInt();
	
	res = 1;
	i = pot2;
	
	do {
		res = res * num2;
		i--;				
	}while (i > 0);
	
	float result2 = res;
	
	
	System.out.println(num1+"^"+pot1+" = "+result1);
	System.out.println(num2+"^"+pot2+" = "+result2);
	res = 1;
	i = num2;
	do {
		res = res * num1;
		i--;				
	}while (i > 0);
	
	float result3 = res;
	
	System.out.println(num1+"^"+num2+" = "+result3);
	
	}

}
