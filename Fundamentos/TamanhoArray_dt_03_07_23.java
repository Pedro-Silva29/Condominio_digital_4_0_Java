package Fundamentos;

public class TamanhoArray_dt_03_07_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,45};
		
		if(arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		}else {
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
	}

}