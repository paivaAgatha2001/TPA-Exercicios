import java.util.Scanner;

public class ConversaoDiasMesesAno {
	public static class ConversorDias {
		public static void main (String args[]) {
			Scanner input = new Scanner(System.in);
			int dias, meses, anos;
			System.out.println("Digite n�mero de dias:");
			dias = input.nextInt();
			meses = dias/30;
			anos = dias/365;
			System.out.println(dias+" dias convertido para meses � igual a: "+meses+" meses");
			System.out.println(dias+" dias convertido para anos � igual a: "+anos+" anos");
			input.close();
		}

	}

}
