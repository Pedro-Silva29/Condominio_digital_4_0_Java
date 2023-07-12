package Fundamentos;

public class Multiplos_de_3_e_de_5_dt_03_07_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somatres = 0;
		int somacinco = 0;
		
		
		System.out.println("Os multiplos de 3 sao:");
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				System.out.print(i);
				System.out.println("");
				somatres = somatres+i;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("A soma dos múltiplos de 3 sao:");
		System.out.println(somatres);
		System.out.println("");
			
		System.out.println("Os múltiplos de 5 sao:");
		for(int i = 1; i <= 20; i++) {
			if(i % 5 == 0) {
				System.out.print(i);
				System.out.println("");
				somacinco = somacinco+i;
			}
		}
		System.out.println("--------------------------------");
		System.out.println("A soma dos múltiplos de 5 sao:");
		System.out.println(somacinco);
	}

}
