package Fundamentos;
import java.util.Scanner;

public class dt_03_07_23_Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner leia = new Scanner(System.in);
		
		float array[] = new float[5];
		
		int soma = 0;
		float media = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Escreva a nota do aluno");
			array[i] = leia.nextFloat();
			soma += array[i];
			media += soma;
		}
	}

}
