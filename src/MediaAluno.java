import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a nota 1:");
		 nota1 = s.nextDouble();
		 
		 System.out.println("Digite a nota 2:");
		 nota2 = s.nextDouble();
		 
		 System.out.println("Digite a nota 3:");
		 nota3 = s.nextDouble();
		 
		 System.out.println("Digite a nota 4:");
		 nota4 = s.nextDouble();
		 
		 media = (nota1+nota2+nota3+nota4)/4;
		 
		 if (media >=7) {
			 System.out.println("Média = " + media + " Aluno aprovado!");
		 }else if (media >=5) {
			 System.out.println("Média = " + media + " Aluno em recuperação!");
		 }else {
			 System.out.println("Média = " + media + " Aluno reprovado!");
		 }
			 
	}
}
