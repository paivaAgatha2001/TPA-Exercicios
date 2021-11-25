import java.util.Scanner;
public class ValorInvertidoVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, t, a[],b[];
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		t = 9;
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+i+"º número: ");
			a[i] = in.nextInt();
			b[t] = a[i];
			t--;
			
		}
		System.out.print("\n Vetor a = [ ");
		for (i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		System.out.print("\n Vetor b = [ ");
		for (i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		in.close();
	}
}
