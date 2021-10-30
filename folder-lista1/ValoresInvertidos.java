import java.util.Scanner;

public class ValoresInvertidos {
	
		public static void main (String args[]) {
			Scanner in = new Scanner (System.in);
			int a, b, c;
			System.out.println("Escreva valor de A:");
			a = in.nextInt();
			System.out.println("Escreva valor de B:");
			b = in.nextInt();
			c = a;
			a = b;
			b = c;
			
			System.out.println("Valor de A:"+a);
			System.out.println("Valor de B:"+b);
			in.close();
		}

	}

