import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int aI = 0, aF, anoB = 0;
		
		System.out.println("Digite o ano Inicial:");
		aI=in.nextInt();
		System.out.println("Digite o ano Final:");
		aF=in.nextInt();
		
		do {
			if((aI % 4 == 0) && (aI % 100 != 0) || (aI % 400 == 0)) {
			System.out.println("O ano " +aI+ " é bissexto");
			anoB = anoB+1;
			}else {
				System.out.println("O ano " +aI+ " não é bissexto");
			}
			aI++;
		}while(aI<=aF);
		System.out.println("A quantidade de anos bissextos são: "+anoB);
		in.close();
	}
}
