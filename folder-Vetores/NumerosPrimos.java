import java.util.Scanner;
public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, i, a[], rest0 = 0, j;
		final int TAM = 5;
		a = new int[TAM];
		
		for(j=0;j<TAM;j++) {
			rest0=0;
			System.out.println("Entre com um número:");
			a[j] = in.nextInt();
			
			for (i=1;i<=a[j];i++) {
				if (a[j]%i==0) {
					rest0++;
				}
			}
			if (rest0 > 2) {
				System.out.println("Não é número primo");
			}else {
				System.out.println("É número primo");
			}
		}
		in.close();
	}
}
