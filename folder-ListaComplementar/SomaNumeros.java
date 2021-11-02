public class SomaNumeros {
	public static void main(String[] args) {
		
		int soma = 0, i=0;
		
		for (i=0; i <= 500; i++) {
			if ((i%2!=0)&&(i%3==0)){
				soma= soma+i;
				
			}
			
		}	
		System.out.println("A soma é: "+soma);
	}
}