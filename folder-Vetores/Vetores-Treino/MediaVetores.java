import java.util.Scanner;
public class MediaVetores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, soma=0, media, a[];
		final int TAM = 10;
		
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"� n�mero: ");
			a[i] = in.nextInt();
		}
		for(i=0;i<TAM;i++) {
			soma = soma+a[i];
		}
		media = soma/TAM;
		
	
		System.out.println("Média: "+media);
		
		in.close();
	}
}
