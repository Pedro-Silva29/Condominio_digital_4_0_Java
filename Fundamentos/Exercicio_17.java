package Fundamentos;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite [F] para Feminino ou [M] para masculino : ");
		char resp = entrada.next().charAt(0);
		
		if(resp != 'F' && resp != 'M' && resp != 'f' && resp != 'm')
		if(resp == 'F'){
			System.out.println("Feminino");
		}else if (resp == 'M'){
				System.out.println("Masculino");
			}else {
				System.out.println("Erro!");
			}	
		}
	}