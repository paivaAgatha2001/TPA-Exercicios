import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double vHoraAula, nAulasDadas, pInss, salarioB, salarioL, descontoInss;
		
		System.out.println( "Digite o valor das horas da aula: ");
		vHoraAula = in.nextDouble();
		System.out.println( "Digite o n�mero de aulas dadas no m�s: ");
		nAulasDadas = in.nextDouble();
		System.out.println( "Digite o percentual de desconto do INSS: ");
		pInss = in.nextDouble();
		
		salarioB = vHoraAula*nAulasDadas;
		descontoInss = salarioB*pInss/100;
		salarioL = salarioB-descontoInss;
		
		System.out.println("O valor do Sal�rio l�quido �: "+salarioL++);
		
		in.close();}
	}

