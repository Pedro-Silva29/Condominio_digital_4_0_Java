package Metodos;


public class UsoClasseMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciação_da_classe
		JavaMetodos metodos = new JavaMetodos();
		
		//criacao_variaveis
		String nome1 = metodos.nome();
		int idade = metodos.idade();
		double valor = metodos.valor();
		boolean estado = metodos.estado();
		
		
		System.out.printf(nome1);
		System.out.println(idade);
		System.out.println(valor);
		System.out.println(estado);
	}

}
