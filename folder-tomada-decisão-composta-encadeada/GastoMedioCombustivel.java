import java.util.Scanner;
public class GastoMedioCombustivel {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double km, gm, litros;
	
	System.out.println("Digite a dist�ncia percorrida pelo ve�culo: ");
	km = in.nextDouble();
	System.out.println("Digite a capacidade do tanque de comb�stivel: ");
	litros = in.nextDouble();
	
	gm = km/litros;
	
	System.out.println("Seu gasto m�dio �: "+gm);
	
	if (gm>=10) {
		System.out.println("Econ�mico");
	}else {
		System.out.println("N�o econ�mico");
	}
	in.close();
	}	
}
