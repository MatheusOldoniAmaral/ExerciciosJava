package br.com.POO.ado2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		int resp = 0;
		
		do {
			System.out.println();
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Para qual pessoa, deseja enviar um email?" +
				"\nFuncionário (1)" + 
				"\nProfessor (2)" +
				"\nAluno (3)" ));
			
			switch(escolha) {
			case 1:
				Pessoa funcionario = new Funcionario();
				System.out.println("Qual o nome do funcionário?");
				String func = sc.next();
				funcionario.setNome(func);
				funcionario.status();
				break;
			
			case 2:
				Pessoa professor = new Professor();
				System.out.println("Qual o nome do professor?");
				String prof = sc.next();
				professor.setNome(prof);
				professor.status();
				break;
				
			case 3:
				Pessoa aluno = new Aluno();
				System.out.println("Qual o do nome aluno?");
				String alun = sc.next();
				aluno.setNome(alun);
				aluno.status();
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
			}
			escolha = JOptionPane.showConfirmDialog(null, "Deseja enviar mais um email? ");
		} while(resp == 0); 
	}
}

