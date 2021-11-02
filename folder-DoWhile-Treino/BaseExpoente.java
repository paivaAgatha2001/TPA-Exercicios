import java.util.Scanner;
public class BaseExpoente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int base, ex, i= 0, pot=1;
		
		System.out.println("escreva a base do n�mero: ");
		base = in.nextInt();
		System.out.println("escreva o expoente do n�mero: ");
		ex = in.nextInt();
		
		do {
			pot = pot*base;
			i++;
		}while(i < ex);
		System.out.println("a potencia do n�mero �: "+pot);
		in.close();
	}
	
}
