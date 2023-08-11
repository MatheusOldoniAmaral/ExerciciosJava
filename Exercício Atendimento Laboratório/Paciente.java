package br.com.ED.ado2;

import javax.swing.JOptionPane;

public class Paciente {
	private String nome;
	int idade;
	boolean PCD;

	public Paciente() {

	}

	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		if (this.getPCD() || this.getIdade() > 60)
			return "Paciente [nome = " + this.getNome() + ", idade = " + this.getIdade() + ", PCD = Sim] PREFERENCIAL";
		else
			return "Paciente [nome = " + this.getNome() + ", idade = " + this.getIdade() + ", PCD = Não]";
	}
 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getPCD() {
		return PCD;
	}

	public void setPCD(int resposta) {
		resposta = JOptionPane.showConfirmDialog(null, "Você é portador de deficiência?", "Pergunta",
				JOptionPane.YES_NO_OPTION);
		this.PCD = (resposta == JOptionPane.YES_OPTION);
	}

}

