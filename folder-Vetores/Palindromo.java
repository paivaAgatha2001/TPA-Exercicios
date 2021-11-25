import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
		
		boolean vp = true;
		Scanner in = new Scanner(System.in);
		
		int i, a[], b = 0; 
		final int TAM = 10;
		a = new int [TAM];
		
		for(i = 0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do Vetor A: ");
			a[i] = in.nextInt();
		}
		for (i=TAM-1;i>=0;i--) {
			if(a[i]==a[b]) {
				vp = true;
			}else {
				vp = false;
			}
			b++;
		}
		if(vp) {
			System.out.println("O vetor é um palíndromo");
		}else {
			System.out.println("O vetor não é um palíndromo");
		}
		in.close();
	}
}
