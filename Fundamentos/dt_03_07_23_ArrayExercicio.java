package Fundamentos;
import java.util.Scanner;

public class dt_03_07_23_ArrayExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cass
		int A [] = new int[10];
		int B [] = new int[10];
		int C [] = new int[10];
		int D [] = new int[10];
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i < 10; i++) {
			System.out.println("Informe o valor para o array:");
			A[i] = teclado.nextInt();
		}
		
		for(int i=0; i < 10; i++) {
			System.out.print(A[i]);	
		}
			
		//for(n: i) {
			//System.out.println("");
		//}
		
		//System.out.println(A[i]);
		
	}

}
