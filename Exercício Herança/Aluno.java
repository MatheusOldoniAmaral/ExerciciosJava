package br.com.POO.ado2;

public class Aluno extends Pessoa{
	
	@Override
	public void status() {
		super.status();
		
		System.out.printf("Você está sendo convocado para comparecer a secretária!");
	}
}
