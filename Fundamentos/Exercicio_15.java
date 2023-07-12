package Fundamentos;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite um dia da semana de acordo com um número: ");
		System.out.println("[1] - Domingo");
		System.out.println("[2] - segunda-feira");
		System.out.println("[3] - terça-feira");
		System.out.println("[4] - quarta-feira");
		System.out.println("[5] - quinta-feira");
		System.out.println("[6] - sexta-feira");
		System.out.println("[7] - Sabado");
		
		Scanner entrada = new Scanner(System.in);
		int diadasemana = entrada.nextInt();
		
		switch(diadasemana) {

		case 1:
			System.out.println("Domingo!");
		break;

		case 2:
		// bloco de código que será executado
			System.out.println("Segunda-feira!");

		break;

		case 3:

		// bloco de código que será executado
			System.out.println("terça-feira");
		break;
		
		case 4:
			
			// bloco de código que será executado
			System.out.println("quarta-feira");
			break;
			
		case 5:
			
			// bloco de código que será executado
			System.out.println("quinta-feira");
			break;
			
		case 6:
			
			// bloco de código que será executado
			System.out.println("sexta-feira");
			break;
			
		case 7:
			
			// bloco de código que será executado
			System.out.println("Sabado");
			break;

		default:

		// bloco de código que será executado se nenhum dos cases for aceito
			System.out.println("Número inválido!");
			System.out.println("Tente novamente!");
		}
	}

}
