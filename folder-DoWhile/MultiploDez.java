public class MultiploDez {
	public static void main(String[] args) {
		
		int i=1;
		
		do {
			if(i % 10 == 0) {
			System.out.println(i+" - M�ltiplo de 10");
			}else {
				System.out.println(i+" N�o � m�ltiplo de 10");
			}
			i++;
		}while(i<=300);
	}
}
