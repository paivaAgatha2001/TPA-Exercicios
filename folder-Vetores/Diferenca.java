import java.util.Scanner;
public class Diferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, a[], b[], j, k;
		final int TAM = 3;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor A: ");
			a[i] = in.nextInt();
		}
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor B: ");
			b[i] = in.nextInt();
		}
		
		for(i=0;i<TAM; i++) {
			for(j=0;j<TAM;j++) {
				if(b[i]==a[j]) {
				a[j] = 0;
				}
			}
		}
		System.out.print("Diferença dos conjuntos de A e B = [ ");
		for(k=0;k<TAM; k++) {
			if(a[k]!=0) {
				System.out.print(a[k]+" ");
			}
		}
		System.out.print("]");
	}
}
