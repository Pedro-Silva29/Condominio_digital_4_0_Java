package Fundamentos;

public class Exercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 15;
		if (idade < 18) {
			System.out.println("Nao pode entrar!");
		}else {
			System.out.println("Pode entrar!");
		}
		System.out.println(idade == 15 ? idade < 18 : idade);
	}

}
