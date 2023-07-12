package Fundamentos;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double num = entrada.nextDouble();
		
		if(num == 0){
			System.out.println("É IGUAL A ZERO!");
		}else{
			if(num % 2 == 0) {
				System.out.println("POSITIVO");
			}else {
				System.out.println("NEGATIVO");
			}
		}
	}

}
