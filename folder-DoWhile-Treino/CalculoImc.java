import java.util.Scanner;
public class CalculoImc {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		char  opcao;
		double p, a, imc;
		
		do {
			System.out.println("Digite o seu peso: ");
			p = in.nextDouble();
			
			System.out.println("Digite a sua altura: ");
			a = in.nextDouble();
		
		imc = p/(a*a);
		
		System.out.println("Seu IMC é: "+imc);
		System.out.println ("deseja continuar?S/N");
		opcao = in.next().charAt(0);
	}while (opcao == 'S');
	in.close();
	}
}
