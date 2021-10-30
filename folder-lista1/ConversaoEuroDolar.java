import java.util.Scanner;

public class ConversaoEuroDolar {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double reais, dolar, euro, resulDolar, resulEuro;
		System.out.println("Digite o valor em reais:");
		reais = input.nextDouble();
		System.out.println("Digite a cotação do dólar:");
		dolar = input.nextDouble();
		System.out.println("Digite a cotação do euro:");
		euro = input.nextDouble();
		resulDolar = reais/dolar;
		resulEuro = reais/euro;
		System.out.printf("O valor de reais inserido (R$"+reais+") se converte para: $%.2f dólares. %n", (resulDolar));
		System.out.printf("O valor de reais inserido (R$"+reais+") se converte para: €%.2f euros. %n", (resulEuro));
		input.close();
		
	}

}
