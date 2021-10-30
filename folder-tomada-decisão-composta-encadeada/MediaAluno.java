import java.util.Scanner;
public class MediaAluno {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, media, media2, exame;
		
		System.out.println("Digite a primeira nota:");
		nota1 = in.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = in.nextDouble();
		
		media = (nota1+nota2)/2;
		System.out.println("A média do aluno é: "+media);
		
		if (media < 3) {
			System.out.println("O aluno está reprovado");
		}else if (media >=6){
			System.out.println("O aluno está aprovado");
		}else if(media>=3 && media<6) {
			System.out.println("O aluno está em exame, digite a nota do exame:");
			exame = in.nextDouble();
			media2 = (media+exame)/2;
			 if(media2 >=6){
			System.out.println("O aluno está aprovado");
		}else {
			System.out.println("O aluno está reprovado");
		}
			 in.close();
		}
	}
}
