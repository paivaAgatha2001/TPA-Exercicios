import java.util.Scanner;
public class DesafioCrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=0, j=0, a[], b[], r;
		
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i = 0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor A: ");
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		
		for(i=0; i<TAM;i++) {
			for(j=i+1;j<TAM;j++) {
				if(b[i] > b[j]) {
					r = b[i];
					b[i] = b[j];
					b[j]=r;
				}
			}
		}
		
		
		System.out.print("Vetor B em ordem Crescente: [ ");
		
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.print("]");
		in.close();
	}
}
