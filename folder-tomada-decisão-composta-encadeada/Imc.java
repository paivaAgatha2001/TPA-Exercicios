import java.util.Scanner;
public class Imc {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double p, a, imc;
		
		System.out.println("Digite o seu peso: ");
		p = in.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		a = in.nextDouble();
		
		imc = p/(a*a);
		
		System.out.println("Seu IMC �: "+imc);
		
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
		} else if (imc>=18.5 && imc <=25) {
			System.out.println("Peso normal");
		}else if  (imc>25 && imc <=30) {
			System.out.println("Excesso de peso");
		} else if(imc>30 && imc <=35) {
			System.out.println("Obesidade Grau I");
		}else if (imc>35 && imc <=40) {
			System.out.println("Obesidade Grau II");
		}else {
			System.out.println("Obesidade Grau III");
		}
		
		in.close();
				
	}
}


