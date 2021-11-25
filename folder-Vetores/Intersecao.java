import java.util.Scanner;
public class Intersecao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, a[], b[], c[], inter; 
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor A: ");
			a[i] = in.nextInt();
		}
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor B: ");
			b[i] = in.nextInt();
		}
		
		System.out.print("Interseção de A e B = [ ");
		for(i=0;i<TAM; i++) {
			for(inter=0;inter<TAM; inter++) {
				if(a[i]==b[inter]) {
					c[inter] = a[i];
					System.out.print(c[inter]+" ");
				}
			}
		}
		System.out.print("]");
		in.close();
	}
}
