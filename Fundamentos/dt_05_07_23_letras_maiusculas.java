package Fundamentos;

import java.util.Scanner;

public class dt_05_07_23_letras_maiusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um texto: ");
		String txt = teclado.nextLine();
		
		System.out.println("O seu texto em maiusculo:");
		System.out.println((txt).toUpperCase());
	}

}
