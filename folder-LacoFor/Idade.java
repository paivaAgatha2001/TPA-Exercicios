import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, idA=0, idB=0, idC=0, idD=0, idE=0, idade;
		double porcA, porcB, porcC, porcD, porcE;
		
		for (i=0; i <= 5; i++) {
			System.out.println("Digite sua idade: ");
			idade= in.nextInt();
			
			if(idade <= 15) {
				
				idA++;
			}else if (idade >= 16 && idade <=30) {
				
				idB++;
			}else if (idade >= 31 && idade <=45) {
				
				idC++;
			}else if (idade >= 46 && idade <=60) {
				
				idD++;
			}else {
				
				idE++;
			}
		}
		
		porcA=idA*100/15;
		porcB=idB*100/15;
		porcC=idC*100/15;
		porcD=idD*100/15;
		porcE=idE*100/15;
		
		System.out.println("QUANTIDADE: ");
		System.out.println(" a quantidade de pessoas menores de idade é: "+idA);
		System.out.println(" a quantidade de pessoas entre 16 até 30 anos é: "+idB);
		System.out.println(" a quantidade entre 31 até 45 anos de idade é: "+idC);
		System.out.println(" a quantidade  entre 46 até 60 anos de idade é: "+idD);
		System.out.println(" a quantidade de maiores de 61 anos de idade é: "+idE);
		
		System.out.println("PORCENTAGEM: ");
		
		System.out.println("a porcentagem de pessoas menores de idade é: "+porcA+"%");
		System.out.println("a quantidade de pessoas entre 16 até 30 anos é "+porcB+"%");
		System.out.println("a quantidade entre 31 até 45 anos de idade é: "+porcC+"%");
		System.out.println(" a quantidade  entre 46 até 60 anos de idade é: "+porcD+"%");
		System.out.println("a quantidade de maiores de 61 anos de idade é: "+porcE+"%");
		
		in.close();
	}
}