import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1,p=1,a=0, n;
		
		System.out.println("Digite o número de termos: ");
		n = in.nextInt();
		
    do {    
       p=p+a;
       a=p-a;
       i=i+1;
       System.out.println(p);
    }while(i < n);
    in.close();
}
}