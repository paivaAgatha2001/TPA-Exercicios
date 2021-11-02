import java.util.Scanner;
public class CalcularAltura {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i;
		double a, maior=0, menor=9999;
		
		for(i=1;i<5;i++) {
			System.out.println("Escreva sua altura: ");
			a= in.nextDouble();
			
			
			if (a>maior) {
				maior=a;
				
				
			}else if(a<menor){
				menor=a;
				
			}
			
			
		}
		System.out.println("o menor �: "+menor+" o maior �: "+maior);
		in.close();
	}
	
}
