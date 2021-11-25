import java.util.Scanner;
public class QuadradoA {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in); 
		
		int i, a[], b[];
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i = 0; i < TAM; i++ ) {
			System.out.println("Digite o "+(i+1)+"º valor:");
			a[i] = in.nextInt();
		}
			System.out.print("\n Vetor A = ");
		for(i = 0; i < TAM; i++ ) {
			System.out.print(a[i]+" ");
		
		}
			System.out.print("\n Vetor B = ");
		for(i = 0; i < TAM; i++ ) {
			b[i] = a[i]*a[i];	
			System.out.print(b[i]+"  ");
		}
		in.close();
	}
}
