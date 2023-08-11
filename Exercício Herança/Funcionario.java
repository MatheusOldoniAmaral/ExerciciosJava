package br.com.POO.ado2;

public class Funcionario extends Pessoa {
	
	@Override
	public void status() {
		super.status();
		
		System.out.printf("Você deve realizar o seus exames de rotina!");
	}
}
