package br.com.POO.prova;

import javax.swing.JOptionPane;

public class TarifaExecutiva extends Tarifa {

	private int itensRefeicao;

	public double Valor(double precoVoo) {
		itensRefeicao = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens do cardápio o passageiro escolheu?"));

		precoVoo = (precoVoo * 1.5) * ((0.01 * itensRefeicao) + 1);

		return precoVoo;
	}
}
