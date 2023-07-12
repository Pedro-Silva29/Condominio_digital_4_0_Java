package Fundamentos;

public class dt_03_07_23_concatenacao_de_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Oi";
		String texto = str + "Mundo";
		
		int tres = 3;
		String resultadoFinal = 3 + " palavra "+"tres";
		System.out.println(resultadoFinal);
		
		String d = texto.toUpperCase();
		System.out.println(d);
		
		String str1 = "Hello";
		char c = str1.charAt(1);
		System.err.println(c);
	}

}
