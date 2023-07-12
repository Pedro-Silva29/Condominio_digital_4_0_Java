package Fundamentos;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite duas notas: ");
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		
		double media;
	
		media = ((nota1+nota2)/2);
		
		System.out.println("A media é "+media);
	}

}
