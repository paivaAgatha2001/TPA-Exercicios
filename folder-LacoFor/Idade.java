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
		System.out.println(" a quantidade de pessoas menores de idade �: "+idA);
		System.out.println(" a quantidade de pessoas entre 16 at� 30 anos �: "+idB);
		System.out.println(" a quantidade entre 31 at� 45 anos de idade �: "+idC);
		System.out.println(" a quantidade  entre 46 at� 60 anos de idade �: "+idD);
		System.out.println(" a quantidade de maiores de 61 anos de idade �: "+idE);
		
		System.out.println("PORCENTAGEM: ");
		
		System.out.println("a porcentagem de pessoas menores de idade �: "+porcA+"%");
		System.out.println("a quantidade de pessoas entre 16 at� 30 anos � "+porcB+"%");
		System.out.println("a quantidade entre 31 at� 45 anos de idade �: "+porcC+"%");
		System.out.println(" a quantidade  entre 46 at� 60 anos de idade �: "+porcD+"%");
		System.out.println("a quantidade de maiores de 61 anos de idade �: "+porcE+"%");
		
		in.close();
	}
}