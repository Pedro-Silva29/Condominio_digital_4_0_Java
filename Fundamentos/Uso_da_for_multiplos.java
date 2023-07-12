package Fundamentos;

public class Uso_da_for_multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<100; i++) {
			if(i % 3 == 0) {
				System.out.print(i);
				System.out.println();
			}	
			if(i % 1 == 0) {
					System.out.print(i);	
				System.out.println();
			}
	
			if(i % 100 == 0) {
				System.out.print(i);	
				System.out.println();
			}
		}
			
		}	
  }
