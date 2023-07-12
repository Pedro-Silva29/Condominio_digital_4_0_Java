package Fundamentos;

public class dt_05_07_23_Exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] vida = {"A","vida","e","Bela"};
		
		for(int i = 0; i < vida.length; i++) {
			System.out.print((vida[i]).toUpperCase()+" ");
		}
		
		System.out.println("");
		
		for(int i = vida.length-1; i >=0 ; i--) {
			System.out.print((vida[i]).toUpperCase()+" ");
		}
	}

}
