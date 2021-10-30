public class MultiploDez {
	public static void main(String[] args) {
		
		int i=1;
		
		do {
			if(i % 10 == 0) {
			System.out.println(i+" - Múltiplo de 10");
			}else {
				System.out.println(i+" Não é múltiplo de 10");
			}
			i++;
		}while(i<=300);
	}
}
