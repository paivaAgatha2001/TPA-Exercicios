import java.util.Scanner;
public class Ipva {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		double valorV, ipva;
		
		System.out.println("Digite o valor do veículo:");
		valorV = in.nextDouble();
		ipva = (valorV*4)/100;
		System.out.println("O valor do IPVA do veículo é de: R$"+ipva);
		
		in.close();
		
	}
}
