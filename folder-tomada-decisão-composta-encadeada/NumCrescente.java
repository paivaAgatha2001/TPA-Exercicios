import java.util.Scanner;
public class NumCrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o n�mero de A: ");
		a = in.nextInt();
		System.out.println("Digite o valor de B: ");
		b = in.nextInt();
		System.out.println("Digite o valor de C:");
		c = in.nextInt();
		
		if (a < b && b < c) {
			System.out.println("A ordem crescente �: "+a+"-"+b+"-"+c);
		}else if (a < c && c < b) {
			System.out.println("A ordem crescente �: "+a+"-"+c+"-"+b);
		}else if (b < a && a < c) {
			System.out.println("A ordem crescente �: "+b+"-"+a+"-"+c);
		}else if (b < c && c <a){
			System.out.println("A ordem crescente �: "+b+"-"+c+"-"+a);
		}else if (c < a && a < b) {
			System.out.println("A ordem crescente �: "+c+"-"+a+"-"+b);
		}else {
			System.out.println("A ordem crescente �: "+c+"-"+b+"-"+a);
		}
in.close();
	}
}

