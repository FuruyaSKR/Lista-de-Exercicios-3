import java.util.Scanner;

public class Ex20 {
    public static void main(String[] arg) {
        
    	Scanner entrada= new Scanner(System.in);
        
    	int n;
        int nota;
        float media = 0;
        
        System.out.println("Quantas notas são? ");
        n = entrada.nextInt();
        for(int i =0; i < n;i++) {
            System.out.println("DIgite a nota: ");
            nota = entrada.nextInt();
            media = media + nota;
        }
        media = media / n;
        System.out.println("A media é: "+media);
        entrada.close();
    }
}