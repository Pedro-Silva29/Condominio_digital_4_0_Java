package Fundamentos;
import java.util.Scanner;

public class Exercicio_AlunosTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos na sua sala: ");
		float aluno = teclado.nextFloat();
		
		float soma = 0;
		float qt = 0;
		float media = 0;
		while(qt < aluno) {
			System.out.println("Digite a nota do aluno:");
			float nota = teclado.nextFloat();
			qt = qt + 1;
			soma += nota;
		}
		media = soma/qt;
		System.out.println("A media e: "+media);
	}

}
