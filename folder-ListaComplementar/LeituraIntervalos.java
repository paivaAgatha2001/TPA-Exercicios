import java.util.Scanner;
public class LeituraIntervalos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=0,a=0,b=0,c=0,d=0;
		
		while(i>=0) {
			System.out.println("Digite um número: ");
			i=in.nextInt();
			
			if(i>= 0 && i <= 25) {
				a++;
			}else if(i>=26 && i<=50) {
				b++;
			}else if (i>=51 && i<=75) {
				c++;
			}else if (i>=76 && i <=100) {
				d++;
			}
		}
		System.out.println("{0-25} = "+a);
		System.out.println("{26-50} = "+b);
		System.out.println("{51-75} = "+c);
		System.out.println("{76-100} = "+d);
		
		in.close();
		
	}
}