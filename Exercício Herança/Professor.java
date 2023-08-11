package br.com.POO.ado2;

public class Professor extends Pessoa {
	
	@Override
	public void status() {
		super.status();
		
		System.out.printf("Você estará 1 mês de férias, a partir de semana que vem!");
	}
} 
