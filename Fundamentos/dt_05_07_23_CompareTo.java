package Fundamentos;

public class dt_05_07_23_CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor = "CDD4.0 - Java";
		
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA") == 0 ? true : false);
		

		System.out.println("\nOutro exercicio:");

		//outro_exercicio_endswith_startswith
		
		String valor1 = "CDD - Java";
		
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD",1));
		
		String nome = "testando daidara";
		
		System.out.println(nome.length());
	}

}
