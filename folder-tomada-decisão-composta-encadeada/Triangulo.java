import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o primeiro valor: ");
		a = in.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = in.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = in.nextInt();
		
		if ( a > b+c || b > a+c || c >a+b) {
			System.out.println("Não é um triângulo");
		}else if (a == b && b == c) {
			System.out.println("O triângulo é Equilátero");
		}else if (a!=b && b!=c && a!=c) {
			System.out.println("O triângulo é  Escaleno");
		}else {
			System.out.println("O triângulo é Isósceles");
			
			in.close();
		}
	}
}
