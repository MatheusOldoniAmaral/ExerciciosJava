package br.com.POO.prova;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		String numeroVoo = JOptionPane.showInputDialog("Digite o número do vôo");
		String origem = JOptionPane.showInputDialog("Digite a origem do vôo");
		String destino = JOptionPane.showInputDialog("Digite o destino do vôo");
		String diaPartida = JOptionPane.showInputDialog("Digite o dia da partida do vôo");
		String diaChegada = JOptionPane.showInputDialog("Digite o dia de chegada do vôo");
		String horaPartida = JOptionPane.showInputDialog("Digite a hora de partida do vôo");
		String horaChegada = JOptionPane.showInputDialog("Digite a hora de chegada do vôo");
		int capacidadeAeronave = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de passageiros da Aeronave"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do vôo"));
		
		Voo voo = new Voo(numeroVoo, origem, destino, horaPartida, diaPartida, horaChegada, diaChegada, capacidadeAeronave, preco);

		String classes[] = { "ECONÔMICA", "EXECUTIVA" };

		Reserva reserva[] = new Reserva[capacidadeAeronave];

		int escolha;

		for (int i = 0; i < capacidadeAeronave; i++) {
			Reserva reserva1 = new Reserva();

			escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar um passageiro?");

			if (escolha == 0) {

				String classe;
				
				escolha = JOptionPane.showOptionDialog(null, "Classe do passageiro", "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classes, classes[0]);
				
				if (escolha == 0) {
					classe = "ECONÔMICA";
				} else {
					classe = "EXECUTIVA";
				}

				int numeroAssento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do assento"));

				reserva1 = new Reserva(voo, criarPassageiro(), numeroAssento, classe);

				reserva[i] = reserva1;

				System.out.println("INFORMAÇÕES DO VÔO");
				System.out.println(voo);
				System.out.println("---------------------------------------------------------------------");
				System.out.println("RESERVA DO PASSAGEIRO");
				System.out.println(reserva[i]);
				System.out.println("---------------------------------------------------------------------");
				
			}else {
				break;
			}
		}
	}

	public static Passageiro criarPassageiro() {
		String nome = JOptionPane.showInputDialog("Digite o nome do passageiro");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do passageiro"));
		String numeroPassaporte = JOptionPane.showInputDialog("Digite o número de passaporte do passageiro");
		Passageiro passageiro = new Passageiro(nome, idade, numeroPassaporte);

		return passageiro;
	}
}
