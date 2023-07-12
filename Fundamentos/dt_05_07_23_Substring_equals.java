package Fundamentos;

public class dt_05_07_23_Substring_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";//true
		String s2 = "HELLO";//true
		boolean b1 = s1.equals("Hello"); //true
		boolean b2 = s1.equals(s2); //false
		boolean b3 = s1.equalsIgnoreCase(s2); //true
		boolean b4 = s1.equalsIgnoreCase("Azul"); //false
		
		//
		System.err.println(s1);
		System.err.println(s2);
		System.err.println(b1);
		System.err.println(b2);
		System.err.println(b3);
		System.err.println(b4);
		
		//Uso do Length
		String s = "abc";
		int tam = s.length();//3
		
		System.out.println(tam);
	}
}
