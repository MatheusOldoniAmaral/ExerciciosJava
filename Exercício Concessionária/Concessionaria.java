package br.com.ED.ado01;

import javax.swing.JOptionPane;

public class Concessionaria {
public static void main(String[] args) { 
	int resp = 0;
	
	do { 
		System.out.println();
		VetorObjeto carros = new VetorObjeto(3);
		Carro carro = new Carro();
		String marcas[] = {"Volkswagem", "Chevrolet", "Fiat", "Ford", "BMW", "Mercedez" };
		int escolhaMarcas = Integer.parseInt(JOptionPane.showInputDialog("Escolha a marca do carro que deseja comprar: " + 
			"\nVolkswagem (1)" +
			"\nChevrolet (2)" +
			"\nFiat (3)" +
			"\nFord (4)" +
			"\nBMW (5)" +
			"\nMercedez (6)"));
		carro.setMarcaCar(marcas[escolhaMarcas - 1]); 
		System.out.println(carro.getMarcaCar());
		
		String nomesCarros = JOptionPane.showInputDialog("Digite o nome do carro da marca que foi selecionada");
		carro.setNomeCar(nomesCarros);
		System.out.println(carro.getNomeCar());
		
		int anoCar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
		carro.setAnoCar(anoCar);
		System.out.println(carro.getAnoCar());
		
		String cores[] = {"Branco", "Preto", "Prata", "Vermelho", "Azul"};
		int escolhaCores = Integer.parseInt(JOptionPane.showInputDialog("Escolha a cor do carro: " + 
				"\nBranco (1)" +
				"\nPreto (2)" +
				"\nPrata (3)" +
				"\nVermelho (4)" +
				"\nAzul (5)" ));
		carro.setCorCar(cores[escolhaCores - 1]);
		System.out.println(carro.getCorCar());
		
		JOptionPane.showMessageDialog(null, "Marca: " + carro.getMarcaCar() + "\n Modelo: " + carro.getNomeCar() + "\nAno: " + carro.getAnoCar() + "\nCor: " + carro.getCorCar());
		
		resp = JOptionPane.showConfirmDialog(null, "Deseja resevar mais um carro? ");
		
		try {
			carros.adiciona(carro);
		}catch(Exception e){
			e.printStackTrace();
		}
	} while(resp == 0); } 
}
