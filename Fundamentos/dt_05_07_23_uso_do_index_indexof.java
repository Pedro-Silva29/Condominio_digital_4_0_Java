package Fundamentos;

public class dt_05_07_23_uso_do_index_indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello world world2";
		int pos = str.indexOf("\ni");//2
		
		System.out.println(pos);
		
		//outro_exercicio_(complemento)
		int pos1 = str.lastIndexOf("l");//15
		
		System.out.println(pos1);
		
		
	}

}
