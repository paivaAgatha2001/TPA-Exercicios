import java.util.Scanner;
public class Desconto {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		double preco, desconto, precoDesc, preco2;
		
		System.out.println("Digite o preço do produto:");
		preco = in.nextDouble();
		System.out.println("Digite o valor do desconto:");
		desconto = in.nextDouble();
		precoDesc = (preco*desconto)/100;
		preco2 = preco-precoDesc;
		System.out.println("O preço do produto com desconto será: R$"+preco2);
		
		in.close();
		
	}
}
