import java.util.Scanner;
public class Idade {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int id, aN, aA;
	
	System.out.println("Digite o ano que voc� nasceu:");
	aN = in.nextInt();
	
	System.out.println("Digite o ano atual:");
	aA = in.nextInt();
	
	id = aA-aN;
	System.out.println("Sua idade �: "+id);
	
	if (id<10) {
		System.out.println("Crian�a");
	}else if (id>=10 && id<18) {
		System.out.println("Adolescente");
		}else if (id>=18 && id<60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
	in.close();
	}	
}
