package Fundamentos;

import java.util.Scanner;

public class Exerciocio_14 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite outro numero: ");
		double num2 = entrada.nextDouble();
		System.out.println("Digite mais um numero: ");
		double num3 = entrada.nextDouble();
		
				if(num1 > num2 && num1 > num3 && num3 < num2) {
					System.out.println(num1+" E maior!");
				}else {	
						if(num2 > num1 && num2 > num3 && num3 < num1) {
							System.out.println(num2+" E MAIOR!");
						}else {
								if (num3 > num1 && num3 > num2 && num1 < num2) {
									System.out.println(num3+" E MAIOR!");
								}else {
										System.out.println("numero inválido!");
										System.out.println("Digite novamente!");
								}
						}
				}
				if(num1 < num2 && num1 < num3 ) {
					System.out.println(num1+"É MENOR");
				}else {
					if(num2 < num1 && num2 < num1) {
						System.out.println(num1+"É MENOR");
					}
				//}else{
					if (num3 > num1 && num3 > num2 && num1 < num2) {
						System.out.println(num3+" E MAIOR!");
					}else {
							System.out.println("numero inválido!");
							System.out.println("Digite novamente!");
					}
			}
	}
}

