import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, f = 1, i = 1 ; 
		
		System.out.println("Digite um n�mero:");
		n = in.nextInt();
		
		while ( i <= n ) {
			f = f*i;
			i++;
			
		}
		System.out.println("A fatorial do n�mero �: " +f);
		in.close();
	}
}

//public class Fatorial {
//public static void main(String[] args) {
//double i = 5;
//double f = i;

//while ( i > 1 ) {
	//f = f* (i-1);
	//i--;
	
//}
//System.out.println(f);
//}