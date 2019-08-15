import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float preco = 0;
		float media = 0;
		
		System.out.print("Quantos CD's você comprou? ");
		int cds = entrada.nextInt();
		
		for (int i = 0; i < cds; i++) {
			System.out.print("Pagou quanto no CD "+(i + 1)+"?\nR$: ");
			preco = entrada.nextFloat();
			media = media + preco;
		}
		
		DecimalFormat df= new DecimalFormat("00.##");
		String dx = df.format(media);
		
		System.out.println("\nO valor total investido na coleção de CD's é: R$ "+media);
		
		media = media / cds;
		dx = df.format(media);
		
		System.out.println("A média de preço gasto em cada CD's é: R$ "+dx);
	
	}

}
