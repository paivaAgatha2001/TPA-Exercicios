import java.util.Scanner;
public class GastoMedioCombustivel {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double km, gm, litros;
	
	System.out.println("Digite a distância percorrida pelo veículo: ");
	km = in.nextDouble();
	System.out.println("Digite a capacidade do tanque de combústivel: ");
	litros = in.nextDouble();
	
	gm = km/litros;
	
	System.out.println("Seu gasto médio é: "+gm);
	
	if (gm>=10) {
		System.out.println("Econômico");
	}else {
		System.out.println("Não econômico");
	}
	in.close();
	}	
}
