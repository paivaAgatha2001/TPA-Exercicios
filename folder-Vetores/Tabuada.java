import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, a[], j;
		final int TAM = 5;
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"º número: ");
			a[i]=in.nextInt();
			
			for(j=1;j<=10;j++) {
				 System.out.println(a[i]+"x"+j+" = "+(a[i]*j));
			}
		}
		in.close();
	}
}
