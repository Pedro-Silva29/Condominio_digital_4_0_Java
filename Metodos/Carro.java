package Metodos;

public class Carro {
	
	private String cor;
	private double preco;
	private String modelo;
	
	//Construtor padrão
		public Carro() {
		
		}

		//Construtor com 2 parâmetros
		public Carro(String modelo, double preco){
			
		//Se for o escolhido o construtor sem a COR do veículo 
		//defini a cor padrão sendo como PRETA
			
			this.cor = "PRETA";
			this.modelo = modelo;
			this.preco = preco;
		}
		
		//Construtor com 3 parâmetros
		public Carro(String cor, String modelo, double preco) {
			this.cor = cor;
			this.modelo = modelo;
			this.preco = preco;
		}
	}