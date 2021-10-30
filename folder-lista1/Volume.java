import java.util.Scanner;

public class Volume {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double raio, altura, volume;
		System.out.println("Digite o raio da lata:");
		raio = input.nextDouble();
		System.out.println("Digite a altura da lata:");
		altura = input.nextDouble();
		volume = 3.14*raio*raio*altura;
		System.out.println("O volume da lata é igual a "+volume);
		input.close();
		
	}

}


