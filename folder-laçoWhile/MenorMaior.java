import java.util.Scanner;
public class MenorMaior {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, idade, menor= 0, maior=0;
		while (i <= 10) {
			System.out.println("Escreva a idade: ");
			idade = in.nextInt();
			if ( idade >= 18) {
				System.out.println ("Sua idade é: "+idade+" anos, você é maior de idade");
				maior++;
			}else {
				System.out.println ("Sua idade é: "+idade+" anos, você é menor de idade");
				menor++;
			}
			i++;
		}
		System.out.println("Quantidade de maiores de idade: " +maior);
		System.out.println("Quantidade de menores de idade: " +menor);
		
		in.close();
	}	
}
