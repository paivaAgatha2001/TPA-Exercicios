import java.util.Scanner;
public class Equacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c, rDelta, delta, x1, x2;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = in.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = in.nextDouble();
		
		delta = (b*b)-4*a*c;
		
		if (delta<0) {
			System.out.println("N�o existem ra�zes reais para essa equa��o");
		}else if (delta == 0) {
			x1 = (-b)/(2*a);
			System.out.println("Existe uma ra�z real");
			System.out.println("x1 = "+x1);
		}else {
			rDelta = Math.sqrt(delta);
			x1 = (-b+rDelta)/(2*a);
			x2 = (-b-rDelta)/(2*a);
			System.out.println("Existem duas ra�zes para essa equa��o");
			System.out.println("x1 = "+x1+" x2 = "+x2);
			
			in.close();
		}
	} 
}
