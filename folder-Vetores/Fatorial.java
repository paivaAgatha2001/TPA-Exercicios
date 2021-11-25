import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, a[], b[], fat, j;
		final int TAM = 15;
		a = new int [TAM];
		b = new int [TAM];
		
	
		for (i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º número: ");
			a[i] = in.nextInt();
		}
		
		System.out.println("FATORIAIS DOS NÚMEROS DIGITADOS: ");
		for (i=0;i<TAM;i++) {
			fat=  1;
			
			for (j=1;j<=a[i];j++) {
				fat = fat*j;
			}
			b[i] = fat;
			System.out.println(a[i]+" = "+b[i]);
		}
		in.close();
	}
}
