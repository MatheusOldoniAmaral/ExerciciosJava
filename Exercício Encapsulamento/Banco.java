package br.com.POO.ado1;

import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Autenticacao aut = new Autenticacao();
		int contador = 3;
		boolean acesso = false;
		int escolha = 0;

		System.out.printf("BEM-VINDO AO SISTEMA!\nCadastre-se no nosso sistema, digite seu login!" + "\nLOGIN: ");

		aut.setLogin(input.next());

		System.out.print("SENHA: ");

		aut.setSenha(input.next());

		System.out.printf("\nFaça seu login: ");

		do {
			System.out.printf("\nLOGIN: ");
			String testeLogin = input.next();

			System.out.printf("SENHA: "); 
			String testeSenha = input.next();

			if (testeLogin.equals(aut.getLogin()) && testeSenha.equals(aut.getSenha())) {
				acesso = true;
				System.out.println("\nAcesso Autorizado!");
			} else {
				System.out.println("Acesso Não-Autorizado! Restam " + (contador - 1) + " tentativas!");
				contador--;
			}

			if (contador == 0) {
				System.out.println("Limite de tentativas excedido! Acesso Bloqueado!");
				acesso = false;
				break;
			}

		} while (acesso == false && contador > 0);

		if (acesso == true) {
			do {
				System.out.println("Qual operação deseja fazer?\nSALDO DA CONTA R$ " + aut.getSaldo()
						+ "\n 1 - DEPOSITAR\n 2 - SACAR\n 3 - SAIR");
				escolha = input.nextInt();

				switch (escolha) {
				case 1:
					System.out.printf("\nDigite o valor a depositar: R$ ");
					aut.depositar(input.nextDouble());
					break;
				case 2:
					System.out.printf("\nDigite o valor a sacar: R$ ");
					aut.sacar(input.nextDouble());
					break;
				case 3:
					System.out.println("FIM DO PROGRAMA!");
					break;
				default:
					System.out.println("Digite uma opção Válida!");
					break;
				}

			} while (escolha != 3);

			System.out.println("SALDO DA CONTA R$ " + aut.getSaldo());
		}
		
		input.close();
	}
}
