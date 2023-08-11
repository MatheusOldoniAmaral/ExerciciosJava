package br.com.POO.ado2;

public class Pessoa {
	private String nome;
	private String escolha;
	private String email;
	
	public Pessoa() {
		
	}

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String opc) {
		this.escolha = opc;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void status() {
		System.out.println("Olá " + nome + ", informamos que: ");
	}
}
