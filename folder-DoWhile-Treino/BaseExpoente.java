import java.util.Scanner;
public class BaseExpoente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int base, ex, i= 0, pot=1;
		
		System.out.println("escreva a base do número: ");
		base = in.nextInt();
		System.out.println("escreva o expoente do número: ");
		ex = in.nextInt();
		
		do {
			pot = pot*base;
			i++;
		}while(i < ex);
		System.out.println("a potência do número é: "+pot);
		in.close();
	}
	
}
