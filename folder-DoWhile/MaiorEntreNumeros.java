import java.util.Scanner;
public class MaiorEntreNumeros {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, maior=0, i, q;
		
		do {
			i = 0;
			System.out.println("Digite uma quantidade de n�meros:");
			q=in.nextInt();
			
			if(q == 0) {
				System.out.println("Fim do programa :)");
			}else {
				do {
					System.out.println("Digite os n�meros:");
					n=in.nextInt();
					
					if (n > maior) {
						maior = n;
					}else {
						maior = maior;
					}
					i++;
				}while(i < q);
				System.out.println("O n�mero maior �: "+maior);
			}
		}while (q !=0 );
		in.close();
	}
}
