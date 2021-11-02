import java.util.Scanner;
public class Torcedores {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int porc1=0, porc2=0, porc3=0, porc4=0, porc5=0, t, i=1;
	
	System.out.println("Digite qual time você torce");
	System.out.println("ATENÇÃO: use o sistemas de números");
	
	do {
		System.out.println("1-São Paulo, 2-Corinthians, 3-Palmeiras, 4-Santos, 5-Outros");
		t = in.nextInt();
		
		if (t==1) {
			porc1=porc1+10;
		}else if (t==2) {
			porc2=porc2+10;
		}else if (t==3) {
			porc3=porc3+10;
		}else if (t==4) {
			porc4=porc4+10;
		}else { 
			porc5=porc5+10;
		}
		i++;
	}while (i <= 10);
	System.out.println("São Paulo "+porc1+"%");
	System.out.println("Corinthians "+porc2+"%");
	System.out.println("Palmeiras "+porc3+"%");
	System.out.println("Santos "+porc4+"%");
	System.out.println("Outros "+porc5+"%");
	
	in.close();
	}
}