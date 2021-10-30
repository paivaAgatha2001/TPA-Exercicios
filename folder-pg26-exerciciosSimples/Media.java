import java.util.Scanner;

public class Media {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		System.out.println("Digite primeira nota:");
		n1 = input.nextDouble();
		System.out.println("Digite segunda nota:");
		n2 = input.nextDouble();
		System.out.println("Digite terceira nota:");
		n3 = input.nextDouble();
		System.out.println("Digite a quarta nota:");
		n4 = input.nextDouble();
		media = (n1+n2+n3+n4)/4;
		System.out.println("A média das quatro notas é "+media);
		input.close();
	}
}
