import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, f = 1, i = 1 ; 
		
		System.out.println("Digite um n�mero:");
		n = in.nextInt();
		
		do {
			f = f*i;
			i++;
		}while( i <= n );
		System.out.println("A fatorial do n�mero �: " +f);
		in.close();
	}
}
