package br.com.POO.ado1;

public class Autenticacao {
	private String login;
	private String senha;
	private Double saldo;

	public Autenticacao() {
		saldo = 0.0;
	}

	public Autenticacao(String login, String senha) {
		this();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	} 

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Operação não realizada! Valor maior que o disponível em conta!");
		} else {
			saldo = saldo - valor;
		}
	}
}
