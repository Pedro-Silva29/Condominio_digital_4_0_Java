package Fundamentos;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		// Primeira_aula_com_o_scanner 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double num = entrada.nextDouble();
		System.out.println("Digite seu nome completo: ");
		String resp = entrada.nextLine();
		
		System.out.println(num);
		System.out.println(resp);
	}

}
