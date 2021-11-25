public class PotenciaBase {
	public static void main(String[] args) {
		
		int i, potencia = 1, a[];
		final int TAM = 11;
		a = new int[TAM];
		
		for (i=0;i<TAM;i++) {
			a[i] = potencia;
			
			System.out.println("A[i] = 2 elevado a "+i+" = "+a[i]);
			
			potencia = potencia*2;
		}
	}
}
