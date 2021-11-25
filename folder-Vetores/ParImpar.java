import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, a[], par=0, impar=0;
		final int TAM = 20;
		
		a = new int[TAM];
		
		for(i=0;i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"� n�mero: ");
			a[i] = in.nextInt();
			
			if(a[i]%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Quantidde de pares: "+par+" Quantidade de Impares: "+impar);
		
		int apar[], aimpar[];
		apar = new int[par];
		aimpar = new int[impar];
		
		int bpar = 0;
		int bimpar = 0;
		
		for(i=0;i<TAM; i++) {
			if(a[i]%2==0) {
				apar[bpar] = a[i];
				bpar++;
			}else {
				aimpar[bimpar] = a[i];
				bimpar++;
			}
		}
		
		System.out.print("[ ");
		for(i=0;i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	
		
		System.out.print("Vetor de pares: [ ");
		for(i=0;i<par; i++) {
			System.out.print(apar[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("Vetor de Impares: [ ");
		for(i=0;i<impar; i++) {
			System.out.print(aimpar[i]+" ");
		}
		System.out.print("]");
		
		in.close();
	}
}
