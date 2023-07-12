package Fundamentos;
import java.util.Scanner;

public class impares_e_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = entrada.nextInt(); 
		
		//IMPRESSAO DOS NUMEROS PARES 

		System.out.println("IMPRESSAO DOS IMPARES: ");
			int i = 1;
			while(i < num) {
				if(i % 2 == 1) {
					System.out.print(i+" ");
				}
				i++;
			}
			System.out.println("");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("IMPRESSAO DOS PARES: ");
			int n = 1;
			while(n < num) {
				if(n % 2 == 0) {
					System.out.print(n+" ");
				}
				n++;
			}
			
	}

}
