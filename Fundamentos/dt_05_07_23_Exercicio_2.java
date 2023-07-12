package Fundamentos;

import java.util.Scanner;
import java.util.StringTokenizer;

public class dt_05_07_23_Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um texto:");
		String pub = teclado.nextLine();
		
		StringTokenizer exemplo = new StringTokenizer(pub);
		
		System.out.println(exemplo.countTokens());
	}
}
