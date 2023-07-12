package Metodos;

import javaPOO.AtributosClasses;

public class UsoDoMetodoSomar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SomarMetodos somadosmetodos = new SomarMetodos();
				
		int res = somadosmetodos.somar(10, 4);
		System.out.println("A soma dos numeros e: "+res);
		
		//execucao_da_calculo_media
		
		float media = somadosmetodos.media(3,3);
		System.out.println("A media dos numeros e: "+media);
		
		float media1 = somadosmetodos.media(3,3,3);
		System.out.println("A media dos numeros e: "+media1);
	}
				
}
