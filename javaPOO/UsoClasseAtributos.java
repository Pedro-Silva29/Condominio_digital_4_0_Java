package javaPOO;

public class UsoClasseAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtributosClasses cliente01 = new AtributosClasses();
		
		System.out.println(cliente01.fnome);
		System.out.println(cliente01.Inome);
		System.out.println(cliente01.idade);
		System.out.printf("O aluno %s %s tem %d anos",cliente01.fnome, cliente01.Inome, cliente01.idade);
	}

}