public class JoaoPedro {
	public static void main(String[] args) {
		double joao, pedro;
		int i = 0;
		
		pedro = 145;
		joao = 134;
		
		while ( joao <= pedro ){
			pedro = pedro + 2;
			joao = joao + 2.5;
			i++;
		}
		
		System.out.println("Quantidade de anos que vai demorar para João ficar maior que Pedro é: "+i+" anos.");
	}
}
