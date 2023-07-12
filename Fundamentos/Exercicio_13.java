package Fundamentos;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double num = entrada.nextDouble();
		System.out.println( num == 0 ? "É IGUAL A ZERO!" : (num>0 ? "POSITIVO" : "NEGATIVO"));
	}

}
